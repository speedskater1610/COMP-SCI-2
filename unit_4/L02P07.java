// STRING: Take a 5 letter word as input from the user.  Then, cast and output the ASCII value of each letter in the word.
import java.util.Scanner;

public class L02P07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a 5 letter word - ");
        String word = input.nextLine().substring(0,5);
        
        System.out.printf(
            "%X %X %X %X %X",
            (int)word.charAt(0),
            (int)word.charAt(1),
            (int)word.charAt(2),
            (int)word.charAt(3),
            (int)word.charAt(4)
        );
    }
}