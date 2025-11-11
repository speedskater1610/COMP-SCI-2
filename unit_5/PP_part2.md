# level 1
- Write a method called generateMsg. The method should take in a string parameter for a name, and return the string message: This is <name>’s first return method!
- Write a method called rollD12. The method should roll a 12-sided die and return the value that was rolled. The method will not use any parameters.
- Write a method called maxValue. The method should take in three integer values as parameters and then return the largest integer value.
- Write a method called midChar. The method should take in a String parameter and return the middle character of the string. 

```java
public class Level1{
    public static void main(String[] args){
        
    }
    
    public static String generateMsg(String name) {
        return String.format("This is %s's first return method!", name);
    }
    
    public static int rollD12() {
        return (int)(Math.random()*13);
    }
    
    public static int maxValue(int i1, int i2, int i3) {
        return Math.max(Math.max(i1, i2), i3);
    }
    
    public static char midChar(String source) {
        return source.charAt(source.length()/2);
    }
}
```


# level 2
*For the following problems, create a Scanner object in the main method and use that Scanner to take user input to pass into the methods you create to test them. All input should be taken in the main method, and all printing should be done from the main method.*
- Create a method called random, which will be used to generate a random number within a given range. The method should have two parameters: one for a minimum value (integer), and one for a range (integer) in that order. The method should return a random integer based on those values.
- Create a method called generateUser, which will use three parameters to generate a password. The method parameters will be a person’s first name, last name, and grade (integer). The password should generate and return a username in the format: (first initial + first 4 letters of last name + grade).
- Create a method called average, which will calculate and return the average of 5 number parameters. The method parameters should be set up to accept any type of number value. 

```java
import java.util.Scanner;

public class Level2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // random
        System.out.print("Enters 2 ints\n\tthe first the min\n\tthe second the rangen\n\t\t> ");
        int min = input.nextInt();
        int range = input.nextInt();
        
        System.out.println(random(min, range));
        
        input.nextLine();
        
        // password
        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();
        
        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();
        
        System.out.print("Enter your grade :");
        int grade = input.nextInt();
        
        System.out.println("Your password is " + generateUser(firstName, lastName, grade));
        
        // average
        System.out.println("Enter 3 numbers seperated by the enter key: ");
        System.out.println("The average is " + 
            average(
                input.nextDouble(),
                input.nextDouble(),
                input.nextDouble()
            )   
        );
    }
    
    public static int random(int min, int range) {
        return (int)(Math.random()*range + min);
    }
    
    public static String generateUser(String fName, String lName, int grade) {
        return (
            new StringBuilder("")
                .append(fName.charAt(0)) // f iniitial    
                .append(lName.substring(0, 4)) // first 4 chars of lName
                .append(String.valueOf(grade)) // append the age
                .toString()
        );
    }
    
    public static double average(double... nums) {
        double sum = 0;
        for (double num : nums) { sum += num; }
        return sum / nums.length;
    }
}
```


# level 3
For the following problems, create a Scanner object in the main method and use that Scanner to take user input to pass into the methods you create to test them. All input should be taken in the main method, and all printing should be done from the main method.

In this problem you will create 3 different methods all named geometry, that will be used to calculate various values based on a number of parameters given. Each version of the method will be able to function separately since each version will have a different number of parameters. All parameters will be double values. 


- geometry(double x1, double y1, double x2, double y2): Will have parameters for four double values (x1, y1, x2, y2), and return the distance between the points (x1, y1) and (x2, y2) using the distance formula. 
- geometry(double base, double height): Will have parameters for two values (base and height) and return the area of the triangle with those values using the area of a triangle formula. 
- geometry(double length, double width, double height): Will have parameters for three values (length, width, and height) of a rectangular box, and will return the volume of the box.

```java
import java.util.Scanner;

public class Level3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();
        
        System.out.println(geometry(x1, x2, y1, y2));
        
        System.out.print("Enter base: ");
        double base = input.nextDouble();
        System.out.print("Enter Height: ");
        double height = input.nextDouble();
        System.out.println(geometry(base, height));
        
        System.out.print("Enter length: ");
        double length = input.nextDouble();
        System.out.print("Enter width: ");
        double width = input.nextDouble();
        System.out.print("Enter height: ");
        double betterHeight = input.nextDouble();
        
        System.out.println(geometry(length, width,  betterHeight));
    }
    
    public static double geometry(double x1, double y1, double x2, double y2) {
        return (
            Math.sqrt(
                Math.pow(x2 - x1, 2) +
                Math.pow(y2 - y1, 2)
            )
        );
    }
    
    public static double geometry(double base, double height) {
        return (base * height) / 2; 
    }
    
    public static double geometry(double length, double width, double height) {
        return length * width * height;
    }
}
```
