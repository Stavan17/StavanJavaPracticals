package ClassPracticals;
import java.util.Scanner;
public class Prac03_1 {
	 public static void main(String[] args) {
		 	Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number to calculate its factorial : ");
	        int number = scanner.nextInt();
	        long factorial = calculateFactorial(number);
	        System.out.println("Factorial of " + number + " is : " + factorial);
	        System.out.print("Enter the number of terms for Fibonacci series: ");
	        int n = scanner.nextInt();
	        System.out.println("Fibonacci series up to " + n + " terms:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(fibonacci(i) + " ");
	        }
	        System.out.println("");
	        System.out.println("Enter a number to calculate the sum of its digits: ");
	        int num = scanner.nextInt();
	        int sum = calculateSumOfDigits(num);
	        System.out.println("Sum of digits of " + num + " is: " + sum);
	        scanner.close();
	        scanner.close();
	    }
	    private static long calculateFactorial(int n) {
	        if (n < 0) {
	            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
	        }
	        if (n == 0 || n == 1) {
	            return 1;
	        } else {
	            return n * calculateFactorial(n - 1);
	        }
	    }
	    private static int fibonacci(int n) {
	        if (n <= 1) {
	            return n;
	        } else {
	            return fibonacci(n - 1) + fibonacci(n - 2);
	        }
	    }
	    private static int calculateSumOfDigits(int n) {
	        if (n < 0) {
	            throw new IllegalArgumentException("Input should be a non-negative integer.");
	        }
	        int sum = 0;
	        while (n > 0) {
	            sum += n % 10; 
	            n /= 10;        
	        }
	        return sum;
	    }
}