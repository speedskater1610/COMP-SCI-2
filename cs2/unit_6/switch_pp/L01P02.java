/*
The IRS uses a character code to determine the marital status of people filing their tax returns. The code is as follows:
S        	Single
M        	Married
D        	Divorced
W        	Widowed

   Write a program that accepts the code number as input, and, based on the value entered, displays the correct 
   manufacturer. Use a switch structure.
*/
import java.util.Scanner;

public class L01P02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the status code: ");
        char code = input.nextLine().charAt(0);
        
        switch (code) {
            case 'S':
                System.out.println("Code applies to: Single");
                break;
            
            case 'M':
                System.out.println("Code applies to: Married");
                break;
                
            case 'D':
                System.out.println("Code applies to: Divorced");
                break;
                
            case 'W':
                System.out.println("Code applies to: Widowed");
                break;
            
            default:
                System.out.println("Code applies to: None");
                break;
        }
    }
}