/*Write a program that asks the user to enter a number that is not 0.  The program should tell the user if their number is positive or negative.
*/

import java.util.Scanner;

public class L01P01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        if (number == 0) {
            System.out.println("You Entered 0 it is neither Negative nor Positive");
        }
        else if (number > 0) {
            System.out.println("Number is positive");
        }
        else if (number < 0) {
            System.out.println("Number is negative");
        }
    }
}