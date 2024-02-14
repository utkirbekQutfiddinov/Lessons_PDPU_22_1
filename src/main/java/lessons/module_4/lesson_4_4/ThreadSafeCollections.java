package main.java.lessons.module_4.lesson_4_4;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentSkipListSet;

public class ThreadSafeCollections {
    public static void main(String[] args) {
        Set<Integer> nums = Collections.synchronizedSet(new HashSet<>());
        List<Integer> list=Collections.synchronizedList(new ArrayList<>());
        Map<String,Object> map=Collections.synchronizedMap(new HashMap<>());

//        ConcurrentHashMap.KeySetView<Integer, Boolean> nums = ConcurrentHashMap.newKeySet();
        ConcurrentSkipListSet<Integer> conSet=new ConcurrentSkipListSet<>();
        ConcurrentLinkedQueue<Integer> conList=new ConcurrentLinkedQueue<>();


        Thread t1=new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                nums.add(i);
            }
        });
        Thread t2=new Thread(() -> {
            for (int i = 10000; i < 20000; i++) {
                nums.add(i);
            }
        });

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(nums.size());
    }
}
