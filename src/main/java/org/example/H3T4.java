package org.example;

import java.time.LocalDate;
import java.util.Scanner;
import java.text.DateFormatSymbols;

public class H3T4 {
    //4. Stwórz program, który dla podanego roku i miesiąca
    // obliczy liczbę dni, korzystając z metody lengthOfMonth klasy LocalDate.
    public static void main(String[] args) {

        //Taking the date from user
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter date (format: YYYY-MM-DD): ");
        String dateOne = keyboard.nextLine();
        //User's date as an object
        LocalDate dateOneObject = LocalDate.parse(dateOne);

        System.out.println("Number of days in a month:" + dateOneObject.lengthOfMonth());

        //OR Second option
        System.out.print("Enter year: ");
        int year = keyboard.nextInt();
        System.out.print("Enter month: ");
        int month = keyboard.nextInt();

        int daysInMonth = LocalDate.of(year, month, 1).lengthOfMonth();

        System.out.println("Number of days in " + month + " year " + year + " equals to " + daysInMonth);

    }

}
