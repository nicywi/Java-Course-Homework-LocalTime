package org.example;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class H3T3 {
    public static void main(String[] args) {
        //3. Napisz metodę, która zwróci liczbę dni między
        // dwiema podanymi datami, używając klasy LocalDate.

        //Taking the date from user
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter date One (format: YYYY-MM-DD): ");
        String dateOne = keyboard.nextLine();
        //User's date as an object
        LocalDate dateOneObject = LocalDate.parse(dateOne);

        System.out.print("Enter date Two (format: YYYY-MM-DD): ");
        String dateTwo = keyboard.nextLine();
        //User's date Two as an object
        LocalDate dateTwoObject = LocalDate.parse(dateTwo);


        //calculates the difference between two dates
        //Period period = Period.between(dateOneObject, dateTwoObject);

        long daysBetween = ChronoUnit.DAYS.between(dateOneObject, dateTwoObject);

        System.out.println("Period between: " + daysBetween + " days");
    }
}
