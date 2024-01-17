package th;

import static java.lang.Thread.sleep;

public class CPU {
    public static void main(String[] args) {
        for (int i = 0; i < 1_000_000; i++) {
            Thread t=new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j <1000; j++) {
                        System.out.println(Thread.currentThread().getName()+" : "+j);
                        try {
                            sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
            t.start();
        }
    }
}
