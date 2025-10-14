// STRING: Take a string from a user and output the index in which the string "at" appears in the string.
import java.util.Scanner;

public class L01P07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string with the \"at\" in it some where:  ");
        String word = input.nextLine().trim();
        
        boolean lastCharWasA = false;
        int index = 0;
        for (char c : word.toCharArray()) {
            if (!lastCharWasA) lastCharWasA = false;
            // check if the char is a 
            if (c == 'a') lastCharWasA = true;
            
            // if the last char was a check if t and return the current index -1
            if (c == 't' && lastCharWasA) {
                 index--;
                 break;
            }
            index ++;
        }
        
        System.out.println("the at is at index - " + index);
    }
}