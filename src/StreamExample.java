import java.util.HashSet;
import java.util.Set;

public class StreamExample {

	public static void main(String[] args) {

		/*Optional<List<String>> list = getList().orElseGet(() -> new Optional<ArrayList<String>>());
		
		Optional<List<String>> nullList = getNullList().orElseGet(() -> list);*/
		Employee emp = new Employee();
		emp.setId(2);
		emp.setEmpName("PDfww");
		Employee emp2 = new Employee();
		emp2.setId(3);
		emp2.setEmpName("PDccc");
		
		Set<Employee> set = new HashSet<Employee>();
		set.add(emp);
		set.add(emp2);
		/*set.add("Prasad");
		set.add("Borra");
		set.add("PDPD");*/
		System.out.println("Before modified::  "+ set);
		Set<Employee> set2 = new HashSet<Employee>(set); 
		//Employee name = new Employee();
		Employee name = set2.stream().findFirst().get();
		name.setId(4);
		//name.setEmpName("Four");
		set.add(name);
		System.out.println(set);
		
	}
	
	/*public static Optional<List<String>> getList(){
		List<String> list = new ArrayList<String>();
		list.add("xxx");
		list.add("yyy");
		return Optional.of(list);
	}
	
	public static Optional<List<String>> getNullList(){
		
		return Optional.of(null);
	}*/

}
