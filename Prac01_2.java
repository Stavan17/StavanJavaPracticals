package ClassPracticals;
import java.util.Scanner;
public class Prac01_2 {
	int a, b, c;
	public static void main (String[] args)
	{
		Prac01_2 o1 = new Prac01_2();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1 : ");
		o1.a = sc.nextInt();
		System.out.println("Enter number 2 : ");
		o1.b = sc.nextInt(); 
		o1.c = o1.a + o1.b;
		System.out.println(o1.a + " + " + o1.b + " = " + o1.c);
	}
}