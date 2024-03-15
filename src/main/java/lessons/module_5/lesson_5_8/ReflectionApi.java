package main.java.lessons.module_5.lesson_5_8;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Logger;

public class ReflectionApi {

    private Logger logger=Logger.getLogger(ReflectionApi.class.getName());
    public static void main(String[] args) throws Exception{
        //where we use: building frameworks

        /** Elements of Reflection API
         * Class
         * Field
         * Method
         * Constructor
         * Annotation
         * Modifier
         */

        /**
         * Difference between getXXX(1) and getDeclaredXXX(2)
         * 1. gets parent and its own public XXXes
         * 2. gets all of its own XXXes
         */



    }

    private static void workingWithConstructors() throws InstantiationException, IllegalAccessException, InvocationTargetException {
        Class<Student> clas = Student.class;
        Constructor<?>[] declaredConstructors = clas.getDeclaredConstructors();

        Student o1 = null;
        Student o2 = null;
        Student o3 = null;
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            if(declaredConstructor.getParameterCount()==0){
                o1 = (Student) declaredConstructor.newInstance();
            }
            if(declaredConstructor.getParameterCount()==1){
                o2 = (Student) declaredConstructor.newInstance("Ali");
            }
            if(declaredConstructor.getParameterCount()==2){
                o3 = (Student) declaredConstructor.newInstance("Vali",20);
            }


        }

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
    }

    private static void invokingMehtods() throws Exception {
        Class<Student> clas = Student.class;

        Student s1=clas.newInstance();
        Student s2=clas.newInstance();


        System.out.println(s1);
        System.out.println(s2);

        Method[] declaredMethods = clas.getDeclaredMethods();

        for (Method declaredMethod : declaredMethods) {
            if(declaredMethod.getName().equals("setFullname")){
                declaredMethod.invoke(s1,"Ali");
                declaredMethod.invoke(s2,"Vali");
            }
        }

        Method getter=clas.getMethod("getFullname",null);

        Object invoke = getter.invoke(s1, null);

        System.out.println(invoke);

    }

    private static void settingValueToFIelds() throws InstantiationException, IllegalAccessException {
        Class<Student> clas = Student.class;

        Student student = clas.newInstance();
        Student student1 = clas.newInstance();

        System.out.println(student);
        System.out.println(student1);


        Field[] fields=clas.getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);

            if(field.getName().equals("fullname")){
                field.set(student,"Ali");
                field.set(student1,"Vali");
            }else if(field.getName().equals("age")){
                field.set(student,20);
                field.set(student1,19);
            }
        }


        System.out.println(student);
        System.out.println(student1);
    }

    private static void fields() {
        Class<Student> clas = Student.class;

        Field[] declaredFields = clas.getDeclaredFields();


        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName());
        }
    }

    private static void classses() throws ClassNotFoundException {
        Class<Student> clas = Student.class;
        Class<? extends Student> aClass = new Student().getClass();
        Class<?> aClass1 = Class.forName("main.java.lessons.module_5.lesson_5_8.Student");

        System.out.println("clas.getName() = " + clas.getName());
        Annotation[] annotations = clas.getAnnotations();


        System.out.println(annotations.length);
        for (Annotation anno: annotations){
            System.out.println(anno.toString());
        }
    }
}
