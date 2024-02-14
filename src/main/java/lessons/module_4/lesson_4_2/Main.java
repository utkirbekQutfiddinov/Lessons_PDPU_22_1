package main.java.lessons.module_4.lesson_4_2;

import deadlock.Thread1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Lock a=new ReentrantLock();
        Lock b=new ReentrantLock();


        Thread t1=new Thread(new Thread1("Suqrot",a,b));
        Thread t2=new Thread(new Thread1("Aristotel",b,a));


        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }


    }
}
