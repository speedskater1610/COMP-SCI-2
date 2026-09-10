// Take a string from a user and output a string of length 3 from its middle, so "Candy" yields "and" and "Friends" yields "ien". The string length will be at least 3.
import java.util.Scanner;

public class L03P02 {
    // stealing this from a old project of mine
    // https://github.com/speedskater1610/stdjava/blob/main/src/printUtils/C.java
    /**
     * @define the C printf, written in Java
     * @param String format - the main body of what is being printed
     * @param Object... args - argString to be the %_ formats
     * @return Void, but prints instead
     */
    public static void printf(String format, Object... args) {
        /* Pretty much I just have a next and I assign it to the %_ based of types then inc then repeat sort of like a repl but more a rel...p */
        String result = "";
        int argIndex = 0;

        for (int i = 0; i < format.length(); i++) {
            char c = format.charAt(i);
            
            /* yes there is better way to do this with ot heavily nested ifs but I am too lazy and it is */
            if (c == '%' && i + 1 < format.length()) {
                char next = format.charAt(i + 1);
                i++; /* skip the fmt char */
                    
                // modifies this from the original
                if (next == 's') {
                    result += String.valueOf(args[argIndex]); 
                    argIndex++;
                } else if (next == 'd' || next == 'f') {
                    if (argIndex < args.length) {
                        result += args[argIndex].toString();
                        argIndex++;
                    } 
                    else {
                        result += "%" + next;
                    }
                } 
                else if (next == '%')  {
                    result += "%";
                } 
                else {
                    result += "%" + next; /* unknown format so just assign the next thing */
                }
            } 
            else {
                result += c;
            }
        }
        /* Yes I get the irony */
        System.out.printf("%s", result);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // oh boy do I love C
        
        System.out.print("Enter the word with a length more that 3: ");
        // holy rust syntax 
        char[] word = input
                        .nextLine()
                        .trim()
                        .toCharArray();
        
                        
        int midIndex = word.length / 2;
        
        char[] middleThree = {
            word[midIndex-1], 
            word[midIndex], 
            word[midIndex+1], 
            '\0'
        };
        
        printf("%s", new String(middleThree));
    }
}