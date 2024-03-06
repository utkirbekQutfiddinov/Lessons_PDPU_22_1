package main.java.lessons.module_5.lesson_5_6;

import java.util.Comparator;

public class MyComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getAge()!=o2.getAge())
        return o1.getAge()-o2.getAge();
        else {
            return o1.getName().compareTo(o2.getName());
        }
    }
}
