package Java6;

import java.util.Arrays;


public class StringArraySortEx {

	public static void main(String[] args) {

		String[] studentNames = new String[] {"abc","hrtra","yerass","ordsds","skdjlkfsd"};
		
		System.out.println(studentNames.toString());
		Arrays.sort(studentNames);
		//Collections.sort(studentNames);
		System.out.println(studentNames.toString());
		
		for(String name:studentNames) {
			System.out.println(name);
		}

	}
}
