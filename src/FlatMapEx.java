import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapEx {

	public static void main(String[] args) {
		
		/*In Java8 Stream can hold diffent data types.
		But the Stream operations like filter, sum, distinct and Collectors..etc don not support it.
		We need flatMap() to do the conversation*/
		
		
		String[][] data = new String[][] {{"a","b"},{"c", "d"}, {"e", "f"}, {"g","h"} };
		
		Stream<String[]> temp = Arrays.stream(data);
		
		//Filter a stream of string[] and retrun a String[]
		//Stream<String[]> filterStream = temp.filter( x->"a".equals(x.toString()));
		//filterStream.forEach(System.out::println);//Returns empty
		
		Stream<String> stream = temp.flatMap(x->Arrays.stream(x)).filter(x->"a".equals(x.toString()));
		
		stream.forEach(System.out::println);
		
		
		
		
	}

}
