package extra;

import java.util.InputMismatchException;

public class MathOperation {
	
	public static void main(String[] args) {
		int n = args.length;
		
		for (int i = 0; i < n; i++) {
			if (args[i].charAt(args[i].length() - 1) == ',') 
				args[i] = args[i].replace(",", "");
		}
		
		
		int[] arr = new int[n];

		int sum = 0;
		double average = 0;
		
		try {
			for (int i = 0; i < n; i++)
				arr[i] = Integer.parseInt(args[i]);
			
			for (int i = 0; i < n; i++)
			sum += arr[i];
			
			average = sum / n;
		} 
		catch (NumberFormatException e) {
			System.out.println("NumberFormatException");
		} 
		catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		} 
		catch (InputMismatchException e) {
			System.out.println("InputMismatchException");
		}
		
		System.out.println("Sum is: " + sum);
		System.out.println("Average is: " + average);
		
	}

}
	

