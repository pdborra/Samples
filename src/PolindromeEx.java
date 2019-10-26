import java.io.InputStream;
import java.util.stream.IntStream;

public class PolindromeEx {

	public static void main(String[] args) {

		String pol = "41 4", reverse = ""; 
		
		
		PolindromeEx.isPolindrome2(pol);
		System.out.println("String lenght is : "+pol.length());
		
		for(int i = pol.length()-1; i >= 0; i--) {
			System.out.println(" i "+ i);
			reverse = reverse + pol.charAt(i);
		}
		
		if(pol.equals(reverse)) {
			System.out.println("Polindrom:: "+ reverse);
		}else {
			System.out.println("Not Polindrome:: "+reverse);
		}
	}


public boolean isPolindrome(String input) {
	StringBuilder reverse = new StringBuilder(input).reverse();
	
	return reverse.toString().equals(input);
	
}

public static boolean isPolindrome2(String input) {
	String temp = input.replaceAll("\\s+", "").toLowerCase();
	System.out.println(temp);
	
	System.out.println("range :: "+IntStream.range(0, input.length() / 2));
	
	return IntStream.range(0, input.length() / 2).noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
	
}

}
