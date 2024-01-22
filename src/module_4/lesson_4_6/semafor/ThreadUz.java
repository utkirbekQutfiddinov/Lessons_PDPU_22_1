package module_4.lesson_4_6.semafor;

import java.util.concurrent.Semaphore;

public class ThreadUz implements Runnable{
    private static final Semaphore sem=new Semaphore(3);
    @Override
    public void run() {
        try{
            while(true){
                if(sem.tryAcquire()){
                    System.out.println(Thread.currentThread().getName()+" : acquired. avail: "+sem.availablePermits());
                    Thread.sleep(10);
                    sem.release();
                    System.out.println(Thread.currentThread().getName()+" : released. avail: "+sem.availablePermits());
                }else {
                    System.out.println(Thread.currentThread().getName()+" : can not acquired. avail: "+sem.availablePermits());
                    Thread.sleep(10);
                }
            }
        }catch (Exception e){

        }
    }
}
