# AP Computer Science - A
# Practice Problems 0.1 - Variables, IO, Conversions

<!-- 
USE THIS FORMAT FOR QUESTIONS


1.

```
Example
```

*Note: *

#### Solution:

<details>
<summary>Click to view Solution</summary>
  
```java

```
</details>

---

-->

**Directions**  

Complete the practice problems below in your coding workspace. You should be able to talk through and explain each problem. Comment your code, practice good indentation, name your variables appropriately, etc. Keep it clean!

1. Create a new file called Problem1.java and create a main method in that file. Then, create variables for a person´s name, age, GPA, and if they are taking a computer science class (a boolean). Assign literal values to these variables. Then, print out the following statement to the console using a single print statement:

```
Name : <name>
Age : <age>
GPA : <rounded gpa>
CS : <boolean value>
```

*Note: The printed GPA value should be rounded to 1 decimal place. Use tab characters to line up the data nicely!*

#### Solution:

<details>
<summary>Click to view Solution</summary>
  
```java
public class Problem01 {
    public static void main(String[] args){
        String name = "Russel";
        int age = 16;
        double gpa = 3.7;
        boolean isTakingCompSci = true;
        
        System.out.printf("Name: %s\nAge: %d\nGPA: %.2f\nCS: %b\n", name, age, gpa, isTakingCompSci);
    }
}
```
</details>

---

2. Create a new Java file called Problem2.java and create a main method in that file. Then, create a Scanner object named `reader` inside the main method. Prompt the user to enter in five integer values followed by a class name. Then, calculate an average of the value they entered. Finally, print out the following message to the console:

```
Your average value was <average> for <class>.
```

*Note: The average value printed should be rounded to 3 decimal places. Also, note that average calculations should always result in double values!*

#### Solution:

<details>
<summary>Click to view Solution</summary>
  
```java
import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Enter 5 ints: ");
        int sum = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.print("\t" + i + ": ");
            sum += reader.nextInt();
        }
        
        System.out.printf("AVG: %.3f", sum / 5);
    }
}
```
</details>

---


3. Create a new Java file called Problem3.java and create a main method in that file. Then, create a Scanner object named reader inside the main method. Use the scanner to take input from the user for three number values. Store each input they enter as a string (use the nextLine() method to take them). Then, convert these values into numeric values and calculate their sum. Print the sum of the values to the console. 

#### Solution:

<details>
<summary>Click to view Solution</summary>
  
```java
import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 3 nums: ");
        double sum = 0;
        
        for (int i = 0; i < 3; i++) {
            System.out.print("\t" + i + ": ");
            sum += Double.parseDouble(sc.nextLine());
        }
        
        System.out.printf("sum: %.3f\n", sum);
    }
}
```
</details>

---

4.Create a new Java file called Problem4.java and create a main method in that file. Then, create a Scanner object named reader inside the main method. Use the Scanner to take input from the user for three test scores (as double values). Then, create a constant variable for a score curve percentage (a positive integer value, 5 → 5% increase, 11 → 11% increase, etc.). Calculate each of the test scores adding in the curve percentage. Then, print a message to the console using the follow format:

```
Test 1 : Raw = <original score> … Curved = <curved score>
```

*Note: Round both the raw and curved score to one decimal place when printing them.*

#### Solution:

<details>
<summary>Click to view Solution</summary>
  
```java
import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int curve = 5;
        
        System.out.println("Enter 3 test scores: ");
        
        for (int i = 0; i < 3; i++) {
            System.out.print("\t" + i + ": ");
            double score = sc.nextDouble();
            System.out.printf(
                "Test %d : Raw = %.2f\tCurved = %.2f",
                i, score, score * (1.0 + ((double)curve / 100.0))
            );
        }
    }
}
```
</details>

---

5. Create a new Java file called Problem4.java and create a main method in that file. Use a single print statement to print the following message to the console:

```
My favorite quote is:
“I must not fear…
Fear is the mind killer.”
```

#### Solution:

<details>
<summary>Click to view Solution</summary>
  
```java
Create a new Java file called Problem4.java and create a main method in that file. Use a single print statement to print the following message to the console:

				My favorite quote is:
				“I must not fear…
				Fear is the mind killer.”
```
</details>

---

6. Create a new Java file called Problem6.java and create a main method in that file. Then, create a Scanner object named reader inside the main method. Use the Scanner to take user input for 3 integer values, which will be stored as the values of a, b, and c for a standard form quadratic. Recall a standard form of quadratic:


```
ax^2 + bx + c = 0
```

Calculate the zeroes using the quadratic equation. Then, print the zeroes to the console. 

*Note: Your program should not divide by zero - the user must enter in a non-zero value for a. If they do not, end the program and print a message to the console telling them that they did not enter in a valid value for coefficient a. Use an if statement to do this!*

- Tip: Recall the methods Math.pow() and Math.sqrt() to help you with this problem…

#### Solution:


<details>
<summary>Click to view Solution</summary>
  
```java
import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter a:");
        int a = sc.nextInt();
        
        System.out.print("Enter b:");
        int b = sc.nextInt();
        
        System.out.print("Enter c:");
        int c = sc.nextInt();
    
        // use the quadraitic equation
        System.out.println(((-1 * b) + Math.sqrt((b * b) - 4 * a * c)) / 2 * a);
        System.out.println(((-1 * b) - Math.sqrt((b * b) - 4 * a * c)) / 2 * a);
    }
}
```
</details>

---