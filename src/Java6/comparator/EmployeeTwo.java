package Java6.comparator;

import java.util.Comparator;

public class EmployeeTwo {

	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "[Employee two: name = "+name+" age = "+age+"]";
	}
	
	//Anonymous classes to sort EmployeeTwo
	public static Comparator<EmployeeTwo> sortByName = new Comparator<EmployeeTwo>() {
		@Override
		public int compare(EmployeeTwo emp11, EmployeeTwo emp12) {
			return emp11.getName().compareTo(emp12.getName());
		}
	};
	
	
	
	public static Comparator<EmployeeTwo> sortByAge = new Comparator<EmployeeTwo>() {
		@Override
		public int compare(EmployeeTwo emp11, EmployeeTwo emp12) {
			return emp11.getAge()-emp12.getAge();
		}
	};
	
	
	
}
