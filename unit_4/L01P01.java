// MATH: Take a number from a user and display the absolute value of that number.

import java.util.Scanner;

public class L01P01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number - ");
        double userNum = input.nextDouble();
        
        System.out.printf("The absolutte value of %f is %f", userNum, Math.abs(userNum));
    }
}