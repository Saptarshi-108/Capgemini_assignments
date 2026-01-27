package collections;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class NewDateExample{
	public static void main(String args[]) {
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.now();
		
		System.out.println("Date: "+date);
		System.out.println("Time: "+time);
		System.out.println("DateTime: "+dateTime);
		
		DateTimeFormatter newFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatted = dateTime.format(newFormat);
		System.out.println("Formatted DateTime: "+ formatted);
		
	}
}
