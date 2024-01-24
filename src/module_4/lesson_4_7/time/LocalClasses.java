package module_4.lesson_4_7.time;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalClasses {
    public static void main(String[] args) {
        localTest();
    }

    private static void localTest() {
        LocalDate now=LocalDate.now();
//        LocalDate date1=LocalDate.of(2024,12,23);
//        LocalDate dateFromStr=LocalDate.parse("2030.02.16",DateTimeFormatter.ofPattern("yyyy.MM.dd"));

//        System.out.println(dateFromStr);
//        System.out.println(now);
//        System.out.println(date1);
//
//        System.out.println(now.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));

//        System.out.println(now);
//        LocalDate newDate=now.plusDays(122);
//        System.out.println(newDate);
//
//        LocalDate localDate = now.minusDays(100);
//        System.out.println(localDate);

//        System.out.println(localDate.getChronology());



//        LocalTime time=LocalTime.now();
//        LocalDateTime date5=LocalDateTime.of(2024, Month.JUNE,25,15,23);
//        System.out.println(time);
//
//        System.out.println(time.getSecond());
//        time.plus(Duration.of(2))
//        time.plus


        LocalDateTime dateTime=LocalDateTime.now();
        System.out.println(dateTime);

        dateTime.isAfter(LocalDateTime.now());
    }

}
