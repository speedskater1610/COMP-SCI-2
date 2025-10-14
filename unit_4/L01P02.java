// MATH: Have the user enter a number.  Show the result of that number raised to the 4th power.

import java.util.Scanner;

public class L01P02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        double num = input.nextDouble();
        
        System.out.printf("%f raised to the 4th power is %f", num, Math.pow(num, 4));
    }
}