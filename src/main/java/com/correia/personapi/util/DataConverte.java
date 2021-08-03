package com.correia.personapi.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataConverte {
    public static String DateToString(LocalDate localDate) {
        if (!localDate.equals(null)) {
            DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;//DateTimeFormatter.ofPattern("dd LLLL yyyy");
            String formattedString = localDate.format(formatter);
            System.out.println(formattedString);
            return localDate.format(formatter);
        } else return null;

    }

    public static LocalDate stringToDate(String dateLocalString) {
        if (!dateLocalString.isEmpty()) {
            //DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");//ISO_LOCAL_DATE;
            System.out.println("Data: " + LocalDate.parse(dateLocalString, DateTimeFormatter.ofPattern("yyyy-MM-dd")));
            return LocalDate.parse(dateLocalString, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        } else
            return null;
    }
}
