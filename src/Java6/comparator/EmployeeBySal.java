package Java6.comparator;

import java.util.Comparator;

public class EmployeeBySal implements Comparator<Employee>{
	
	@Override
	public int compare(Employee emp1, Employee emp2) {
		
		return emp1.getSal() - emp2.getSal();
	}

}
