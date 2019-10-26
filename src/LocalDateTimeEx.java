import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String date = "2018-09-12";
		//Default ISO_LOCAL_DATE
		LocalDate localDate = LocalDate.parse(date);
		System.out.println(localDate);
		
		DateTimeFormatter oldPattern = DateTimeFormatter.ofPattern("yyyy-dd-MM");
		DateTimeFormatter newPattern = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
		LocalDate localDateFormate = LocalDate.parse(date, oldPattern);
		
		String patternDate = localDateFormate.format(newPattern);
		System.out.println(patternDate);
		LocalDate ld = LocalDate.parse(patternDate, newPattern);
		
		String stt = newPattern.format(ld);	
		System.out.println(newPattern.format(ld));
		
		Instant instant = Instant.now();
		System.out.println("instant  " +instant);
		ZonedDateTime zdt = instant.atZone(ZoneId.of("CET"));
		System.out.println("zdt " + zdt);
		System.out.println("offset "+zdt.getOffset());
		
		
	}

}
