// STRING: Take a string from a user and output a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2. For example, the String "Hello" yields "lloHe".

import java.util.Scanner;

public class L02P05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a word - ");
        String word = (input.nextLine()).trim();
        
        word = word.substring(2) + word.substring(0, 2);
        System.out.println(word);
    }
}