package utils;

import java.util.Random;

public class MockInterview {
    public static void main(String[] args) {
        String[] names=new String[]{
                "Xasanboy Ahmedov",
                "Abdulmajid Abdulmalikov",
                "Zinnurbek Ahrorov",
                "Xamraliyev Aziz",
                "Fayzullo Abdulazizov",
                "Azizbek Qudratov",
                "Saidov Muhammadjon",
                "Xusanboy Ahmedov",
                "Muhammadiso A'zamov"
        };

        Random rand=new Random();
        int a= rand.nextInt(10);
        System.out.println(names[a]);

    }
}