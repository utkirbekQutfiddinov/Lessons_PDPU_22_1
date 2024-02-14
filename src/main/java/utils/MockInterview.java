package utils;

import java.util.Random;

public class MockInterview {
    public static void main(String[] args) {
        String[] names=new String[]{
//                "Xasanboy Ahmedov",
                "Abdulmajid Abdulmalikov",
                "Zinnurbek Ahrorov",
//                "Xamraliyev Aziz",
//                "Fayzullo Abdulazizov",
//                "Azizbek Qudratov",
                "Saidov Muhammadjon",
//                "Muhammadiso A'zamov",
//                "Xusanboy Ahmedov"
        };

        Random rand=new Random();
        int a= rand.nextInt(9);
        System.out.println(names[a]);

    }
}
