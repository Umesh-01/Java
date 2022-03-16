package cse_pblj;

import java.util.Scanner;
import cse_pblj.InvalidMonthsException;
import cse_pblj.InvalidAgeException;
import cse_pblj.InvalidAmountException;

public class RDAccount extends Account {
	
	double interestRate;
	double amount;
	int noOfMonths;
	double monthlyAmount;
	double genCitizen, senCitizen;

    Scanner RDScanner = new Scanner(System.in);

    public double calculateInterest() throws InvalidMonthsException,InvalidAmountException ,InvalidAgeException {
        
    	System.out.println("Enter the amount for RDAccount:");
        amount = RDScanner.nextDouble();
        
        System.out.println("Enter the months for RD:");
        noOfMonths = RDScanner.nextInt();
        
        System.out.println("Enter the age for RDAccount holder:");
        int age = RDScanner.nextInt();

        if (amount < 0) {
            throw new InvalidAmountException();
        }
        if(noOfMonths < 0){
            throw new InvalidMonthsException();
        }
        if(age < 0){
            throw new InvalidAgeException();
        }
        
        if (noOfMonths >= 0 && noOfMonths <= 6) {
        	genCitizen = .0750;
            senCitizen = 0.080;
        } 
        else if (noOfMonths >= 7 && noOfMonths <= 9) {
        	genCitizen = .0775;
            senCitizen = 0.0825;
        } 
        else if (noOfMonths >= 10 && noOfMonths <= 12) {
        	genCitizen = .0800;
            senCitizen = 0.0850;
        } 
        else if (noOfMonths >= 13 && noOfMonths <= 15) {
        	genCitizen = .0825;
            senCitizen = 0.0875;
        } 
        else if (noOfMonths >= 16 && noOfMonths <= 18) {
        	genCitizen = .0850;
            senCitizen = 0.0900;
        } 
        else if (noOfMonths >= 22) {
        	genCitizen = .0875;
            senCitizen = 0.0925;
        }
        
        interestRate = (age < 60) ? genCitizen : senCitizen;

        return (amount * interestRate);

		
	}

}
