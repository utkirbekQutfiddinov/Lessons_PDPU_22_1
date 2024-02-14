package main.java.lessons.module_4.lesson_4_6.semafor;

public class SemaphoreTest {
    public static void main(String[] args) {
        new Thread(new ThreadUz()).start();
        new Thread(new ThreadUz()).start();
        new Thread(new ThreadUz()).start();
        new Thread(new ThreadUz()).start();
    }
}
