package ClassPracticals;
public class Prac12 {
	public static void main(String[] args)
	{
		String str1 = "Hello";
		String str2 = "World";
		String str3 = "Hello";
		String concatstring = str1 + ", " + str2;
		System.out.println("Concatenated String : " + concatstring);
		int length = str1.length();
		System.out.println("Length of str1 : " + length);
		if (str1.equals(str3))
		{
			System.out.println("str1 is equal to str3");
		}
		else
		{
			System.out.println("str1 is not equal to str3");
		}
		String substring = str1.substring(1, 3);
		System.out.println("Substring of str1 : " + substring);
		int index = str2.indexOf('o');
		System.out.println("Index of 'o' in str2 : " + index);
		String uppercasestr = str2.toUpperCase();
		System.out.println("Uppercase of str2 : " + uppercasestr);
		String replacedstr = str2.replace('o', 'x');
		System.out.println("str2 after replacement : " + replacedstr);
	}
}