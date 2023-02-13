package org.todolist.utility;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {

    private final String TIME_FORMATTER = "h:mm:ss a";
    private final String DATE_FORMATTER = "MM-dd-yyyy";
    public void createTimeStamp() {

        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(TIME_FORMATTER);
        System.out.println(time.format(formatter));

    }

    public void createDateStamp() {

        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMATTER);
        System.out.println(date.format(formatter));

    }

}
