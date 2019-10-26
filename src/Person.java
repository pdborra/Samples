import java.time.LocalDate;

public class Person {
	
	String name;
	int age;
	String color;
	public enum Sex {
		MALE, FEMALE
	}
	Sex gender;
	LocalDate birthDate;
	String emailAddress;
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Sex getGender() {
		return gender;
	}
	public void setGender(Sex gender) {
		this.gender = gender;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public static int compareByAge(Person a, Person b) {
		return a.birthDate.compareTo(b.birthDate);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person() {
		
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", color=" + color + ", gender=" + gender + ", birthDate="
				+ birthDate + ", emailAddress=" + emailAddress + "]";
	}
	
	

}
