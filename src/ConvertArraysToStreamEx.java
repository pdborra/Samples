import java.util.Arrays;
import java.util.stream.Stream;

public class ConvertArraysToStreamEx {

	public static void main(String[] args) {

		String[] strArray = {"Prasad", "Borra", "PD", "MP"};
		
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(System.out::println);
		
		Stream<String> strStreamOf = Stream.of(strArray);
		
		strStreamOf.forEach(System.out::println);
	}

}
