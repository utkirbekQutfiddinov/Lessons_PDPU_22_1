package main.java.lessons.module_5.lesson_5_5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {

    }

    private static void streamCreatingWays() {
        //intifinte streams
//        IntStream st1=new Random().ints(1,10);

//        Stream<Integer> st2=Stream.generate(()-> (int)(Math.random()*99+1));

//        Stream<Integer> st3=Stream.iterate(0,(i)->i+2);

//stream fromn collections
        List<Integer> nums=List.of(1,12,3,4);
        Stream<Integer> st4=nums.stream();
        Stream<Integer> st5=nums.parallelStream();


        //stream from arrays
        int[] nums1=new int[]{1,2,3};
        IntStream st6 = Arrays.stream(nums1);

        //stream via factory method
        Stream<Integer> st7=Stream.of(1,2,3);
    }

    private static void operatorsTest() {
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 1, 5, 12, 1, 1, 1, 1, 5);

        Consumer<Integer> out = System.out::println;

        //intermediate operation
//        Function<Integer, Integer> func1 = (num) -> num + 2;
//        Stream<Integer> intstream = stream.map(func1);
//
//        intstream.forEach(System.out::println);
//
//        nums.forEach(System.out::println);
//        stream
//                .distinct()
//                .forEach(System.out::println);

        Stream<Integer> stream = nums.stream();

        Stream<Integer> st2 = Stream.of(2, 3, 4);

        Stream<Stream<Integer>> st3 = Stream.of(stream, st2);

        Stream<Integer> st4 = st3.flatMap((st) -> (st.map((num) -> num + 2)));

        Stream<Integer> st5 = st4.filter(integer -> integer > 3);

        Stream<Integer> st6 = st5.limit(10);

        Stream<Integer> st7 = st6.skip(2);

//        Stream<Integer> peek = st7.peek(out);

        Stream<Integer> st8 = st7.sorted((o1, o2) -> -1 * o1.compareTo(o2));

        Stream<Integer> st9 = st8.unordered();

//        System.out.println(st9.allMatch((num) -> num % 2 == 0));
//        List<Integer> collect = st9.collect(Collectors.toList());

//        System.out.println(st9.count());
//        Optional<Integer> any = st9.findAny();
//        System.out.println(any.orElseGet(() -> 1));

//        Optional<Integer> reduce = st9.reduce((num1, num2) -> num1 + num2);
//        System.out.println(reduce.get());

//        Integer[] array = st9.toArray(Integer[]::new);
    }
}
