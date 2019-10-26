import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapSortingEx {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		
		map.put("k", 9);
		map.put("d", 2);
		map.put("a", 1);
		map.put("z", 4);
		map.put("h", 5);
		map.put("m", 6);
		map.put("d", 5);
		map.put("b", 2);
		map.put("c", 8);
		
		System.out.println("Original map:: "+map);
		
		//sort by keys and returns as LinkedHashMpa
		//use toMap to return the LinkedHashMap
		
		Map<String, Integer> sortedMap = map.entrySet().stream().sorted(Map.Entry.comparingByKey())
					.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
							(oldValue, newValue) -> oldValue, LinkedHashMap::new ));
		
		System.out.println("Map after sorting :::  "+sortedMap);
		
		
		//Not Recommend
		Map<String, Integer> sortedMap2 = new LinkedHashMap<>();
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEachOrdered(x -> sortedMap2.put(x.getKey(), x.getValue()));
		System.out.println("Not recommend sorting2 ::: "+sortedMap2);
		
		
		//Sort by Values ex: 1,2,3,...
		Map<String, Integer> sortByValue1 = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		
		System.out.println("Sorted by value::  "+sortByValue1);
		
		//SortBy value2 in reverse ex: 10,9,8,7...
		
		Map<String, Integer> sortByValue2 = new LinkedHashMap<>();
				
				map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.forEachOrdered(x -> sortByValue2.put(x.getKey(), x.getValue()));
				
	 System.out.println("Sorted by Value in reverse order:::  "+sortByValue2);
	}

}
