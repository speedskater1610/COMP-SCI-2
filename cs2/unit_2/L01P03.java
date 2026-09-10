// Ask a user if they are a freshman, sophomore, junior or senior.  Print the result.
import java.util.Scanner;

public class L01P03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Are you a freshman, sophomore, junior or senior - ");
        String grade = input.nextLine().toLowerCase();
        
        if (grade == "freshman" || grade ==  "sophomore" || grade == "junior" || grade == "senior") {
            System.out.println("You are a " + grade);
        } else {
            System.err.println("Please enter a valid grade other than " + grade);
            
            System.exit(1);
        }
        
        System.exit(0);
    }
}