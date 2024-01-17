import prac.Student;

public class Prac6{
	public static void main(String[] args)
	{
		Student s1 = new Student();
		System.out.println("Enter Student Data : ");
		s1.getData();
		System.out.println("Student Data you entered is : ");
		s1.displayData();
		s1.average();
	}
}