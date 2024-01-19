package module_4.lesson_4_5.threadPool;

import java.util.List;
import java.util.concurrent.*;
import java.util.function.Supplier;

public class Main {
    static ThreadLocal<ThreadLocalTest> threadLocal = ThreadLocal.withInitial(ThreadLocalTest::new);

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Runnable run = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " - " + i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Callable<String> call = () -> {
//            ThreadLocalTest sum = new ;
//            if(sum!=null)
//            System.out.println(Thread.currentThread().getName()+" : "+sum.hashCode());
//
//            if (sum == null) {
//                sum=new ThreadLocalTest();
//                threadLocal.set(sum);
//            }


//            for (int i = 0; i < 5; i++) {
//                sum = sum + i;
////                System.out.println(Thread.currentThread().getName()+" - "+i);
//                try {
//                    Thread.sleep(1);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//            return Thread.currentThread().getName() + ": " + sum;
            return "";
        };




//        try {
//            Integer sum = call.call();
//            System.out.println(sum);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        Runnable run=new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        };
//
//
//        Callable<Boolean> call=new Callable<Boolean>() {
//            @Override
//            public Boolean call() throws Exception {
//                return null;
//            }
//        }


        ExecutorService service= Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
//        ExecutorService service=Executors.newSingleThreadExecutor();
//        ExecutorService service = Executors.newCachedThreadPool();

        for (int i = 0; i < 1000_000; i++) {
//            service.execute(run);
//            Future<String> submit = service.submit(call);
//            while (!submit.isDone()) {
////                System.out.println("kutyapman...");
////                Thread.sleep(1000);
//            }
//            System.out.println("Rahmat..." + submit.get());



            service.execute(()->{method();});
        }


        service.shutdown();
        if (!service.isShutdown()) {
            service.shutdownNow();
        }

    }

    public static void method(){
        ThreadLocalTest sum= threadLocal.get();
        System.out.println(Thread.currentThread().getName()+":"+sum.hashCode());
    }
}
