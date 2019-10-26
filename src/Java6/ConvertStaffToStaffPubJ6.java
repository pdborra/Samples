package Java6;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import Java8.streams.map.Staff;
import Java8.streams.map.StaffPublic;

public class ConvertStaffToStaffPubJ6 {

	public static void main(String[] args) {

		List<Staff> staffList = new ArrayList<>();
		staffList.add(new Staff("Prasad", 32, new BigDecimal(343434343)));
		staffList.add(new Staff("Raju", 34, new BigDecimal(34343)));
		staffList.add(new Staff("Rani", 35, new BigDecimal(3333333)));
		
		List<StaffPublic> staffPubList = convertToStaffPublic(staffList);
		
		
		System.out.println("StaffPublic now: "+staffPubList);
	}
	
	public static List<StaffPublic> convertToStaffPublic(List<Staff> staffList){
		List<StaffPublic> staffPubList = new ArrayList<>();
		
		for(Staff staff: staffList) {
			StaffPublic staffPub = new StaffPublic();
			staffPub.setName(staff.getName());
			staffPub.setAge(staff.getAge());
			
			staffPubList.add(staffPub);
		}
		
		return staffPubList;
	
	}
	
	
}


