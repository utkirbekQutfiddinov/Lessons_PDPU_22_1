package lessons.module_4.lesson_4_6.project;

public class App {
    public static void main(String[] args) {
        Thread akvarium=new Thread(new Aquarium());
        akvarium.start();
    }
}
