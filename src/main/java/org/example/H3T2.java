package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;
import java.util.Scanner;

public class H3T2 {
    public static void main(String[] args) {
        //2. Stwórz program, który pozwoli użytkownikowi wprowadzić datę i czas,
        // a następnie wyświetli ją w formacie "yyyy-MM-dd HH:mm:ss"
        // przy użyciu klasy LocalDateTime.

        //Taking the date from  user
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter date and time (format: YYYY-MM-DD HH:mm:ss)");
        String dateTime = keyboard.nextLine();

//        System.out.print("Enter time (format: HH:mm:ss)");
//        String time = keyboard.nextLine();

        //Date as an object
       // LocalDate dateOne = LocalDate.parse(date);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTwo = LocalDateTime.parse(dateTime,formatter);

        System.out.println("Entered date and time: " + dateTwo.format(formatter));
    }
}
