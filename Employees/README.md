### Project:1

Given the following table containing information about employees of an organization, develop a small java application, which accepts employee id from the command prompt and displays the following details as output:

Emp No Emp Name Department Designation and Salary

You may assume that the array is initialized with the following details:

|  Emp No. | Emp Name | Join Date | Design Code | Dept | Basic | HRA | IT |
| ------- | ------- | ------- | ------- | ------- | ------- | ------- | ------- |
1001 Ashish 01/04/2009 e R&D 20000 8000 3000 1002 
Sushma 23/08/2012 c PM 30000 12000 9000 1003 
Rahul 12/11/2008 k Acct 10000 8000 1000 1004
Chahat 29/01/2013 r Front Desk 12000 6000 2000 1005 
Ranjan 16/07/2005 m Engg 50000 20000 20000 1006 
Suman 1/1/2000 e Manufacturing 23000 9000 4400 1007 
Tanmay 12/06/2006 c PM 29000 12000 10000

Salary is calculated as Basic+HRA+DA-IT. (DA details are given in the Designation table)
Designation details : Designation Code Designation DA e Engineer 20000 c Consultant 32000 k Clerk 12000 r Receptionist 15000
m Manager 40000
Use Switch-Case to print Designation in the output and to find the value of DA for a particular employee.
O/P Expected:
1. Assuming that your class name is Project1, and you execute your code as
java Project1 1003, it should display the following output :
Emp No. Emp Name Department Designation Salary
1003 Rahul Acct Clerk 29000
2. java Project1 123
There is no employee with empid : 123
