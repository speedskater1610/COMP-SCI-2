/*
Write a program to convert a word in English to Pig Latin.  The conversion works in the following manner:
If the word starts with a vowel, just place the letters "hay" at the end of the word.
If the word starts with a consonant, move the first letter of the word to the end, and follow it by placing the letters "ay".
*/
import java.util.Scanner;

public class L03P01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a word to be converted to pig latin: ");
        String word = input.nextLine().toLowerCase();
        
        char[] vowels = {'a', 'i',  'o', 'u', 'e'};
        char firstLetter = word.charAt(0);
        
        boolean hasVowelIndex0 = false;
        
        for (char vowel : vowels) {
            if (firstLetter == vowel) {
                word = new StringBuilder(word).delete(0, 1).append("hay").toString();
                hasVowelIndex0 = true;
                break;
            }
        }
        
        if (!hasVowelIndex0) {
            word = new StringBuilder(word).delete(0, 1).append(firstLetter).append("ay").toString();
        }
        
        System.out.println("The word in pig latin is " + word);
    }
}