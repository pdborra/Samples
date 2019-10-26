package Java8.streams.map;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class FilterObjectJ8 {

	public static void main(String[] args) {

		List<Staff> staffList = Arrays.asList(
				new Staff("Rama", 400, new BigDecimal(4443333)),
				new Staff("Sitha", 399, new BigDecimal(433333)),
				new Staff("Lakshaman", 389, new BigDecimal(343433))
				);
		
		String name = "Rama";
		
		Staff staff = staffList.stream().filter(staf -> staf.getName().equals(name)).findAny().orElse(null);
		
		System.out.println(staff);
	}

}
