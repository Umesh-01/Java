package cse_pblj;

import java.util.Scanner;
import cse_pblj.InvalidDaysException;
import cse_pblj.InvalidAgeException;
import cse_pblj.InvalidAmountException;

public class FDAccount extends Account {
	
	double interestRate;
	double amount;
	int noOfDays;
	int ageOfACHolder;
	double genCitizen, senCitizen;
	
	
    Scanner FDScanner = new Scanner(System.in);

    public double calculateInterest() throws InvalidAgeException,InvalidAmountException ,InvalidDaysException {

    	System.out.println("Enter the amount for FDAccount:");
    	amount = FDScanner.nextDouble();

        System.out.println("Enter no. days for FD:");
        noOfDays = FDScanner.nextInt();
        
        System.out.println("Enter the age for FD holder:");
        ageOfACHolder = FDScanner.nextInt();
        
        if (amount < 0) {
            throw new InvalidAmountException();
        }
        
        if(noOfDays<0){
            throw new InvalidDaysException();
        }
        
        if(ageOfACHolder<0){
            throw new InvalidAgeException();
        }
        
        if (amount < 10000000) {
            if (noOfDays >= 7 && noOfDays <= 14) {
                genCitizen = 0.0450;
                senCitizen = 0.0500;
            } 
            else if (noOfDays >= 15 && noOfDays <= 29) {
            	genCitizen = 0.0470;
            	senCitizen = 0.0525;
            } 
            else if (noOfDays >= 30 && noOfDays <= 45) {
            	genCitizen = 0.0550;
            	senCitizen = 0.0600;
            } 
            else if (noOfDays >= 45 && noOfDays <= 60) {
            	genCitizen = 0.0700;
            	senCitizen = 0.0750;
            } 
            else if (noOfDays >= 61 && noOfDays <= 184) {
            	genCitizen = 0.0750;
            	senCitizen = 0.0800;
            } 
            else if (noOfDays >= 185 && noOfDays <= 365) {
            	genCitizen = 0.0800;
            	senCitizen = 0.0850;
            }
            
            interestRate = (ageOfACHolder < 60) ? genCitizen : senCitizen;
        }
        
        else {
            if (noOfDays >= 7 && noOfDays <= 14) {
                interestRate = 0.065;
            } 
            else if (noOfDays >= 15 && noOfDays <= 29) {
                interestRate = 0.0675;
            } 
            else if (noOfDays >= 30 && noOfDays <= 45) {
                interestRate = 0.00675;
            } 
            else if (noOfDays >= 45 && noOfDays <= 60) {
                interestRate = 0.080;
            } 
            else if (noOfDays >= 61 && noOfDays <= 184) {
                interestRate = 0.0850;
            } 
            else if (noOfDays >= 185 && noOfDays <= 365) {
                interestRate = 0.10;
            }

        }

        return (amount * interestRate);

		
	}
}
