/*
Take a word from a user and decide if it is in the first half of the alphabet (A-M) or in the second half of the alphabet (N-Z).  Use the String compareTo method.
*/
import java.util.Scanner;

public class L01P07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String word = input.nextLine();
        
        // n is the middle
        int position = word.toUpperCase().compareTo( new String("N") );
        
        if (position >= 0) {
            System.out.println("Second half");
        } 
        else {
            System.out.println("First Half");
        }
    }
}