package ClassPracticals;
public class Prac01_1 {
	int a = 10, b = 20, c;
	public static void main(String[] args)
	{
		Prac01_1 o1 = new Prac01_1();
		o1.c = o1.a + o1.b;
		System.out.println(o1.a + " + " + o1.b + " = " + o1.c);
	}
}