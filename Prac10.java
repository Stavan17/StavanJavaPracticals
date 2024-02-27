package ClassPracticals;
import java.util.Scanner;
public class Prac10
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter numerator : ");
		int numerator = scanner.nextInt();
		System.out.print("Enter denominator : ");
		int denominator = scanner.nextInt();
		try
		{
			int result = divide(numerator, denominator);
			System.out.println("Result of division : " + result);
		}
		catch (ArithmeticException e)
		{
			System.out.println("Error : " + e.getMessage());
		}
		catch (Exception e)
		{
			System.out.println("An error occurred : " + e.getMessage());
		}
		finally
		{
			scanner.close();
		}
		System.out.println("Program completed.");
	}
	public static int divide(int numerator, int denominator) throws ArithmeticException
	{
		if (denominator == 0)
		{
			throw new ArithmeticException("Divison by zero is not allowed.");
		}
		return numerator / denominator;
	}
}