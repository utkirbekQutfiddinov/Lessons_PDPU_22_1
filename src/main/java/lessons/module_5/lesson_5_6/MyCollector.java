package main.java.lessons.module_5.lesson_5_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class MyCollector implements Collector<Student, List<Student>, List<Student>> {
    @Override
    public Supplier<List<Student>> supplier() {
        return ArrayList::new;
    }

    @Override
    public BiConsumer<List<Student>, Student> accumulator() {
        return List::add;
    }

    @Override
    public BinaryOperator<List<Student>> combiner() {
        return (set1, set2) -> {
            set1.addAll(set2);
            return set1;
        };
    }

    @Override
    public Function<List<Student>, List<Student>> finisher() {
        return ArrayList::new;
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Set.of(Characteristics.UNORDERED);
    }
}
