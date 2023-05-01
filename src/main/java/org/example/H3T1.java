package org.example;

import javax.swing.text.DateFormatter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class H3T1 {
    public static void main(String[] args) {
//        LocalDate LocalDateTime
//1. Napisz program, który pobierze datę urodzenia użytkownika,
// a następnie wyświetli wiek w latach, miesiącach i dniach,
// korzystając z klasy LocalDate.

        //This code uses the java.time.LocalDate
        // class to handle dates and the java.time.temporal.
        // ChronoUnit enum to calculate the number of days between two dates.
        // The Scanner class is used to read input from the user via the command line.

        LocalDate localDate = LocalDate.now();
        int day = localDate.getDayOfMonth();
        int month = localDate.getMonthValue();
        int year = localDate.getYear();
        System.out.println("Today's date: " + day + "." + month + "." + year);

        //Taking the birthday form user
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your date of birth (format: YYYY-MM-DD): ");
        String birthday = keyboard.nextLine();

        //User's birthday as an object
        LocalDate birthdate = LocalDate.parse(birthday);

        //calculates the difference between two dates
        Period period = Period.between(birthdate, localDate);
        //prints the differnce in years, months, and days
        System.out.printf("Your age is %d years %d months and %d days.", period.getYears(), period.getMonths(), period.getDays());

        // Calculate the number of days since the user's birthdate
        long daysAlive = ChronoUnit.DAYS.between(birthdate, LocalDate.now());
        long monthsAlive = ChronoUnit.MONTHS.between(birthdate, LocalDate.now());
        long yearsAlive = ChronoUnit.YEARS.between(birthdate, LocalDate.now());

        System.out.printf("\nYou've lived:\nIn years:  %d years \nIn months: %d months\nIn days: %d days.", yearsAlive, monthsAlive, daysAlive);

    }
}
