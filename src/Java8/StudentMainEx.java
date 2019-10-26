package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMainEx {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student("xszzz",23));
		students.add(new Student("zzzzxfrd", 16));
		students.add(new Student("absdfs", 55));
		students.add(new Student("barsss", 89));
		
		System.out.println("This is before sorting+ "+students);
		
		Collections.sort(students, Student.byName2);
		System.out.println("Without lamda sort method: "+ students);
		
		students.sort(Student.byName2);
		System.out.println("With lamda sort method: "+students);
		students.sort((s1, s2)->s1.getName().compareTo(s2.getName()));
		students.sort(Student.byAge);
		System.out.println("By Age:: "+students);
	}

}
