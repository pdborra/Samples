import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamCollectorsGroupEx {

	public static void main(String[] args) {

		List<String> items = Arrays.asList("apple", "apple","bananna", "bananna", "bananna","papaya","orange");
		
		Map<String, Long> result = items.stream()
										.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		Map<String, String> result2 = items.stream()
											.collect(Collectors.groupingBy(Function.identity(), Collectors.joining()));
		
		String result3 = items.stream().collect(Collectors.joining());
		
		//System.out.println(result);
		//System.out.println(result2);
		//System.out.println(result3);
		
		//Sort a map and add to the final map
		Map<String, Long> finalMap = new HashMap<>();
		result.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue()
				.reversed()).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));
		
		//System.out.println("Map :::: "+finalMap);
		
		//Method grouping with Items
		
		List<Items> itemsList = Arrays.asList(
								 	new Items("Bananna", 2, new BigDecimal("9.99")),
								 	new Items("Pappaya", 4, new BigDecimal("10.44")),
								 	new Items("orange", 6, new BigDecimal("12.99")),
								 	new Items("Bananna", 2, new BigDecimal("9.99")),
								 	new Items("Pappaya", 4, new BigDecimal("10.44")),
								 	new Items("Pappaya", 2, new BigDecimal("9.99")),
								 	new Items("Bananna", 6, new BigDecimal("12.99"))
								);
		
		
		//Group by + count
		Map<String, Long> counting = itemsList.stream().collect(Collectors.groupingBy(Items::getName, Collectors.counting()));
		System.out.println("Total Items Count::  "+counting);
		
		//Group by + Sum Qty
		Map<String, Integer> sum = itemsList.stream().collect(Collectors.groupingBy(Items:: getName, Collectors.summingInt(Items::getQty)));
		System.out.println("Total Quantity ::: "+sum);
		
		Map<String, Integer> sumByJava6 = new HashMap<>();
		for(Items item: itemsList) {
			if(sumByJava6.size() > 0 && sumByJava6.containsKey(item.getName())) {
				sumByJava6.put(item.getName(), sumByJava6.get(item.getName())+item.getQty());
			}else {
				sumByJava6.put(item.getName(), item.getQty());
			}
		}
		
		System.out.println("This is Before Java6:: "+sumByJava6);
		
		//Group by price, uses mapping to convert List<Items> to Set<Items>
		
		
		Map<BigDecimal, Set<String>> itemResult = itemsList.stream().collect(Collectors.groupingBy(Items::getPrice, Collectors.mapping(Items::getName, Collectors.toSet())));
		System.out.println("GroupByItemsResults::: "+ itemResult);
	}

}
