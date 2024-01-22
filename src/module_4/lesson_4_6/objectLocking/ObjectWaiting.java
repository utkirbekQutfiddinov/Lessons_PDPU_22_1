package module_4.lesson_4_6.objectLocking;

public class ObjectWaiting {
    public static void main(String[] args) {
        Kitchen kitchen=new Kitchen();


        new Thread(()->{kitchen.cook();}).start();
        new Thread(()->{kitchen.eat();}).start();
        new Thread(()->{kitchen.eat();}).start();
    }
}
