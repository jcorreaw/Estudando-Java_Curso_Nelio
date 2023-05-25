package DataEHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Teste04 {

    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2022-09-07");
        LocalDateTime d05 = LocalDateTime.parse("2022-09-05T01:30:09");
        Instant d06 = Instant.parse("2022-09-05T01:30:09Z");

        LocalDate semanaAnterior = d04.minusDays(7);
        LocalDate proximaSemana = d04.plusDays(7);
        System.out.println(semanaAnterior);
        System.out.println(proximaSemana);
        System.out.println();

        LocalDateTime semanaAnteriorT = d05.minusDays(7);
        LocalDateTime proximaSemanaT = d05.plusDays(7);
        System.out.println(semanaAnteriorT);
        System.out.println(proximaSemanaT);
        System.out.println();

        Instant semanaAnteriorI = d06.minus(7, ChronoUnit.DAYS);
        Instant proximaSemanaI = d06.plus(7, ChronoUnit.DAYS);
        System.out.println(semanaAnteriorI);
        System.out.println(proximaSemanaI);
        System.out.println();

        Duration t1 = Duration.between(semanaAnterior.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(semanaAnteriorT, d05);
        Duration t3 = Duration.between(semanaAnteriorI, d06);
        Duration t4 = Duration.between(d06, semanaAnteriorI);

        System.out.println(t1.toDays());
        System.out.println(t2.toDays());
        System.out.println(t3.toDays());
        System.out.println(t4.toDays());










    }
}
