package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        // Define a regex pattern with negative lookahead
        String regex = "\\w+(?!\\d)";

        // Create a Pattern object
        Pattern pattern = Pattern.compile(regex);

        // Create a Matcher object for the input string
        String input = "hello123";
        Matcher matcher = pattern.matcher(input);

        // Find and print matches
        while (matcher.find()) {
            System.out.println("Match: " + matcher.group());
        }
    }
}
