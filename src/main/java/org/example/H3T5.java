package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class H3T5 {
    public static void main(String[] args) {
        //5. Napisz program, który wyświetli datę dzisiejszą w formacie "dd-MM-yyyy"
        // i "yyyy/MM/dd" za pomocą klasy LocalDate.

        LocalDate localDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formatterTwo = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        System.out.println("Date format one: "+ localDate.format(formatter) + "\nDate format two: " + localDate.format(formatterTwo));
    }
}
