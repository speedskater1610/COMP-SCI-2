/*
Write a program that asks a user for a password.  The password MUST meet the following criteria:
The password should be five characters long
The first character should be an uppercase letter(LOOK UP ASCII CODE IN JAVA)
The last character should be a lowercase letter (AGAIN – ASCII CODE)
The third character should be a digit. (AGAIN – ASCII CODE)
      Write a program that runs each of the above checks and determines if the password is valid.

*/
import java.util.Scanner;

public class L03P03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Enter your password: ");
        String password = input.nextLine();
        
        
        boolean isBadPass = false;
        
        if (password.length() < 5) {
            System.out.println("Password is too short");
            isBadPass = true;
        }
        
        // these can only be done if the size is at least than 3;
        if (password.length() >= 3) {
            int firstCharASCII = (int)(password.charAt(0));
            if (asciiBetween(firstCharASCII, 'A', 'Z')) {
                System.out.println("First char must be uppercase");
                isBadPass = true;
            }
            
            int lastCharASCII = (int)(password.charAt(password.length() - 1));
            if (asciiBetween(lastCharASCII, 'a', 'z')) {
                System.out.println("Last char must be lowercase");
                isBadPass = true;
            }
            
            int thirdCharASCII = (int)(password.charAt(2));
            if (asciiBetween(thirdCharASCII, '0', '9')) {
                System.out.println("The third char must be a number");
                isBadPass = true;
            }
        }
        
        if (!isBadPass) {
            System.out.println("Password is all good");
        }
    }
    public static boolean asciiBetween(int asciiCode, char start, char end) {
        return asciiCode < (int)start || asciiCode > (int)end;
    }
}