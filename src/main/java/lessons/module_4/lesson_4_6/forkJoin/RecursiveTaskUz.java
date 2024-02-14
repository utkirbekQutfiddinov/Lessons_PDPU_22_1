package main.java.lessons.module_4.lesson_4_6.forkJoin;

import java.util.concurrent.RecursiveTask;

public class RecursiveTaskUz extends RecursiveTask<Integer> {


    private final int[] nums;
    private final int from;
    private final int to;

    public RecursiveTaskUz(int[] nums, int from, int to) {
        this.nums = nums;
        this.from = from;
        this.to = to;
    }

    @Override
    protected Integer compute() {

        if (to - from <= 1000) {
            int sum=0;
            for (int i = from; i < to; i++) {
                sum+=nums[i];
            }

            return sum;
        }else {
            int sub=to-from;
            int mid1=from+sub/3;
            int mid2=to-sub/3;

            RecursiveTask<Integer> leftTask=new RecursiveTaskUz(nums,from, mid1);
            RecursiveTask<Integer> midTask=new RecursiveTaskUz(nums,mid1, mid2);
            RecursiveTask<Integer> rigthTask=new RecursiveTaskUz(nums,mid2, to);

            leftTask.fork();
            midTask.fork();
            rigthTask.fork();

            return leftTask.join()+rigthTask.join()+midTask.join();
        }
    }
}
