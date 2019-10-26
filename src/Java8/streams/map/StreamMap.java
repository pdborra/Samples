package Java8.streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {

	public static void main(String[] args) {

		List<String> listStr = Arrays.asList("1","2","3","4");
		
		//Stream<Integer> intStream = listStr.stream();
		
		List<Integer> listInt = listStr.stream().map(Integer::valueOf).collect(Collectors.toList());
		
		System.out.println("listInt:: "+listInt);
		
		
	}

}
