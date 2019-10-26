import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamNonNullEx {

	public static void main(String[] args) {

		Stream<String> language = Stream.of("dfdf", "fdfdfd", null, "fdfdfddf", "dfdfdssss", null);
		
		//List<String> languageList = language.collect(Collectors.toList());
		//System.out.println(languageList);
		
		//Display language without null
		
		/*List<String> languageWNull = language.filter(x-> x!= null).collect(Collectors.toList());
		System.out.println(languageWNull);*/
		
		List<String> langWNull = language.filter(Objects:: nonNull).collect(Collectors.toList());
		System.out.println(langWNull);
	}

}
