package Java6.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeComparatorMainEx {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();
		
		Employee emp1 = new Employee();
		emp1.setName("abx");
		emp1.setAge(20);
		emp1.setSal(1234531);
		
		Employee emp2 = new Employee();
		emp2.setName("dxsefr");
		emp2.setAge(64);
		emp2.setSal(4344);
		
		Employee emp3 = new Employee();
		emp3.setName("zaabx");
		emp3.setAge(12);
		emp3.setSal(433333);
		
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		
		System.out.println("Before sorting:: " + employees);
		
		Collections.sort(employees, new EmployeeByAge());
		System.out.println("Employees by age : " + employees);
		Collections.sort(employees, new EmployeeByName());
		System.out.println("Employee by Nane: "+employees);
		Collections.sort(employees, new EmployeeBySal());
		System.out.println("Employee by Salary: "+employees);
	}

}
