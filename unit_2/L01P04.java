// Ask the user for their hometown and display it.
import java.util.Scanner;

public class L01P04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is your home-town  - ");
        String homeTown = input.nextLine();
        
        System.out.println("You are from " + homeTown);
    }
}