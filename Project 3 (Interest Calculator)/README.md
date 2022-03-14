## Project 3

Calculate interest based on the type of the account and the status of the account holder. The rates of interest changes according to the amount (greater than or less than 1 crore), age of account holder (General or Senior citizen) and number of days if the type of account is FD or RD.

Some sample rates are given in the below tables:

Rate of FD interest for amounts below 1 Crore:


|  | Current Rates of Interest | |
| -------------- | -------------- | -------------- |
| Maturity Period | General | Senior Citizen |
| 7 days to 14 days | 4.50 | 5.00 |
| 15 days to 29 days | 4.75 | 5.25 |
| 30 days to 45 days | 5.50 | 6.00 |
| 45 days to 60 days | 7 | 7.50 |
| 61 days to 184 days | 7.50 | 8.00 |
| 185 days to 1 year | 8.00 | 8.50 |


Rate of FD interest for amounts above 1 Crore:

Maturity Period | Interest Rate
--------------- | -------------
7 days to 14 days | 6.50
15 days to 29 days | 6.75
30 days to 45 days | 6.75
45 days to 60 days | 8
61 days to 184 days | 8.50
185 days to 1 year | 10.00

Rate of RD interests:

|  | Current Rates of interest |  |
| --- | ------ | --------- |
| Maturity Period | General | Senior Citizen |
| 6 months | 7.50 | 8.00 |
| 9 months | 7.75 | 8.25 |
| 12 months | 8.00 | 8.50 |
| 15 months | 8.25 | 8.75 |
| 18 months | 8.50 | 9.00 |
| 21 months | 8.75 | 9.25 |

SB Account interest rates:

| Type of Account | Interest Rate |
| ----- | ----- |
| Normal | 4% |
| NRI | 6% |

Requirements:
1. Separate classes should be created for the different types of accounts.
2. All classes should be derives from an abstract class named ‘Account’ which contains a method called ‘calculateInterest’.
3. Implement the calculateInterest method according to the type of the account, interest rates, amount and age of the account holder.
4. If the user is entering any invalid value (For eg. Negative value) in any fields, raise a user defined exception.

Sample class structure is given below:

| Account(Abstract) |
| ---------------- |
| double interestRate |
| double amount |
| abstract double calculateInterest() |

FDAccount
double interestRate
double amount
int noOfDays
ageOfACHolder
abstract double calculateInterest()
SBAccount
double interestRate
double amount
abstract double calculateInterest()
RDAccount
double interestRate
double amount
int noOfMonths;
double monthlyAmount;
abstract double calculateInterest()
Hint: Use method overriding
Sample Output:
Select the option:
1. Interest Calculator –SB
2. Interest Calculator –FD
3. Interest Calculator –RD
4. Exit
1
Enter the Average amount in your account:
10000
Interest gained: Rs. 400
Select the option:
1. Interest Calculator –SB
2. Interest Calculator –FD
3. Interest Calculator –RD
4. Exit
2
Enter the FD amount:
10000
Enter the number of days:
91
Enter your age:
65
Interest gained is: 800
Select the option:
1. Interest Calculator –SB
2. Interest Calculator –FD
3. Interest Calculator –RD
4. Exit
2
Enter the FD amount:
10000
Enter the number of days:
91
Enter your age:
34
Interest gained is: 750
Select the option:
1. Interest Calculator –SB
2. Interest Calculator –FD
3. Interest Calculator –RD
4. Exit
2
Enter the FD amount:
10000
Enter the number of days:
-7
Enter your age:
78
Invalid Number of days. Please enter correct values.
