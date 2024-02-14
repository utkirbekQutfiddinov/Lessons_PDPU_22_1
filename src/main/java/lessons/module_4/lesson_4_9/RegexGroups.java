package main.java.lessons.module_4.lesson_4_9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexGroups {
    public static void main(String[] args) {


        /* Regex grouping types:

        1. Capturing group: "(pattern)"
        2. Non-capturing group: "(?:pattern)"
        3. Named group: "(?<name>pattern)"
        4. Positive lookahead: "(?=pattern)"
        5. Negative lookahead: "(?!pattern)"
        6. Positive lookbehind: "(?<=pattern)"
        7. Negative lookbehind: "(?<!pattern)"

         */


        /**
         * 1. Email
         * 2. Phone
         * 3. Password
         * 4. Birthdate: dd-MM-yyyy
         */


    }

    private static void namedGroup() {
        Scanner sc=new Scanner(System.in);

        Pattern pattern=Pattern.compile("(?<day>\\d{2})-(?<month>\\d{2})-(?<yil>\\d{4})");

        String text=sc.next();
        Matcher matcher=pattern.matcher(text);

        if(matcher.matches()){
            System.out.println("Day: "+matcher.group("day"));
            System.out.println("Month: "+matcher.group("month"));
            System.out.println("Year: "+matcher.group("yil"));
            System.out.println("Full: "+matcher.group(0));
        }
    }

    private static void nonCapturing() {
        Scanner sc=new Scanner(System.in);

        Pattern pattern=Pattern.compile("(\\d{2})-(?:\\d{2})-(\\d{4})");

        String text=sc.next();
        Matcher matcher=pattern.matcher(text);

        if(matcher.matches()){
            System.out.println("Day: "+matcher.group(1));
            System.out.println("Year: "+matcher.group(2));
            System.out.println("Full: "+matcher.group(0));
        }
    }

    private static void captured() {
        Scanner sc=new Scanner(System.in);

        Pattern pattern=Pattern.compile("(\\d{2})-(\\d{2})-(\\d{4})");

        String text=sc.next();
        Matcher matcher=pattern.matcher(text);

        if(matcher.matches()){
            System.out.println("Month: "+matcher.group(2));
            System.out.println("Day: "+matcher.group(1));
            System.out.println("Year: "+matcher.group(3));
            System.out.println("Full: "+matcher.group(0));
        }
    }
}
