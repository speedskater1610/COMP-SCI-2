/*
A prime number is a number greater than one that is divisible ONLY by 1 and itself.  For example, 7 is a prime number as it is not divisible evenly by 2, 3, 4, 5 or 6.  Conversely, 12 is not a prime number because it is divisible by 2, 3, 4 and 6.  Write a program that takes an integer from the user and determines if it is prime or not.
*/
import java.util.Scanner;

public class L3P01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int numToCheck = input.nextInt();
        
        for(int i = 2; i < numToCheck; i++) {
            if (numToCheck % i == 0) {
                System.out.println("Number not prime!");
                System.exit(0);
            }
        }
        
        System.out.println("Number Prime!");
    }
}