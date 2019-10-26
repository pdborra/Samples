package Java8.streams.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertStringsToUpper {

	public static void main(String[] args) {

		List<String> listStr = Arrays.asList("Prasad","borra","Mulapadava");
		
		//Before Java8
		List<String> listJ6Upper = new ArrayList<>();
		for(String str: listStr) {
			listJ6Upper.add(str.toUpperCase());
		}
		System.out.println("Java 6:: "+listJ6Upper);
		//From Java8
		List<String> listUpper = listStr.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		System.out.println("Java 8:: " +listUpper);
	}

}
