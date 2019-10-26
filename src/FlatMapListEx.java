import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMapListEx {

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<>();
		Employee emp = new Employee(1, "PD");
		emp.addSkills("Java");
		emp.addSkills("J2EE");
		emp.addSkills("SpringBoot");
		
		employeeList.add(emp);
		
		Employee emp2 = new Employee(2, "Borra");
		emp2.addSkills("Java");
		emp2.addSkills("Spring");
		emp2.addSkills("Hibernate");
		
		employeeList.add(emp2);
		
		employeeList.add(new Employee(2,"Borra"));
		employeeList.add(new Employee(3, "Prasad"));
		
		//Before Java8
		List<String> empNames = new ArrayList<>();
		for(Employee empName: employeeList) {
			if(empName.getEmpName() !=null) {
				empNames.add(empName.getEmpName());
			}
		}
		//System.out.println(empNames);
		
		//In Java8
		List<String> empNamesJ8 = employeeList.stream().map(Employee::getEmpName).collect(Collectors.toList());
		
		//empNamesJ8.forEach(System.out::println);
		
		//Get the List of skills
		List<String> empSkills = employeeList.stream().map(x->x.getSkills())//Stream<Set<String>>
				.filter(x->x !=null)
				.flatMap(x->x.stream())//Stream<String>
				.distinct()
				.collect(Collectors.toList());
		
		empSkills.forEach(System.out::println);
		
		int[] intArray = {1,2,3,4,5};
		
		Stream<int[]> streamArray = Stream.of(intArray);//Stream<int[]>
		IntStream intStream = streamArray.flatMapToInt(Arrays::stream);
		intStream.forEach(System.out::println);
	}

}
