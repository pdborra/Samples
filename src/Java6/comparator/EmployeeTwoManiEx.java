package Java6.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeTwoManiEx {

	public static void main(String[] args) {
		
		List<EmployeeTwo> employees = new ArrayList<>();

		EmployeeTwo emp11 = new EmployeeTwo();
		emp11.setName("zzdsasd");
		emp11.setAge(12);
		
		EmployeeTwo emp12 = new EmployeeTwo();
		emp12.setName("abcd");
		emp12.setAge(50);
		
		EmployeeTwo emp13 = new EmployeeTwo();
		emp13.setName("zzzzdd");
		emp13.setAge(2);
		
		employees.add(emp11);
		employees.add(emp12);
		employees.add(emp13);
		
		System.out.println("Before Sorting:: "+employees);
		Collections.sort(employees, EmployeeTwo.sortByName);
		System.out.println("Sort by name:  "+employees);
		Collections.sort(employees, EmployeeTwo.sortByAge);
		System.out.println("Sort by Age:  "+employees);
		
	}

}
