package extra;

import java.util.Scanner;

public class DivisionOperator {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int a = sc.nextInt();

		System.out.println("Enter second number: ");
		int b = sc.nextInt();
		
		try {
			double r = division(a, b);
			System.out.println("Result: "+r);
		} 
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}
	
	public static double division(int a, int b) throws ArithmeticException {
		return a / b;
	}

}


