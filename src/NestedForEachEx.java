import java.util.ArrayList;
import java.util.List;

public class NestedForEachEx {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<String> list3 = new ArrayList<String>();
		
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("D");
		list1.add("E");
		
		list2.add("Z");
		list2.add("B");
		list2.add("C");
		list2.add("X");
		list2.add("Y");
		
		list1.forEach(listOne -> {
			list2.stream().filter(listTwo -> listOne.equals(listTwo)).forEach(listTwo->{
				//list1.remove(listOne);
				//list2.remove(listTwo);
				list3.add(listOne);
			});
		});
		
		System.out.println("List 1 :::  "+list1);
		System.out.println("List 2 :::  "+list2);
		System.out.println("List 3 :::  "+list3);
	}
}
