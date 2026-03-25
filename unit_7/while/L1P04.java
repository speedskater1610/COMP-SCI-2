/*
Ask a user if they want to continue.  The program should keep running for any input they type except no.  Once the user enters no, exit the program.
*/
import java.util.Scanner;

public class L1P04 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        String input = new String();
        
        while (!input.equals("no")) {
            System.out.print("Do you want to continue? ");
            input = reader.nextLine();
        }
    }
}