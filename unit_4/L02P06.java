// STRING: Take a string from a user and output the last character in uppercase (hint: use the length property).
import java.util.Scanner;

public class L02P06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a word - ");
        String word = input.nextLine();
        
        
        System.out.printf(
            "The first  letter in uppercase is - %c", 
            word
                .toUpperCase()
                .charAt(0)
        );
    }
}