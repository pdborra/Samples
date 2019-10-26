import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class CompareTwoDatesEx {

	public static void main(String[] args) {

		LocalDate fromDate = LocalDate.of(2018, Month.AUGUST, 04);
		LocalDate toDate = LocalDate.now();
		
		Period period = Period.between(fromDate, toDate);
		System.out.println(period.getYears());
	}

}
