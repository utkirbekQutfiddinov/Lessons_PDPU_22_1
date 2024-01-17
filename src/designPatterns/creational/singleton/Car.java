package designPatterns.creational.singleton;


/**
 * 1. make no args constructor private
 * 2. add a field
 * 3. create public static method to retrieve the instance
 * 4. (Optional) make fetchType as lazy
 * 5. (Optional) implement double-checking
 */
public class Car {
    private static Car instance;
    private Car(){}

    public static Car getInstance(){
        if(instance==null){
            synchronized (Car.class){
                if(instance==null){
                    instance=new Car();
                }
            }
        }
        return instance;
    }
}
