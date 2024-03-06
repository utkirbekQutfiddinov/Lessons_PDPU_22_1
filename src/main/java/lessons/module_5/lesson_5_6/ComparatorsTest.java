package main.java.lessons.module_5.lesson_5_6;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ComparatorsTest {
    public static void main(String[] args) {
        comparators();

    }

    private static void comparators() {
        Stream<Student> str1 = Stream.of(
                new Student("Toshmat", 25),
                new Student("Ali", 20),
                new Student("Abror", 20),
                new Student("Vali", 19),
                new Student("Eshmat", 15)
        );

        Consumer<Student> out = System.out::println;

        str1
                .sorted(new MyComparator())
                .forEach(out);
    }

    private static void simpleComparator() {
        Stream<Integer> str1 = Stream.of(6, 7, 8, 9, 1, 2, 3, 4, 5, 12, 2, 3, 4, 1, 8);

        Consumer<Integer> out = System.out::println;

        Stream<Integer> str2 = str1.sorted(Comparator.reverseOrder());

        str2.forEach(out);
    }
}
