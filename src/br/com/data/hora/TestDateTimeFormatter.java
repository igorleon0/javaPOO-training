package br.com.data.hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TestDateTimeFormatter {

	public static void main(String[] args) {

		LocalDate data04 = LocalDate.parse("2022-10-15");
		LocalDateTime data05 = LocalDateTime.parse("2022-10-15T12:59:31");
		Instant data06 = Instant.parse("2022-10-15T12:59:31Z");

		DateTimeFormatter formatter01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatter02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter formatter03 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")
				.withZone(ZoneId.systemDefault());
		DateTimeFormatter formatter04 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter formatter05 = DateTimeFormatter.ISO_INSTANT;

		System.out.println("Data 04: " + data04.format(formatter01));
		
		System.out.println("Data 05: " + data05.format(formatter02));
		System.out.println("Data 05: " + data05.format(formatter04));

		System.out.println("Data 06: " + formatter03.format(data06));
		System.out.println("Data 06: " + formatter05.format(data06));

	}

}
