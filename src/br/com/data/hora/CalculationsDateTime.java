package br.com.data.hora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculationsDateTime {

	public static void main(String[] args) {

		LocalDate data04 = LocalDate.parse("2022-10-15");
		LocalDateTime data05 = LocalDateTime.parse("2022-10-15T12:59:31");
		Instant data06 = Instant.parse("2022-10-15T12:59:31Z");

		LocalDate pastWeekLocalDate = data04.minusDays(7);
		LocalDate nextWeekLocalDate = data04.plusDays(7);

		System.out.println("Past Week Local Date: " + pastWeekLocalDate);
		System.out.println("Next Week Local Date: " + nextWeekLocalDate);

		LocalDateTime pastWeekLocalDateTime = data05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = data05.plusDays(7);

		System.out.println();

		System.out.println("Past Week Local Date Time: " + pastWeekLocalDateTime);
		System.out.println("Next Week Local Date Time: " + nextWeekLocalDateTime);

		Instant pastWeekInstant = data06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = data06.plus(7, ChronoUnit.DAYS);

		System.out.println();

		System.out.println("Past Week Instant: " + pastWeekInstant);
		System.out.println("Next Week Instant: " + nextWeekInstant);

		Duration t1 = Duration.between(pastWeekLocalDateTime, data05);
		Duration t2 = Duration.between(pastWeekLocalDate.atTime(0,0), data04.atTime(0,0));
		Duration t3 = Duration.between(pastWeekLocalDate.atStartOfDay(), data04.atStartOfDay());
        /*Colocar um time em um Local Date, possibilitando realizar o calculo de duração. */
		
		Duration t4 = Duration.between(data06, pastWeekInstant);
		System.out.println();
		System.out.println("t1 dias: " + t1.toDays());
		System.out.println("t2 dias: " + t2.toDays());
		System.out.println("t3 dias: " + t3.toDays());
		System.out.println("t4 dias: " + t4.toDays());


	}

}
