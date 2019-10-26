package Java6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FliterJ6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> listStr = Arrays.asList("Rani", "Raju", "Mathri", "Dhonga");
		
		List<String> filteredList = getFilterOutPut(listStr);
		
		System.out.println(filteredList);
	}
	
	public static List<String> getFilterOutPut(List<String> listStr) {
		List<String> filteredList = new ArrayList<String>();
		
		for(String str: listStr){
			if(!str.equalsIgnoreCase("Dhonga")) {
				filteredList.add(str);
			}
		}
		return filteredList;
	}

}
