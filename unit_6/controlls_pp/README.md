# Java Conditions - Practice Problems
 Each problem should get its own class and must be named starting with a letter.  For example, we could name the second problem in level 1: L1P2.java.  It is important that the class name is exactly the same as the file name.

## Level 1
- Write a program that asks the user to enter a number that is not 0.  The program should tell the user if their number is positive or negative.
- Write a program that asks the user to enter a number.  The program should tell the user if their number is even or odd.
- Write a program that asks the user if they would like to continue.  If they say yes, print "The program continues."  If they say no, print, "The program ends."
- Write a program that asks a user to enter a name shorter than 5 characters.  If they succeed, output the name, otherwise, output the first 5 characters of what they entered.
- Write a program that generates a random number between 1 and 10, asks the user for their guess, and then tells them if they are correct or incorrect.
- Store your name in a variable.  Ask the user for their name.  If their name is the same as yours, output “What a great name!”.  Otherwise, output, “Nice name, but not my favorite.”
- Take a word from a user and decide if it is in the first half of the alphabet (A-M) or in the second half of the alphabet (N-Z).  Use the String compareTo method.
- Ask the user if they want to see a square or a triangle.  Also, ask them the color that they want the shape to be drawn in.  Then, draw the appropriate shape using TurtleGraphics.

## Level 2
- Each disk drive in a shipment of devices is stamped with a code from 1 to 4, which indicates a manufacturer as follows:
  - 1                	3M Corporation
  - 2                	Maxell Corporation
  - 3                	Sony Corporation
  - 4                	Verbatim Corporation
         - Write a program that accepts the code number as input, and, based on the value entered, displays the correct 
         - manufacturer.mUse an if-else chain.
- The IRS uses an integer code to determine the marital status of people filing their tax returns.  The code is as follows:
  - S                	Single
  - M                	Married
  - D                	Divorced
  - W                	Widowed
        - Write a program that accepts the code character as an input, and then outputs the marital status.
- Ask the user to enter a username and password.  If the username is “Ali Baba” and the password is “abracadabra”, then they have appropriate login credentials – tell them so.  Otherwise, tell them that this information is restricted.  
- The game of craps is played with two dice.  Use Math.random to generate two numbers between 1 and 6, each representing the roll of a die.  The player rolls both die, if the sum is 7 or 11, they are an instant winner.  If the sum is 2 or 10, they are an instant loser.  Any other sum is set as the point and should be output.  Be sure to use a nested if structure.
- Write the code to generate a random card from a deck (Ace-King) in one of the appropriate suits (Clubs, Hearts, Diamonds, Spades).  The program should generate a random number for the suit and a random number for the card value.  Then, output the card name in the form “Ace of Clubs” or “10 of Hearts”.

- Write a program that could act as a personal calendar.  Ask the user to enter the information for a date (month, day, year).  Then, ask them for information regarding another date.  If the second is the same as the first, then show output that notifies them that there is a conflict in their schedule.  Otherwise, simply output that the date has been recorded.
- Ask the user for a time (hours and minutes).  Determine that each number is valid (1<=hours<=12 and 0<=minutes<=59).   If either part is not valid, tell the user.  Otherwise, state that the time is valid.
- Draw a line of length 20 using TurtleGraphics.  Then, ask the user 5 times if they want to turn left or right.  Each time, based on their decision, draw a new line in the appropriate direction.

## Level 3

- Write a program to convert a word in English to Pig Latin.  The conversion works in the following manner:
- If the word starts with a vowel, just place the letters “hay” at the end of the word.
- If the word starts with a consonant, move the first letter of the word to the end, and follow it by placing the letters “ay”.
- Similar to the way that String cannot use ==, they also cannot use > or < as that would compare their memory locations, not their content.  So, to compare strings, we need to use a compareTo method.  It works similar to the .equals method in that it is called from one string and takes another as a parameter (s1.compareTo(s2)).  The compareTo method returns a positive if s1 comes after s2, 0 if they are the same and a negative if s1 comes before s2.  Store the following strings in variables and output the result of the compareTo functions as they are called on each other (Apple, apple, banana).  How would you use this in a condition?  Use this information to write a console program that takes two Strings from a user and outputs which one is first alphabetically.
- Write a program that asks a user for a password.  The password MUST meet the following criteria:
  - The password should be five characters long
  - The first character should be an uppercase letter(LOOK UP ASCII CODE IN JAVA)
  - The last character should be a lowercase letter (AGAIN – ASCII CODE)
  - The third character should be a digit. (AGAIN – ASCII CODE)
      - Write a program that runs each of the above checks and determines if the password is valid.

## Level 4 *(optional extra credit)*
- Write  a program that takes a year.  The program is to determine if the year is a leap year or not.  Leap years are divisible by 4, unless it is also divisible by 100 but not 400.  For example, 2003 is not, but 2004 is.  1900 is not, but 2000 is.  If they input a year before 1582, output an error message stating that there were no leap years before then.
Examples:
```
	1980 – leap year
	1900 – not
	1200 – not
	2000 – leap year
		3000 – not
```
- Bob was invited to a certain royal wedding in a foreign country.  The bride and groom requested that donations be made to charity in lieu of wedding gifts, and Bob has decided to follow this route.  Unfortunately, the gifts are in a foreign currency, which Bob finds confusing.  He want to put the donation on a credit card, but the credit card also charges a fee, given by the larger of a percentage of the transaction cost, or a fixed amount.  For example, the company might charge the large of 2.5% or $5.00.  that charge is assessed after rounding the gift to the nearest cent.  Write a program that converts currency and tells Bob the amount that would be charged to his credit card.  Your program should take inputs for <Foreign Currency>, <Exchange Rate>, <Percentage>, <Minimum> and display the amount charged to the nearest cent.  Foreign Currency is the amount of the donation.  Exchange rate is the cost in dollars for one unit of the foreign currency.  Percentage and Minimum refer to the additional charges for the credit card company.  
  - For example, the input 100.00,  1.66648,  2.5,  5 means he gives 100.00 units of the currency, each unit costs $1.66648 and the credit card company charges the larger of 2.5% and $5.00.  In this case, the cost of the currency would be  $166.648 and 2.5% of this is $4.166199, so the company would charge $5.00 since it is larger.  The total would be $171.65 (rounded to the nearest cent).  
	
Examples:
```
	Input				Output
	100.00, 1.66648, 2.5, 5		171.65
	100.00, 1.66648, 2.5, 3		170.81
	1000.00, 1.66648, 3, 5		1716.47
		1000.00, 0.600067, 5, 5		  630.07
```
