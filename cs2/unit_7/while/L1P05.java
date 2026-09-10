/*
Write a program that asks the user to enter a string that is longer than 5 characters.  Keep them in the loop as long as their string is 5 or less characters.
*/
import java.util.Scanner;

public class L1P05 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        String input = new String();
        
        while (input.length() <= 5) {
            System.out.print("Enter a String: ");
            input = reader.nextLine();
        }
    }
}