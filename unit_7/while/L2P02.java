/*
Write a program that asks the user to enter a number between 1 and 10.  Choose a random number between 1 and 10.  Let them know if they guessed the number or not.  Use a while loop and give them a maximum of three guesses.  At the end, be sure to output the random number for them to see. Also, let them know after each guess if the target number is higher or lower than their guess.
*/
import java.util.Scanner;

public class L2P02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int randNum = (int)(Math.random() * 10) + 1; 
        int guessCount = 0;
        
        while (guessCount < 3) {
            System.out.print("Enter a num 1..10: ");
            int num = sc.nextInt();
            
            guessCount++;
            
            if (num > randNum) System.out.println("Too High.");
            else if (num < randNum) System.out.println("Too Low.");
            else {
                System.out.println("Correct.");
                break;
            }
        }
    }
}