package javapractice;
public class Datatypes {
	public static void main(String[] args) {
		byte a = 127;
		short b = 32767;
		int c = 2147483647;
		long d = 9223372036854775807L;
		float e = 3.14f;
		double f = 3.141592653589793;
		char g = 'A';
		boolean h = true;
		System.out.println("ByteVariable : " + a);
		System.out.println("ShortVariable : " + b);
		System.out.println("IntVariable : " + c);
		System.out.println("LongVariable : " + d);
		System.out.println("FloatVariable : " + e);
		System.out.println("DoubleVariable : " + f);
		System.out.println("CharVariable : " + g);
		System.out.println("BooleanVariable : " + h);
		String i = "Hello World";
		System.out.println("StringVariable : " + i);
		int[] J = {1, 2, 3, 4, 5};
		System.out.print("J : ");
		for (int k : J)
		{
			System.out.print(k + " ");
		}
	}
}