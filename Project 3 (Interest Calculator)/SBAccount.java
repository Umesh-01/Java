package cse_pblj;

import java.util.Scanner;
import cse_pblj.InvalidAmountException;

public class SBAccount extends Account {
	
	double interestRate;
	double amount;
	
    
	Scanner SBScanner = new Scanner(System.in);
    
    public double calculateInterest() throws InvalidAmountException {
        
    	System.out.println("Enter the average amount in SBAccount: ");
        amount = SBScanner.nextDouble();
    	
        if(amount < 0 ){
        	
        	throw new InvalidAmountException();
            
        }
        
        System.out.println("Select account type:");
		System.out.println("1. NRI");
		System.out.println("2. Normal");
        int accType = SBScanner.nextInt();
        
        switch (accType) {
            case 1:
                interestRate = .06;
                break;
 
            case 2:
                interestRate = .04;
                break;
            
            default:
                System.out.println("Selected incorrect account.");
                
        }
        
     return (amount * interestRate);
   
    }
}
