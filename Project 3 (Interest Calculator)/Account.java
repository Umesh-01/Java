package cse_pblj;

public abstract class Account {

	double interestRate;
	double amount;
	
	public abstract double calculateInterest() throws InvalidAgeException, InvalidAmountException, InvalidDaysException, InvalidMonthsException;
	
	
}
