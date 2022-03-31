package aula4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TesteData {
	public static void main(String[] args) {
		LocalDate d1;
		d1 = LocalDate.of(2000, 2, 5);
		LocalDate d2= LocalDate.now();
		
		System.out.println(d1);
		System.out.println(d1.getDayOfYear());
		System.out.println(d1.getDayOfMonth());
		System.out.println(d1.getDayOfWeek());
		
		System.out.println(d2.isAfter(d1));
		System.out.println(d2.isBefore(d1));
		
		System.out.println(d1.until(d2));
		System.out.println(d1.until(d2).getClass().getName());
		System.out.println(d1.until(d2).getYears());
		
		DateTimeFormatter format = 
				DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(d1.format(format));
	}
}
