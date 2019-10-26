import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinerEx {

	public static void main(String[] args) {

		StringJoiner sj = new StringJoiner(",");
		sj.add("a");
		sj.add("b");
		sj.add("c");
		sj.add("d");
		
		System.out.println(sj.toString());
		
		//Join a string by delimiter and starting with a supplied prefix and ending with a supplied suffix
		StringJoiner sj2 = new StringJoiner("/","prefix-", "-suffix");
		sj2.add("2016");
		sj2.add("02");
		sj2.add("26");
		
		System.out.println(sj2.toString());
		
		//String.join() to join
		List<String> list = Arrays.asList("Java","Python",".Net");
		String str = String.join(",", list);
		
		System.out.println(str);
		
		//Collectors joining
		String result = list.stream().map(x->x).collect(Collectors.joining("|"));
		System.out.println(result);
		//Give prefix and suffix using Collectors.joining
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(1,"Prasad"));
		employeeList.add(new Employee(2,"Borra"));
		employeeList.add(new Employee(3, "PD"));
		
		String result2 = employeeList.stream().map(x->x.getEmpName()).collect(Collectors.joining(",", "{", "}"));
		System.out.println(result2);
	}

}
