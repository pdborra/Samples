package Java6.comparator;

public class EmployeeSingleton {
	
	private EmployeeSingleton() {};
	
	private static EmployeeSingleton employee= null;
	
	public static EmployeeSingleton getEmployeeSingleton() {
		if(employee == null) {
			employee = new EmployeeSingleton();
		}
		
		return employee;
	}

}
