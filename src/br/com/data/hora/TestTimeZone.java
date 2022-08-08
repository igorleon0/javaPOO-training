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
		
		LocalDate local01 = LocalDate.ofInstant(data06, ZoneId.systemDefault());
		LocalDate r1 = LocalDate.ofInstant(data06, ZoneId.systemDefault());
		
		System.out.println("Data 06: ");

		
		
		
		
	}
	

}
