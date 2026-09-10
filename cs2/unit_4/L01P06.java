// STRING: Take a string from a user and output the first character in lower case.
import java.util.Scanner;

public class L01P06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        // thank you for giving me the RUST SYNTAX!
        char firstCharLower = input
                                .nextLine()
                                .trim()
                                .toLowerCase()
                                .charAt(0);
        System.out.print(firstCharLower);
    }
}