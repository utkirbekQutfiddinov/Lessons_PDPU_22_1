package deadlock;

import java.util.Random;
import java.util.concurrent.locks.Lock;

public class Thread1 implements Runnable{
    private final Lock birinchi;
    private final Lock ikkinchi;
    private final String name;

    private static int mantilar=1_000;

    public Thread1(String name, Lock birinchi, Lock ikkinchi){
        this.birinchi=birinchi;
        this.ikkinchi=ikkinchi;
        this.name=name;
    }


    @Override
    public void run() {

        while(mantilar>0){

                birinchi.lock();

            if (!ikkinchi.tryLock()) {
                System.out.println(name+" released. Qoldi: "+mantilar);

                birinchi.unlock();
            }else {
                    if(mantilar>0){
                        mantilar--;
                        System.out.println(this.name+" 1 ta manti yedi. Qoldi: "+mantilar);
                    }

                    ikkinchi.unlock();
                birinchi.unlock();
                }

            }
        }
    }

