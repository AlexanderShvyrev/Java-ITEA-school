package Homework.OOP.Dates;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1987, 8, 19);
        LocalDateTime currentTime = LocalDateTime.now();

        String timeSinceBirthday = calculateTimeSinceBirthday(birthday, currentTime);

        System.out.println(timeSinceBirthday);
    }

    public static String calculateTimeSinceBirthday(LocalDate startDate, LocalDateTime endDate) {
        Period period = Period.between(startDate, endDate.toLocalDate());
        Duration duration = Duration.between(startDate.atStartOfDay(), endDate);

        long years = period.getYears();
        long months = period.getMonths();
        long days = period.getDays();
        long hours = duration.toHours() % 24;
        long minutes = duration.toMinutes() % 60;
        long seconds = duration.getSeconds() % 60;

        return "You are " + years + " years, " + months + " months, " + days + " days, " +
                hours + " hours, " + minutes + " minutes, and " + seconds + " seconds old.";
    }
}
