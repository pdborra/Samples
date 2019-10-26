package Java8.streams.map;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertStaffToStaffPubJ8 {

	public static void main(String[] args) {

		List<Staff> staffList = Arrays.asList(
								new Staff("Borra",32, new BigDecimal(12344)),
								new Staff("PD", 20, new BigDecimal(3434343)),
								new Staff("Suri", 40, new BigDecimal(777777))
								);
	
		//Can convert inside map method directly
		List<StaffPublic> staffPubList = staffList.stream().map(staff ->{
			StaffPublic staffObj = new StaffPublic();
			staffObj.setName(staff.getName());
			staffObj.setAge(staff.getAge());
			return staffObj;
		}).collect(Collectors.toList());
		
		System.out.println(staffPubList);
	}

}
