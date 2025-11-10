
# Java Methods Part 1 - Practice Problems
The following problems will involve creating void methods both with and without parameters. Complete the following problems. You should create a single class file for each level - all level one problems can be written in Level1.java, level two problems in Level2.java, and level 3 problems in Level3.java. Every method should be called from the main method to check its functionality. 
## Level 1
- Write a method called printHello. The method should print the message “Hello there!” to the console without using any parameters.
- Write a method called printName. The method should print the message “Your name is <name”. The method should take a single string parameter for the name to be printed.
- Write a method called printMax. The method should have parameters for 3 integers, and should print out the largest integer of the three parameters. 
- Write a method called printInfo. The method should take parameters for a person’s name, age, and GPA. Then, the method should print out the following message to the console:
```
				Name: <name> | Age: <age> | GPA: <gpa>
```
## Level 2
- Create a Scanner object in the main method, and use the scanner to take user input for 2 integer values. Then, create a method called printCalcs which will take two integer parameters and print the results of the 5 basic math operations (add, subtract, multiply, divide, modulus) using the two numbers. 
- Create a Scanner object in the main method, and use the scanner to take user input for four double values (x1, y1, x2, y2). The values taken will correspond to two points on the XY plane (x1, y1) and (x2, y2). Then, create the following methods using the information from the values entered:
- printPoints: Will have parameters for four double values (x1, y1, x2, y2), and print out the correctly formatted points (x1, y1) and (x2, y2).
- printMidpoint: Will have parameters for four double values (x1, y1, x2, y2), and will print the midpoint value of the two points (x1, y1) and (x2, y2). 
- printDistance: Will have parameters for four double values (x1, y1, x2, y2), and will print the distance between the two points (x1, y1) and (x2, y2). 
- printSlope: Will have parameters for four double values (x1, y1, x2, y2), and will print the slope of the line connecting the two points (x1, y1) and (x2, y2). 

## Level 3
Create a Scanner object in the main method, and use the scanner to take user input for a password. Then, create a method called printPasswordStatus. The method will check the password to verify that it is valid. The following criteria must be true for the password to be valid:
 
- The password must be at least 6 characters long
- The password must have the number 1 in it somewhere
- The password must start with a capital P.
- If the password is valid, the method should print “<password> is a valid password.” If not, the method should print out the issue with the password. For example, “<password> is too short.” 
- You will need to write conditions for this problem, and use the length() method for Strings. Recall the 6 comparison operators: (==, !=, >, <, >=, <=) that are used to write conditional statements. 
