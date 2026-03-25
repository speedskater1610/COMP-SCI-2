/*Write a program that generates two random numbers between 1 and 11 and finds/displays their total.  Then, use a while loop to add one new random number between 1 and 11 to the total if the user enters the word "HIT." Continue this process until the user enters something other than "HIT." At the end of the program, if the total is above 21, display the word "BUST." If the total is exactly 21, display the word "WINNER." Otherwise, display the total score in the form "Score: <total>." 
*/
import java.util.Scanner;

public class L2P04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = (int)(Math.random() * 11) + 1;
        
        String input = new String();
        
        do {
            System.out.print("Enter option: ");
            input = sc.nextLine();
            
            total += ((int)(Math.random() * 11) + 1);
            System.out.println("Total is now " + total);
        } while (input.equals("HIT") && total <= 21);
        
        if (total > 21) {
            System.out.println("LOSER");
        } else if (total < 21) {
            System.out.println("SCORE: " + total);
        } else {
            System.out.println("WINNER");
        }
    }
}