package br.com.data.hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestLocalDate {

	public static void main(String[] args) {

		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html

		DateTimeFormatter formatter01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatter02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		LocalDate data01 = LocalDate.now(); // Data Local.
		LocalDateTime data02 = LocalDateTime.now(); // Data e hora Local.
		Instant data03 = Instant.now(); // Data e hora no padrão GMT.

		LocalDate data04 = LocalDate.parse("2022-10-15"); // fomato de texto para data-hora.
		LocalDateTime data05 = LocalDateTime.parse("2022-10-15T12:59:31");
		Instant data06 = Instant.parse("2022-10-15T12:59:31Z");
		Instant data07 = Instant.parse("2022-10-15T12:59:31-03:00");

		LocalDate data08 = LocalDate.parse("15/10/1999", formatter01);
		LocalDateTime data09 = LocalDateTime.parse("15/10/1999 12:59", formatter02);

		LocalDate data10 = LocalDate.of(2022, 8, 10);
		LocalDateTime data11 = LocalDateTime.of(2022, 8, 10, 1, 30);

		System.out.println("Data 01: " + data01);
		System.out.println("Data 02: " + data02);
		System.out.println("Data 03: " + data03);
		System.out.println("Data 04: " + data04);
		System.out.println("Data 05: " + data05);
		System.out.println("Data 06: " + data06);
		System.out.println("Data 07: " + data07);
		System.out.println("Data 08: " + data08);
		System.out.println("Data 09: " + data09);
		System.out.println("Data 10: " + data10);
		System.out.println("Data 11: " + data11);

	}

}
