package main.java.lessons.module_4.lesson_4_6.objectLocking;

public class Kitchen {
    private boolean isEmpty;

    public synchronized void cook(){
        try{
        while(true){
            if(isEmpty){
                System.out.println("bo'sh ekan pishiryapman...");

                Thread.sleep(100);
                System.out.println("Ovqat pishdi!");
                isEmpty=false;

                notifyAll();

                wait();

            }else{
                System.out.println("Band ekan. Kutaman...");
                wait();
            }
        }
    }catch (Exception e){
            System.out.println(e);
        }
    }


    public synchronized void eat(){
        try{
            while(true){
                if(!isEmpty){
                    System.out.println("bor ekan yeyapman...");

                    Thread.sleep(150);
                    System.out.println("Ovqat tugadi!");
                    isEmpty=true;

                    notifyAll();

                    wait();

                }else{
                    System.out.println("Bo'sh ekan. Kutaman...");
                    wait();
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
