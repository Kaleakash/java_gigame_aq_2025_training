package streamapi;

import java.util.Arrays;
import java.util.List;

public class StudentStreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> listOfStudents = Arrays.asList(
				new Student(1, "Ravi", "maths", "Bangalore", 78),
				new Student(2, "Ramesh", "bio", "Bangalore", 88),
				new Student(3, "Rajesh", "che", "Delhi", 78),
				new Student(4, "Ram", "maths", "Bangalore", 78),
				new Student(5, "Raju", "bio", "Mumbai", 48),
				new Student(6, "Ajay", "maths", "Bangalore", 68),
				new Student(7, "Vikash", "che", "Delhi", 98),
				new Student(8, "John", "maths", "Bangalore", 78),
				new Student(9, "Ali", "bio", "Delhi", 88),
				new Student(10, "steven", "che", "Mumbai", 78)
				);
		// display all student details one by one 
		//listOfStudents.stream().forEach(s->System.out.println(s));
		// apply filter 
		//listOfStudents.stream().filter(s->s.getMarks()>85).forEach(s->System.out.println(s));
		//listOfStudents.stream().mapToInt(e->e.getMarks()+2).forEach(s->System.out.println(s));
		//listOfStudents.stream().map(e->new Student(e.getSid(), e.getSname(), e.getSubject(), e.getLocation(), e.getMarks()+2)).forEach(s->System.out.println(s));
	}

}
