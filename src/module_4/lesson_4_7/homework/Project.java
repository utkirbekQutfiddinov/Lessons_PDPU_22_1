package module_4.lesson_4_7.homework;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalField;
import java.util.Scanner;

public class Project {
    /**
     * TODOS:
     * 1) current date
     * 2) name of the day of the first day of this month
     * 3) name of the day of the first day of the next month
     * 4) name of the day of the first day of the this year
     * 5) name of the day of the first day of the next year
     * 6) calendar
     * menu has names of months
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int inYear = sc.nextInt();
//        int inMonth = sc.nextInt();
//        int inDay = sc.nextInt();
//

//        int inYear = 2024;
//        int inMonth = 9;
//        int inDay = 15;
//        LocalDate date = LocalDate.of(inYear, inMonth, inDay);
        LocalDate date=LocalDate.now();

        Month month = date.getMonth();
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        System.out.println(dayOfWeek.name() + ", " + month.name() + " " + date.getDayOfMonth());
        System.out.println("______________________");
        System.out.println(month.name() + " " + date.getYear());
        for (DayOfWeek kun : DayOfWeek.values()) {
            System.out.print(kun.name().substring(0, 2) + "\t");
        }
        System.out.println();

        int startingDay = date.withDayOfMonth(date.getDayOfMonth()).getDayOfWeek().getValue();

//        for (int i = 1; i < startingDay; i++) {
//            System.out.print("\t");
//        }


        LocalDate prevDate = date.minusMonths(1);
        int prevMonthDaysCount = prevDate.getMonth().length(prevDate.isLeapYear());

        for (int i = prevMonthDaysCount - startingDay + 1; i <= prevMonthDaysCount; i++) {
            System.out.print(i + "\t");
        }


        int daysCount = month.length(date.isLeapYear());

        for (int i = 1; i <= daysCount; i++) {
            System.out.print(i > 9 ? (i + "\t") : (i + "\t"));
            if ((i + startingDay - 1) % 7 == 0) {
                System.out.println();
            }
        }

//        int remainingDaysCount = 7-daysCount%7-(startingDay-1);
//
//        for (int i = 1; i <= remainingDaysCount; i++) {
//            System.out.print(" "+i+"\t");
//        }

        int value = LocalDate.of(date.getYear(),
                date.getMonth(),
                date.getMonth().length(date.isLeapYear())).getDayOfWeek().getValue();

        for (int i = 1; i <=7-value ; i++) {
            System.out.print(" "+i+"\t");
        }

        System.out.println();
        System.out.println("0-chiqish / 1 - oldingi oy / 2- keyingi oy");

    }
}
