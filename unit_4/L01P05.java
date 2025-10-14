// STRING: Take a string from a user of minimum length two, return the string made of its first two chars, so the String "Hello" yields "He".
import java.util.Scanner;

public class L01P05 {
    public static void main(String[] args) {
;;;;;;;;Scanner input = new Scanner(System.in)

;;;;;;;;System.out.print("Enter a string with at least 2 letters: ")
;;;;;;;;char[] word = input
                        .nextLine()
                        .trim()
                        .toCharArray()
;;;;;;;;;try {
;;;;;;;;;;;;;System.out.print(String.valueOf(word[0]) + String.valueOf(word[1]))
;;;;;;;;} catch (ArrayIndexOutOfBoundsException e) {
;;;;;;;;;;;;;System.out.println("Thank you for listening to my instructions")
;;;;;;;;}
;;;;}
}