import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MethodReferenceExample {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.setName("xxxx2");
		person1.setAge(12);
		person1.setBirthDate(LocalDate.of(12, 2, 10));
		person1.setColor("Red");
		
		Person person2 = new Person();
		person2.setName("xxxx6");
		person2.setAge(10);
		person2.setBirthDate(LocalDate.of(10, 2, 10));
		person2.setColor("Red");
		
		Person person3 = new Person();
		person3.setName("xxxx3");
		person3.setAge(13);
		person3.setBirthDate(LocalDate.of(13, 2, 10));
		person3.setColor("Red");
		
		List<Person> personList = new ArrayList<>();
		personList.add(person1);
		personList.add(person2);
		personList.add(person3);
		
		Person[] personArray = personList.toArray(new Person[personList.size()]);
		
		//Sorting before Java 8
		Arrays.sort(personArray, new PersonAgeComparator());
		
		for(Person person: personArray) {
			System.out.println(person);
		}
		
		// With lambda expression
        /*Arrays.sort(personArray,
            (Person a, Person b) -> {
                return a.getBirthday().compareTo(b.getBirthday());
            }
        );*/
		
        // With method reference
        Arrays.sort(personArray, Person::compareByAge);
        
        Person p = new Person();
        
        ComparisonProvider cp = new ComparisonProvider();
        //String str = cp::compareByName;
        
        for(Person person: personArray) {
			System.out.println(person);
		}
		//Arrays.sort(personArray, (a, b) -> Person.compareByAge(a, b));
	}
	
}