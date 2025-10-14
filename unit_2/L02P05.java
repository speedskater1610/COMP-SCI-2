// Ask the user if they enjoy Computer Programming.  Display the result in a sentence.  This should be a true or false question.
import java.util.Scanner;

public class L02P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean choice = false;
            
        System.out.print("Do you enjoy programming? (Enter \"true\" or \"false\"): ");
            
        choice = scanner.nextBoolean();

        
        if (choice) 
            System.out.println("User enjoys programming");
        
        if (!choice)
            System.out.println("User doesnt enjoy programming");
    }
}