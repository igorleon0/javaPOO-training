package br.com.data.hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class TestTimeZone {

	public static void main(String[] args) {

		LocalDate data04 = LocalDate.parse("2022-10-15");
		LocalDateTime data05 = LocalDateTime.parse("2022-10-15T12:59:31");
		Instant data06 = Instant.parse("2022-10-15T12:59:31Z");

		LocalDateTime r1 = LocalDateTime.ofInstant(data06, ZoneId.systemDefault());
		LocalDateTime r2 = LocalDateTime.ofInstant(data06, ZoneId.of("Portugal"));
		// LocalDate r3 = LocalDate.ofInstant(data06, ZoneId.systemDefault());

		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);

		System.out.println("data 04 dia = " + data04.getDayOfMonth());
		System.out.println("data 04 mês = " + data04.getMonthValue());
		System.out.println("data 04 ano = " + data04.getYear());

		System.out.println("data 05 hora = " + data05.getHour());
		System.out.println("data 05 minutos = " + data05.getMinute());

	}

}
