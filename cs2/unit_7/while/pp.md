# Java While Loops - Practice Problems


All problems in this set should be completed in a project called JavaLoops.  Each problem should get its own class and must be named starting with a letter.  For example, we could name the second problem in level 1: level 1_2.  Most programmers should be able to start at level 2, but if you have trouble, level 1 is provided to help you get started.

## Level 1
1. Write a program that asks the user to enter a number between 10 and 20.  Then, print “Java” on the screen that many times.
2. Write a program that acts as a countdown from 20 to 10. 
3. Write a program that asks a user to enter 9 numbers.  Find and display the total of those numbers.
4. Ask a user if they want to continue.  The program should keep running for any input they type except no.  Once the user enters no, exit the program.
5. Write a program that asks the user to enter a string that is longer than 5 characters.  Keep them in the loop as long as their string is 5 or less characters.

## Level 2
1. Write a program that asks a user how many numbers they want to enter.  Have them enter those numbers and then calculate and display the average of those numbers.  Use a while loop.
2. Write a program that asks the user to enter a number between 1 and 10.  Choose a random number between 1 and 10.  Let them know if they guessed the number or not.  Use a while loop and give them a maximum of three guesses.  At the end, be sure to output the random number for them to see. Also, let them know after each guess if the target number is higher or lower than their guess.  
3. Write a program that adds up all of the numbers that a user enters.  Do not ask the user ahead of time how many numbers they want to enter.  Instead, have them enter -999 to signal the end of their input.  Be sure not to include the -999 in the total.  At the end of the program, output the total of the number.  Use a while loop.
4. Write a program that generates two random numbers between 1 and 11 and finds/displays their total.  Then, use a while loop to add one new random number between 1 and 11 to the total if the user enters the word “HIT.” Continue this process until the user enters something other than “HIT.” At the end of the program, if the total is above 21, display the word “BUST.” If the total is exactly 21, display the word “WINNER.” Otherwise, display the total score in the form “Score: <total>.” 
5. Write a program that will check a user’s password to see if it is strong enough. A strong password is at least 10 characters long and also contains either a “$” symbol or a “#” symbol. Prompt the user until they enter a strong password. When they enter a strong password, print the message “Password Accepted” to the console. 

## Competition Level (You may use while or for loops for this problem)

AbundantNumbers - A positive divisor of some number K, which is different from K, is called a proper divisor of K.  For example, 1, 2 and 3 are proper divisors of 6.  In number theory, an abundant number is a number that is less than the sum of its proper divisors.  For example, 12 is an abundant number since it is less than 1+2+3+4+6=16.  The number 15 is not an abundant number since 1+3+5=9.  The number 6 is also not an abundant number because 1+2+3=6.  Write a program that reads one positive integer N and prints all ODD ABUNDANT numbers between 1 and N.  If the number N is ODD and ABUNDANT, the program will print N as well. (Hint: you will need nested loops here)

```
  Examples:
		Input			Output
		1000			945
		2000			945, 1575
		2205			945, 1575, 2205
```
