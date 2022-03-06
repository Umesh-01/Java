### PROJECT BASED LEARNING IN JAVA

### Assignment 1

#### Question 1

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
Given two strings, word and a separator, return a big string made of count occurrences of the word, separated by the separator string.

if the inputs are "Wipro","X" and 3 then the output is "WiproXWiproXWipro".

#### Question 4
Write a program

Create a new class called “Calculator” which contains the following:

1. A static method called powerInt(int num1,int num2) that accepts two integers and returns num1 to the power of num2 (num1 power num2).

2. A static method called powerDouble(double num1,int num2) that accepts one double and one integer and returns num1 to the power of num2 (num1 power num2).

3. Call your method from another class without instantiating the class (i.e. call it like Calculator.powerInt(12,10) since your methods are defined to be static)

Hint: Use Math.pow(double,double) to calculate the power.

#### Question 5
Write a Program:

 

Initialize two character variables in a program and display the characters in alphabetical order.

Eg1) if first character is s and second is e

O/P: e,s

Eg2) if first character is a and second is e

O/P:a,e
