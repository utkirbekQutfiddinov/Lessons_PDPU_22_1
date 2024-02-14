package main.java.designPatterns.creational.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        Runnable run=()->{
            Car car=Car.getInstance();
            System.out.println(car.hashCode());
        };

        Thread t1=new Thread(run);
        Thread t2=new Thread(run);

        t1.start();
        t2.start();
    }
}
