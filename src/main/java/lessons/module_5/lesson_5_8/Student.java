package main.java.lessons.module_5.lesson_5_8;

@MyAnno(value = "talaba",age = 45)

public class Student {
    private String fullname;
    private Integer age;

    public Student() {
    }

    public Student(String fullname, Integer age) {
        this.fullname = fullname;
        this.age = age;
    }

    public Student(String fullname) {
        this.fullname = fullname;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Student{" +
                "fullname='" + fullname + '\'' +
                ", age=" + age +
                '}';
    }


    private void test(){

    }
}
