package Java8.streams.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DoubleIntList {

	public static void main(String[] args) {

		List<Integer> listInt = Arrays.asList(1,3,5,7,9);
		
		List<String> list = Arrays.asList("Borra","Prasad");
		
		//Java 6
		List<Integer> listJ6Int = new ArrayList<>();
		for(int value: listInt) {
			listJ6Int.add(value *2);
		}
		
		System.out.println("Java 6 - Double of each element in the list: "+listJ6Int);
		
		//Java 8
		List<Integer> listJ8Int = listInt.stream().map(value -> {
			value = value * 2;
			
			return value;
			
		}).collect(Collectors.toList());
		
		
		List<String> listStr = list.stream()
        .map(s -> {
            System.out.println("Before: " + s);
            s += "-" + s.toLowerCase();
            System.out.println("After: " + s);
            return s;
        }).collect(Collectors.toList());
		System.out.println("Java 8 - Doble of each element in the list:  "+listJ8Int);
	}

}
