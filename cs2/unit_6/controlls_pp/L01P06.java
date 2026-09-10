/*
Store your name in a variable.  Ask the user for their name.  If their name is the same as yours, output "What a great name!".  Otherwise, output, "Nice name, but not my favorite."
*/
import java.util.Scanner;

public class L01P06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        
        if (name.equalsIgnoreCase("Russel")) {
            System.out.println("The best name");
        } 
        else {
            System.out.println("Nice name, but not my favorite");
        }
    }
}