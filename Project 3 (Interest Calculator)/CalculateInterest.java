package cse_pblj;

import java.util.Scanner;
import cse_pblj.InvalidDaysException;
import cse_pblj.InvalidAgeException;
import cse_pblj.InvalidAmountException;
import cse_pblj.InvalidMonthsException;

public class CalculateInterest {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        
		System.out.println("Select any one option from the following: ");
		System.out.println("1. Interest Calculator for SBAccount");
		System.out.println("2. Interest Calculator for FDAccount");
        System.out.println("3. InterestCalculator for RDAccount");
        
		int choice = sc.nextInt();
        
		switch (choice) {
            case 1:
                                
                try {
                	
                	SBAccount sb = new SBAccount();
                    System.out.println("Interest gained is : " + sb.calculateInterest());

                } 
                catch (InvalidAmountException e) {
                    System.out.println("Invalid Amount entered.");
                }

                break;

            case 2:
                try {
                    
                	FDAccount fd = new FDAccount();
                    System.out.println("Interest gained is: " + fd.calculateInterest());
                } 
                catch (InvalidAgeException e) {
                    System.out.println("Invalid Age entered.");
                } 
                catch (InvalidAmountException e) {
                    System.out.println("Invalid Amount entered");

                } 
                catch (InvalidDaysException e) {
                    System.out.println("Invalid Days entered");

                }
                           
                break;
                
            case 3:
                try {
                	
                    RDAccount rd = new RDAccount();
                    System.out.println("Interest gained is: " + rd.calculateInterest());
                } 
                catch (InvalidAgeException e) {
                    System.out.println("Invalid Age entered.");
                } 
                catch (InvalidAmountException e) {
                    System.out.println("Invalid Amount entered.");

                } 
                catch (InvalidMonthsException e) {
                    System.out.println("Invalid Months entered.");
                }

                break;

            default:
                System.out.println("Selected incorrect option.");

        }
		
    }

}
