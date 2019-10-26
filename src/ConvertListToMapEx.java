import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListToMapEx {

	public static void main(String[] args) {

		Map<Long, String> map1 = new HashMap<>();
		map1.put(1L, "Prasad");
		map1.put(3L, "dddd");
		map1.put(1L, "ddd");
		map1.put(4L, "Ddd");
		
		System.out.println(map1);
		
		Map<Long, String> sortMap = map1.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry:: getValue));
		
		System.out.println(sortMap);
		
		
		
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(5, "Borra"));
		list.add(new Employee(1, "Prasad"));
		list.add(new Employee(2, "Pd"));
		list.add(new Employee(1, "Saad"));
		list.add(new Employee(0, "xxx"));
		
		Map<Long, String> map = list.stream()
				.collect(Collectors.toMap(Employee::getId, Employee::getEmpName, (oldValue, newValue) -> newValue, LinkedHashMap::new));
		
		System.out.println("Convert from List to Map:: "+map);
		
		//Sorting
		
		Map<Long, String> mapSort = list.stream().sorted(Comparator.comparingLong(Employee::getId))
				.collect(Collectors.toMap(Employee::getId, Employee::getEmpName, (oldValue, newValue) -> newValue, LinkedHashMap::new));
		
		System.out.println("SortedMAp:: "+mapSort);
	}
	
}