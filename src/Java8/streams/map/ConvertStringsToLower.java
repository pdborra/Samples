package Java8.streams.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertStringsToLower {

	public static void main(String[] args) {

		List<String> listStr = Arrays.asList("PraSaD", "BoRRa","MulaPaDAVA");
		
		//Before Java 8
		List<String> listJ6Lower = new ArrayList<>();
		for(String str: listStr) {
			listJ6Lower.add(str.toLowerCase());
		}
		
		System.out.println("listJ6Lower::  "+listJ6Lower);
		
		List<String> listLower = listStr.stream().map(String::toLowerCase).collect(Collectors.toList());
		
		System.out.println("Java 8::: "+listLower);
	}

}
