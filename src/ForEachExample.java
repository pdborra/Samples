import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachExample {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		
		map.put("1", "One");
		map.put("2", "Two");
		map.put("3", "Three");
		
		for(Map.Entry<String, String> mapVal: map.entrySet()) {
			System.out.println("Key :: "+ mapVal.getKey() +" Value: " + mapVal.getValue());
		}
		
		//Java 8
		
		map.forEach((k, v) -> System.out.println("8 Key:  "+k + " Value: "+v));
		map.forEach((k, v) ->{
			System.out.println("8 Key: "+k + " Value: "+v);
			if("1".equals(k)) {
				System.out.println("Selected value is: "+v);
			}
		});
		
		List<String> list = new ArrayList<>();
		list.add("PD");
		list.add("Prasad");
		list.add("Borra");
		list.add("SmartBorra");
		//list.forEach(System.out::println);
		
		list.stream().filter(s-> s.contains("Borra")).forEach(System.out::println);
		
	}

}
