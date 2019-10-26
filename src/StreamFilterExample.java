import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("One");
		list.add("Three");
		list.add("Two");
		list.add("Six");
		
		List<String> filterList = list.stream()//Convert list to stream
										.filter(l -> !"Three".equals(l))//don't like Three
										.collect(Collectors.toList());//collect the out put and convert stream to list
		
		filterList.forEach(System.out::println);
		
		List<Person> personList = Arrays.asList(
											new Person("PD", 12),
											new Person("Borra", 20),
											new Person("Prasad", 25)
											);
		
		Person person = null;
		for(Person pers: personList) {
			if("Prasad".equals(pers.getName())) {
				person = pers;
			}
		}
		
		System.out.println(person);
		
		//Java 8
		Person person8 = personList.stream()//Convert List to Stream
									.filter(per -> "Prasad".equals(per.getName())) // We want Prasad only
									.findAny() // if findAny then return
									.orElse(null);// if not find then retun null
		
	}

}
