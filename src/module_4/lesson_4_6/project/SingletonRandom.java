package module_4.lesson_4_6.project;

import java.util.Random;

public class SingletonRandom {
    private static Random instance;

    private SingletonRandom(){}

    public static Random getInstance(){
        if(instance==null){
            synchronized (instance){
                if(instance==null){
                    instance=new Random();
                }
            }
        }
        return instance;
    }
}
