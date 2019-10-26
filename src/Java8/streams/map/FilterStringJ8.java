package Java8.streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStringJ8 {

	public static void main(String[] args) {

		List<String> listStr = Arrays.asList("Raju", "Rani", "Mathri", "Dhonga");
		
		List<String> filteredList = listStr.stream().filter(str -> !str.equalsIgnoreCase("Dhonga")).collect(Collectors.toList());
		
		System.out.println(filteredList);
	}

}
