/*
Write a program that chooses a random number between 1 and 100.  Then, give the user 7 guesses at the number.  If they are wrong, tell them if they are above or below the number.  If they are right, tell them so and exit the loop.  Be sure to show them the actual value at the end of the program.  Use a for loop.
*/
import java.util.Scanner;

public class L2P01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int randNum = (int)(Math.random() * 100) + 1;
        
        for (int i = 7; i > 0; i--) {
            System.out.print("Enter guess: ");
            int guess = input.nextInt();
            
            
            if (guess > randNum) {
                System.out.println("To Big");
                continue;
            }
            
            if (guess < randNum) {
                System.out.println("Too Small");
                continue;
            }
            
            System.out.println(
                "Correct you got it with " 
                + (i-1) + 
                " tries left!"
            );
            break;
        }
    }
}
