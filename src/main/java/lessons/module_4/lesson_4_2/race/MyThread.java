package race;

import java.util.concurrent.locks.*;

public class MyThread implements Runnable {
    public static int count=0;
    private static Lock lock=new ReentrantLock();

    @Override
    public void run() {

        for (int i = 0; i < 1_000_000; i++) {
            lock.lock();
                count++;
            lock.unlock();
        }

    }
}
