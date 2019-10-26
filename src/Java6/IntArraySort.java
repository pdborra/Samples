package Java6;

import java.util.Arrays;

public class IntArraySort {

	public static void main(String[] args) {

		int[] number = new int[] {11,2,23,4,0};
		
		int[] num2 = new int[4];
		
		num2[0] = 12;
		num2[1] = 23;
		
		String strArr[] = null;
		
		strArr = new String[3];
		strArr[0] = "a";
		strArr[1] = "b";
		
		for(String str: strArr) {
			System.out.println(str);
		}
		
		Arrays.sort(number);
		
		for(int num: number) {
			System.out.println(num);
		}
		
	}

}
