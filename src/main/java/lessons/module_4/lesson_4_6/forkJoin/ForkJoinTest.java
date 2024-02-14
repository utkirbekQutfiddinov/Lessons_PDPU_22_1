package main.java.lessons.module_4.lesson_4_6.forkJoin;

public class ForkJoinTest {
    public static void main(String[] args) {
        int size=10_000_000;
        int[] nums=new int[size];

        for (int i = 0; i < size; i++) {
            nums[i]=(int)(Math.random()*999)+1;
        }

        long begin=System.currentTimeMillis();
//        ForkJoinPool service=new ForkJoinPool();
//        System.out.println(service.invoke(new RecursiveTaskUz(nums, 0, nums.length)));
//        int sum=0;
//        for (int i = 0; i < size; i++) {
//            sum+=nums[i];
//        }
//        System.out.println(sum);
        long end=System.currentTimeMillis();
        System.out.println(end-begin);
    }
}
