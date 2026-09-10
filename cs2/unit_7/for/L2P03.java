/*
Write a program that counts from 2 to a user input limit by threes.  Use a for loop.
*/
import java.util.Scanner;

public class L2P03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Enter a number to count to: ");
        int upperLimit = input.nextInt();
        for (int i = 2; i < upperLimit; i += 3) {
            System.out.println(i);
        }
    }
}
