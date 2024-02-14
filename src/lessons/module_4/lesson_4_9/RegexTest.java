package lessons.module_4.lesson_4_9_22_1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) throws Exception {

//        test();

//        "+998##1234567";
//        phonePattern();

       /* count

       * 0 or more
       ? 0 or 1
       + 1 or more
       {n} exactly n
       {n,} at least n
       {n,m} from n to m inclusively
        */


        /* meta

        \d digit
        \D non-digit
        \w word: [a-zA-Z0-9_]
        \W non-word
        \s space
        \S non-space


         */


        /* Classes

        [ab] a or b
        [a|b] a or b
        [a-t] a to t
        [a-t|k-z] a to t or k to z
        [a-m&&k-w] a to m AND k to w
        [^ab] any character except a and b
        [a-m&&^k-w] a to m AND not within k to w


         */


        /* POSIX

        \p{Digit}
        \p{Lower}
        \p{Upper}


         */




        //^(\p{Alpha}+)(\w)(@)(\S+)(.)(\p{Alpha}+)$ :email
        //^(?=\p{Upper})(?=\D*\p{Digit}).{8,}$: password

    }

    private static void phonePattern() {
        Scanner sc=new Scanner(System.in);
        String phone=sc.next();

        Pattern p=Pattern.compile("^(\\+998)(\\d{2})([0-9]{7})$");
        Matcher m=p.matcher(phone);

        System.out.println(m.matches());
    }

    private static void test() {
        Pattern p = Pattern.compile("\\d");

        Matcher mat = p.matcher("ab35asas9");

        System.out.println(mat.matches());

        mat.find();
        mat.find();

        mat.reset();

        mat.find();
        System.out.print(mat.group());
    }
}
