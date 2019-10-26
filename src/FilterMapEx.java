import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterMapEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(5, "xxx");
		map.put(2, "gdfdfd");
		map.put(1, "dfdfdf");
		map.put(5, "dfdfdfd");
		
		
		System.out.println(map);
		String result = "";
		
		//Before java8
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			if("dfdfdf".equals(entry.getValue())){
				System.out.println("Key:: "+ entry.getKey() + " Value:: "+entry.getValue());
				result = entry.getValue();
			}
		}
		
		System.out.println("Result value:: "+result);
		//From Java8 => You can convert a Map.entrySet() into a Stream() follwed by filter() and collect it.
		
		String result2 = map.entrySet().stream().filter(x -> x.getValue().equals("dfdfdf"))
				.map(x -> x.getValue()).collect(Collectors.joining());
		
		System.out.println("Java8 filter result2:: "+ result2);
		
		//Return Map
		Map<Integer, String> resultMap = map.entrySet().stream().filter(x -> x.getKey().equals(1)).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		System.out.println("MapResult:: "+resultMap);
		
		//One more way to return map
		Map<Integer, String> resultMap2 = map.entrySet().stream().filter(x->x.getKey().equals(1))
				.collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));
		
		System.out.println("One More way to return map 2 :: "+resultMap2);
	}

}
