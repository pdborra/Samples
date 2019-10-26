import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadFileEx {

	public static void main(String[] args) {

		String fileName = "G://Pd.txt";
		List<String> list = new ArrayList<>();
		try(Stream<String> stream = Files.lines(Paths.get(fileName))){
			//stream.forEach(System.out::println);
			list = stream.filter(x->!x.startsWith("line3"))
					.map(String::toUpperCase).collect(Collectors.toList());
			
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
		//list.forEach(System.out::println);
		
		try(BufferedReader br = Files.newBufferedReader(Paths.get(fileName))){
			list = br.lines().collect(Collectors.toList());
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
		//list.forEach(System.out::println);
		
		//Before Java8
		
		try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
	}

}
