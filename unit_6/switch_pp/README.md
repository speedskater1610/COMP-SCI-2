#  Java Switch Statements - Practice Problems
All problems in this set should be completed in a project called JavaConditions. Each problem should get its own class and must be named starting with a letter. For example, we could name the second problem in level 1: level 1_2. Most programmers should be able to start at level 2, but if you have trouble, level 1 is provided to help you get started.

## Level 1 ( 1 point each)
- Each disk drive in a shipment of devices is stamped with a code from 1 to 4, which indicates a manufacturer as follows:
```
1        	3M Corporation
2        	Maxell Corporation
3        	Sony Corporation
4        	Verbatim Corporation
```
  - Write a program that accepts the code number as input, and, based on the value entered, displays the correct manufacturer. Use a switch structure.
- The IRS uses a character code to determine the marital status of people filing their tax returns. The code is as follows:
```
S        	Single
M        	Married
D        	Divorced
W        	Widowed
```
  - Write a program that accepts the code number as input, and, based on the value entered, displays the correct manufacturer. Use a switch structure.

# Level 2 (2 points each)
The game of craps is played with two dice. Use Math.random to generate two numbers between 1 and 6, each representing the roll of a die. The player rolls both die, if the sum is 7 or 11, they are an instant winner. If the sum is 2 or 10, they are an instant loser. Any other sum is set as the point. Be sure to use a switch structure.
Write a program that stores two integers from the user and allows them to enter a character. If they enter A, add the numbers, M – multiply the numbers, S – subtract the numbers, D – divide the numbers(be careful of division by 0). Display the results of your arithmetic. Use a switch statement.
Write the code to generate a random card from a deck. A-K in one of the appropriate suits (Clubs, Hearts, Diamonds, Spades). The program should generate a random number for the suit and a random number for the card value. Then, output the card name in the form “Ace of Clubs” or “10 of Hearts”. Use switch statements for the output conditions.
Advanced (3 points each)
The McDowell Restaurant chain has asked you to write a menu program for their new fast-food service machines. Your program should print a menu like this:
```
*************************************
McDowell’s Restaurant
*************************************
Make your selection from the menu below:
Regular Hamburger			$1.50
Regular Cheeseburger			$1.75
Fish Sandwich				$2.50
Half-pounder with cheese		$2.75
French Fries				$0.99
Large soft drink				$1.25
**************************************
Select 1, 2, 3, 4, 5, or 6----->
```
Your program should read the customer's selection and compute the price, including 6.5% sales tax. Note that using this menu, the customer can make just one selection. The input is one number between 1 and 6. 

The program should print the message:

Please pay [print amount here] dollars.
Thank you for eating at McDowell’s.

		The output should have two decimal digits after decimal points.

