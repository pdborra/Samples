package Java8;

import java.util.Comparator;

public class Student {

	private String name;
	private int age;
	
	public Student() {
		
	}
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
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
		return "[Student : name= "+name+" age= "+age+"]";
	}
	
	//Java 6
	public static Comparator<Student> byName = new Comparator<Student>() {
		@Override
		public int compare(Student one, Student two) {
			return one.getName().compareTo(two.getName());
		}
	};
	
	public static Comparator<Student> byName2 = (Student one, Student two) -> one.getName().compareTo(two.getName());
	
	public static Comparator<Student> byAge = (age1, age2) -> age1.getAge() - age2.getAge();
	
	
	
}
