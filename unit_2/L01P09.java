// Create an integer value in an int variable.  Convert the int to a String and store it.
import java.util.Scanner;

public class L01P09 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter a integer - ");
        int intValue = input.nextInt();
        
        String strValue = String.valueOf(intValue);
        
        System.out.println("As a string that is " + strValue);
    }
}