package th;

public class MyThread extends Thread{


    public MyThread(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 1; i++) {
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }
}
