package org.example;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class H3T7 {
    public static void main(String[] args) {
        //7. Stwórz program, który pozwoli użytkownikowi wprowadzić datę i czas,
        // a następnie wyświetli ją w różnych strefach czasowych przy użyciu klasy ZonedDateTime.

        //Taking the date from user
        Scanner keyboard = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.print("Enter date One (format: yyyy-MM-dd HH:mm:ss): ");
        String dateOne = keyboard.nextLine();
        //User's date as an object
        LocalDateTime dateOneObject = LocalDateTime.parse(dateOne, formatter);

        //Creating zond id
        ZoneId copenhagen = ZoneId.of("Europe/Copenhagen");
        ZonedDateTime zone  = ZonedDateTime.of(dateOneObject, copenhagen);
        System.out.println("Time Zone Europe/Copenhagen: " + zone.format(formatter));

        ZoneId india = ZoneId.of("Asia/Kolkata");
        ZonedDateTime zone1  = zone.withZoneSameInstant(india);
        System.out.println("Time Zone Asia/Kolkata: " + zone1.format(formatter));

        ZoneId  tokyo = ZoneId.of("Asia/Tokyo");
        ZonedDateTime zone2   = zone.withZoneSameInstant(tokyo);
        System.out.println("Time Zone Asia/Tokyo: "  + zone2.format(formatter));

        ZoneId  chicago = ZoneId.of("America/Chicago");
        ZonedDateTime zone3   = zone.withZoneSameInstant(chicago);
        System.out.println("Time Zone America/Chicago: "  + zone3.format(formatter));

        ZoneId  sydney = ZoneId.of("Australia/Sydney");
        ZonedDateTime zone4   = zone.withZoneSameInstant(sydney);
        System.out.println("Time Zone Australia/Sydney: "  + zone4.format(formatter));

        ZoneId  losAngeles = ZoneId.of("America/Los_Angeles");
        ZonedDateTime zone5   = zone.withZoneSameInstant(losAngeles);
        System.out.println("Time Zone America/Los_Angeles: "  + zone5.format(formatter));

        //Returns timezone
//        ZonedDateTime zoneNow =ZonedDateTime.now();
//        System.out.println(zone.getZone());

    }
}
