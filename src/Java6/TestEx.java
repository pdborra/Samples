package Java6;

import java.util.HashMap;
import java.util.Map;

public class TestEx {
	
	int a;
	static int b =50;

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>() {/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

		{
			put("1", "Prasad");
			put("2", "Borra");
			put("3","PD");
		}};
		
		System.out.println(map);
		TestEx tx = new TestEx();
		tx.a = 10;
		System.out.println("Tx::: "+tx.a);
		tx.b = 30;
		System.out.println("Tx Static::: "+tx.b);


		TestEx tx2 = new TestEx();
		tx2.a = 20;
		tx2.b = 40;
		System.out.println("Tx2::: "+tx2.a);
		System.out.println("Tx2 Static:: "+tx2.b);
		
		System.out.println("End:::tx "+tx.b);
		
		System.out.println("End:::b "+b);
		
		SampleThisEx thisEx = new SampleThisEx();
		
		System.out.println(" This Keyword ex::: "+thisEx.getFullName("Prasad"));
		
				
	}

}
