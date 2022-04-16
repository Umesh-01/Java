### PROJECT BASED LEARNING IN JAVA

### Assignment 1
-----------------

#### Question 1


> Source Code: ArrayProgram.java


Write a program that takes as input the size of the array and the elements in the array. The program then asks the user to enter a particular index and prints the element at that index. Index starts from zero.


 This program may generate Array Index Out Of Bounds Exception or NumberFormatException . Use exception handling mechanisms to handle this exception.



Sample Input and Output 1:

Enter the number of elements in the array

2

Enter the elements in the array

50

80

Enter the index of the array element you want to access

1

The array element at index 1 = 80

The array element successfully accessed

 

 Sample Input and Output 2:

Enter the number of elements in the array

2

Enter the elements in the array

50

80

Enter the index of the array element you want to access

9

java.lang.ArrayIndexOutOfBoundsException
 

 Sample Input and Output 3:

Enter the number of elements in the array

2

Enter the elements in the array

30

j

java.lang.NumberFormatException

#### Question 2

> Source Code: AuthorBook.java

Create a class called Author is designed as follows:

 

It contains:

• Three private instance variables: name (String), email (String), and gender (char of either ‘m’ or ‘f’).

• One constructor to initialize the name, email and gender with the given values.

 

And, a class called Book is designed as follows:

It contains:

• Four private instance variables: name (String), author (of the class Author you have just created), price (double), and qtyInStock (int). Assuming that each book is written by one author.

• One constructor which constructs an instance with the values given.

• Getters and setters: getName(), getAuthor(), getPrice(), setPrice(), getQtyInStock(), setQtyInStock(). Again there is no setter for name and author.

Write the class Book (which uses the Author class written earlier).

Try:

1. Printing the book name, price and qtyInStock from a Book instance. (Hint: aBook.getName())

2. After obtaining the “Author” object, print the Author (name, email & gender) of the book.

#### Question 3

> Source Code: StringSeparator.java

Given two strings, word and a separator, return a big string made of count occurrences of the word, separated by the separator string.

if the inputs are "Wipro","X" and 3 then the output is "WiproXWiproXWipro".

#### Question 4

> Source Code: CalculatePower.java

Write a program

Create a new class called “Calculator” which contains the following:

1. A static method called powerInt(int num1,int num2) that accepts two integers and returns num1 to the power of num2 (num1 power num2).

2. A static method called powerDouble(double num1,int num2) that accepts one double and one integer and returns num1 to the power of num2 (num1 power num2).

3. Call your method from another class without instantiating the class (i.e. call it like Calculator.powerInt(12,10) since your methods are defined to be static)

Hint: Use Math.pow(double,double) to calculate the power.

#### Question 5

> Source Code: CharactersInOrder.java

Write a Program:

 

Initialize two character variables in a program and display the characters in alphabetical order.

Eg1) if first character is s and second is e

O/P: e,s

Eg2) if first character is a and second is e

O/P:a,e


### Assignment 2
-----------------

#### Question 1

> Source Code: CountryCapital.java

1. Develop a java class with a instance variable CountryMap HashMap (M1) 

 * add a method saveCountryCapital(String CountryName, String capital) ,

 * the method should add the passed country and capital as key/value in the map M1 and return the Map (M1).

Key- Country                         Value - Capital

India                                                  Delhi

Japan                                               Tokyo

2. Develop a method getCapital(String CountryName) which returns the capital for the country passed from the Map M1 created in step 1.

3. Develop a method getCountry(String capitalName) which returns the country for the capital name passed from the Map M1 created in step 1.

4. Develop a method which iterates through the map M1 and creates another map M2 with Capital as the key and value as Country and returns the Map M2.

Key – Capital                   Value – Country

Delhi                                          India

Tokyo                                       Japan

5. Develop a method which iterates through the map M1 and creates an ArrayList with all

the Country names stored as keys. This method should return the ArrayList.

NOTE: You can test the methods using a main method.

#### Question 2

> Source Code: EmpDetails.java

Write a java program that connects to oracle database, queries the inbuilt table “emp” and displays the first two columns (empno using column index and ename using column name ) of all the rows.

#### Question 3

> Source Code: 

Write a java program that establishes a connection to oracle database successfully. If the connection is successful, it should display a message “Connection Established successfully”. In case, it is not able to do so due to any exception, it should display the message “Connection could not be established “. If there is an exception, it should also display the description of the exception.

#### Question 4

> Source Code: 

Create a class Employee and implement the below method in the class.

Write Junit testcases to test the below given method:
 

public String findName(ArrayList employees,String name){

 String result="";

 if(employees.contains(name)){

  result="FOUND";

 }else{

  result="NOT FOUND";

 }

 return result;

 }

#### Question 5

> Source Code: 

Write a program to store a group of employee names into a HashSet, retrieve the elements one by one using an Iterator.
