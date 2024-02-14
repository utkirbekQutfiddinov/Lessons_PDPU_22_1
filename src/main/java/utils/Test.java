package main.java.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String input = "salom salom 12 salom pdp pdp";
        String pattern = "(\\b\\w+\\b) \\1";

        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(input);

        while (matcher.find()) {
            String repeatedWord = matcher.group();

            System.out.println(repeatedWord);
        }

    }
}
