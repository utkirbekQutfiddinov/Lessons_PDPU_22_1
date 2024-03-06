package main.java.lessons.module_5.lesson_5_6;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsTest {
    public static void main(String[] args) {

    }

    private static void collectorsTest() {
        Stream<Student> str1 = Stream.of(
                new Student("Toshmat", 25),
                new Student("Toshmat1", 19),
                new Student("Ali", 20),
                new Student("Ali", 21),
                new Student("Abror", 20),
                new Student("Vali", 19),
                new Student("Eshmat", 15)
        );

        BiConsumer<Integer, List<Student>> biOut = (i, l) -> {
            System.out.println(i);
            l.forEach(System.out::println);
        };

        BiConsumer<Integer,Long> out=(i,l)->{
            System.out.println("Yosh="+i+", Soni="+l);
        };

//        String collect = str1
//                .map(s -> s.getName())
//                .collect(Collectors.joining(", ","[","]"));


//        Optional<Student> collect = str1.collect(Collectors.minBy((s1, s2) -> s2.getAge() - s1.getAge()));
//        System.out.println(collect.orElse(null));


//        IntSummaryStatistics stats = str1.collect(Collectors.summarizingInt((s) -> {
//            return s.getAge();
//        }));
//
//        System.out.println("stats.getAverage() = " + stats.getAverage());
//        System.out.println("stats.getCount() = " + stats.getCount());
//        System.out.println("stats.getMax() = " + stats.getMax());


//        Map<Boolean, List<Student>> collect = str1.collect(Collectors.partitioningBy(s -> s.getAge() > 18));
//
//
//        collect.forEach((k,v)->{
//            System.out.println(k);
//            System.out.println(v);
//            System.out.println();
//        });


        List<Student> list = str1.collect(new MyCollector());

        list.forEach(System.out::println);
    }

    private static void collector() {
        Stream<Student> str1 = Stream.of(
                new Student("Toshmat", 25),
                new Student("Ali", 20),
                new Student("Ali", 21),
                new Student("Abror", 20),
                new Student("Vali", 19),
                new Student("Eshmat", 15)
        );


        BiConsumer<String, Integer> out = (k, v) -> {
            System.out.println(k + " : " + v);
        };

        BinaryOperator<Integer> merger = (s1, s2) -> (s1 + s2);

        str1.collect(Collectors.toMap(s -> s.getName(), s -> s.getAge(), merger)).forEach(out);
    }
}
