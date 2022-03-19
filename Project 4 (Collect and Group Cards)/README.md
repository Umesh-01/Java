## Project 4

#### _Collect and Group Cards_

Write a program to collect and store all the cards to assist the users in finding all the cards in a given
symbol.

This cards game consist of N number of cards. Get N number of cards details from the user and store
the values in Card object with the attributes symbol and number.

Store all the cards in a map with symbol as its key and list of cards as its value. Map is used here to
easily group all the cards based on their symbol.

Once all the details are captured print all the distinct symbols in alphabetical order from the Map. For
each symbol print all the card details, number of cards and their sum respectively.

**Sample input output :**

Enter Number of Cards :

13

Enter card 1:

s

1

Enter card 2:

s

12

Enter card 3:

s

13

Enter card 4:

d

4

Enter card 5:

c

5

Enter card 6:

h

5

Enter card 7:

h

7

Enter card 8:

c

3

Enter card 9:

c

2

Enter card 10:

h

9

Enter card 11:

s

7

Enter card 12:

d

4

Enter card 13:

d

3

Distinct Symbols are :

c d h s

Cards in c Symbol

c 5

c 3

c 2

Number of cards : 3

Sum of Numbers : 10

Cards in d Symbol

d 4

d 4

d 3

Number of cards : 3

Sum of Numbers : 11

Cards in h Symbol

h 5

h 7

h 9

Number of cards : 3

Sum of Numbers : 21

Cards in s Symbol

s 1

s 12

s 13

s 7

Number of cards : 4

Sum of Numbers : 33
