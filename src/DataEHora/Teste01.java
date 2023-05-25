package DataEHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Teste01 {
    public static void main(String[] args) {

        DateTimeFormatter ftm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter ftm2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02= LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2022-09-07");
        LocalDateTime d05 = LocalDateTime.parse("2022-09-05T01:30:09");
        Instant d06 = Instant.parse("2022-09-05T01:30:09Z");
        Instant d07 = Instant.parse("2022-09-05T01:30:09-03:00");

        LocalDate d08 = LocalDate.parse("07/12/2001", ftm1);
        LocalDateTime d09 = LocalDateTime.parse("07/12/2001 14:30", ftm2);

        LocalDate d10 = LocalDate.of(2023, 8, 23);
        LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);

        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d06);
        System.out.println(d07);
        System.out.println(d08);
        System.out.println(d09);
        System.out.println(d10);
        System.out.println(d11);

    }
}
