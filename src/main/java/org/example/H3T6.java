package org.example;

import java.sql.SQLOutput;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class H3T6 {
    public static void main(String[] args) {
        //6.Napisz program, który zwróci czas między dwiema podanymi datami
        // w milisekundach, korzystając z klasy LocalDateTime.

        //Taking the date from user
        Scanner keyboard = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        //Date one
        System.out.print("Enter date One (format: yyyy-MM-dd HH:mm:ss): ");
        String dateOne = keyboard.nextLine();
        //User's date as an object
        LocalDateTime dateOneObject = LocalDateTime.parse(dateOne, formatter);

        //Date two
        System.out.print("Enter date Two (format: yyyy-MM-dd HH:mm:ss): ");
        String dateTwo = keyboard.nextLine();
        //User's date Two as an object
        LocalDateTime dateTwoObject = LocalDateTime.parse(dateTwo, formatter);


        Duration duration = Duration.between(dateOneObject, dateTwoObject);

        long milliseconds = duration.toMillis();
        System.out.println("Miliseconds between dates: " + milliseconds);

    }
}
