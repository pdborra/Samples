package Java8.streams.map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import common.Employee;

public class EmpNames {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee("Borra", 1213232, 32));
		empList.add(new Employee("Prasad", 34343433,31));
		
		//Java6
		List<String> empNames = new ArrayList<String>();
		for(Employee emp: empList) {
			empNames.add(emp.getName());
		}
		
		System.out.println("Java 6: Employee names: "+empNames);
		
		//Java8
		List<String> empNamesJ8 = empList.stream().map(emp -> emp.getName()).collect(Collectors.toList());
		
		System.out.println("Java 8: Employee names: "+empNamesJ8);
	}

}
