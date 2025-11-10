# Level 1
```java
/*Write a method called printHello. The method should print the message "Hello there!" to the console without using any parameters.
Write a method called printName. The method should print the message "Your name is <name". The method should take a single string parameter for the name to be printed.
Write a method called printMax. The method should have parameters for 3 integers, and should print out the largest integer of the three parameters. 
Write a method called printInfo. The method should take parameters for a person's name, age, and GPA. Then, the method should print out the following message to the console:

				Name: <name> | Age: <age> | GPA: <gpa>
*/
public class Level1{
    public static void printHello () {
        System.out.println("Hello, there!");
    }
    
    public static void printName (String name) {
        System.out.println("Your name is " + name);
    }
    
    
    public static void printMax (double i1, double i2, double i3) {
        System.out.println(Math.max(Math.max(i1, i2), i3));
    }
    
    public static void printInfo(String name, int age, float gpa) {
        System.out.printf("Name: %s | Age: %d | GPA: %f", name, age, gpa);
    }
    
    public static void main(String[] args) {
        
    }
}
```

# Level 2

```java
import java.util.Scanner;

public class Level2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter 2 integers seperated by the enter key: ");
        
        // get the 2 ints
        int[] twoInts = { input.nextInt(), input.nextInt() };
        printCalcs(twoInts[0], twoInts[1]); // run the method
        
        // get the points and apply the methods
        System.out.println("Enter 4 floating point numbers seperated by the enter key: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        
        Coords coord1 = new Coords(x1, y1);
        Coords coord2 = new Coords(x2, y2);
        
        printPoints(coord1, coord2);
        System.out.println("\n");
        printMidpoint(coord1, coord2);
        System.out.println("\n");
        printDistance(coord1, coord2);
        System.out.println("\n");
        printSlope(coord1, coord2);
        System.out.println("\n");
    }
    
    public static void printCalcs (int int1, int int2) {
        /*print the results of the 5 basic math operations (add, subtract, multiply, divide, modulus) using the two numbers. */
        System.out.println("add: " + (int1 + int2));
        System.out.println("sub: " + (int1 - int2));
        System.out.println("mult: " + (int1 * int2));
        System.out.println("div: " + (int1 / int2));
        System.out.println("mod: " + (int1 % int2));
    }
    
    
    
    static class Coords {
        public double x;
        public double y;
        public Coords(double x, double y) {
            this.x = x;
            this.y = y;
        }
        
        double[] getAsArray() { 
            return new double[] { this.x, this.y }; 
        }
        double getX() { return this.x; }
        double getY() { return this.y; }
        
        void printFmt() {
            System.out.printf(
                "(%.2f, %.2f)",
                getX(),
                getY()
            );
        }
    }
    
    /*printPoints: Will have parameters for four double values (x1, y1, x2, y2), and print out the correctly formatted points (x1, y1) and (x2, y2).*/
    public static void printPoints(Coords coord1, Coords coord2) {
        coord1.printFmt();
        System.out.print(" & ");
        coord2.printFmt();
    }
    /*printMidpoint: Will have parameters for four double values (x1, y1, x2, y2), and will print the midpoint value of the two points (x1, y1) and (x2, y2). */
    public static void printMidpoint(Coords coord1, Coords coord2) {
        double x = (coord1.getX() + coord2.getX())/ 2;
        double y = (coord1.getY() + coord2.getY())/ 2;
        Coords theOneToPrint = new Coords(x, y);
        
        theOneToPrint.printFmt();
    }
    /*printDistance: Will have parameters for four double values (x1, y1, x2, y2), and will print the distance between the two points (x1, y1) and (x2, y2). */
    public static void printDistance(Coords coord1, Coords coord2) {
        double diffX = (coord1.getX() - coord2.getX());
        double diffY = (coord1.getY() - coord2.getY());
        double distance = Math.sqrt(Math.pow(diffX, 2) + Math.pow(diffY, 2));
        System.out.printf("%.2f", distance);
    }
    /*printSlope: Will have parameters for four double values (x1, y1, x2, y2), and will print the slope of the line connecting the two points (x1, y1) and (x2, y2). */
    public static void printSlope(Coords coord1, Coords coord2) {
        System.out.println((coord2.getY() - coord1.getY()) / (coord2.getX() - coord1.getX()));
    }
}
```
