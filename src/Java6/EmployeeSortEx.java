package Java6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import common.Employee;

public class EmployeeSortEx {

	public static void main(String[] args) {

		Employee emp1 = new Employee("Prasad", 1000000000, 5);
		Employee emp2 = new Employee("fdfd",23232,1);
		Employee emp3 = new Employee("dsfsdfsd",332222,4);
		Employee emp4 = new Employee("Dsfsds",15000,3);
		Employee emp5 = new Employee("dfdfd",2100,2);
		
		List<Employee> employeDetails = new ArrayList<Employee>();
		
		employeDetails.add(emp1);
		employeDetails.add(emp2);
		employeDetails.add(emp3);
		employeDetails.add(emp4);
		employeDetails.add(emp5);
		
		System.out.println("Unsorted List:: "+employeDetails);
		
		Collections.sort(employeDetails);
		
		System.out.println("Sorrted list:: "+employeDetails);
	}

}
