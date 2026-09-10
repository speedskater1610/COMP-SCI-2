// Ask a user if they are a student at this school. Print the result.
import java.util.Scanner; 

public class L01P02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String schoolName = "Spring-ford";
        
        System.out.printf("Do you go to %s (y/n): ", schoolName);
        char confirmation = input.nextLine().charAt(0);
        
        if ((confirmation | 0x20) == 'y' || confirmation == 'y')
            System.out.println("You go to " + schoolName);
        else if ((confirmation | 0x20) == 'n' || confirmation == 'y') 
            System.out.println("You do not go to " + schoolName);
        else  {
            System.err.println("ERROR - please enter a valid character\nyou entered" + confirmation);
            System.exit(1);
        }
        System.exit(0);
    }
}