package main.java.lessons.module_4.lesson_4_7.legacy;

import java.text.ParseException;
import java.util.Calendar;

public class DateAndCalendar {
    public static void main(String[] args) throws ParseException {
//        dateTest();
//        calendarTest();
    }


    private static void calendarTest() {
        Calendar cal=Calendar.getInstance();
        System.out.println(cal.getTime());
        cal.add(4,1);
        System.out.println(cal.getTime());
        System.out.println(cal.get(1));

        cal.add(5,40);
        System.out.println(cal.getTime());


        cal.roll(5,40);
        System.out.println(cal.getTime());


        cal.setLenient(true);
        cal.set(5,32);
        System.out.println(cal.getTime());
    }

    private static void dateTest(){

//        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
//        String str=new Scanner(System.in).next();
//        Date date=sdf.parse(str);
//
//        SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yyyy");
//
//        Date date1=sdf1.parse("12/06/2023");
//
//        String text=sdf1.format(date);
//        System.out.println(text);
//
//        if (date.equals(date1)) {
//            System.out.println("date is equal");
//        }


//        Date curr=new Date();
//        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
//
//        for (int i = 0; i <1000_000; i++) {
//            new Thread(()->{
//                try {
//                    System.out.println(sdf.parse("2024/01/01"));
//                } catch (ParseException e) {
//                    e.printStackTrace();
//                }
//            }).start();
//        }
    }
}
