package Java6;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import Java8.streams.map.Staff;

public class FilterObjectJ6 {

	public static void main(String[] args) {

		List<Staff> staffList = Arrays.asList(
								new Staff("Rama", 400, new BigDecimal(4443333)),
								new Staff("Sitha", 399, new BigDecimal(433333)),
								new Staff("Lakshaman", 389, new BigDecimal(343433))
								);
		
		Staff staff = getStaffByName(staffList, "Rama");
		System.out.println(staff);
	}
	
	
	public static Staff getStaffByName(List<Staff> staffList, String name) {
		Staff stafResult = null;
		for(Staff staf: staffList) {
			if(staf.getName() != null && staf.getName().equals(name)){
				stafResult = staf;
			}
		}
		
		return stafResult;
	}

}
