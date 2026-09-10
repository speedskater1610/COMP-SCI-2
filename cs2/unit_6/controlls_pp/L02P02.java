/*
The IRS uses an integer code to determine the marital status of people filing their tax returns.  The code is as follows:
S                	Single
M                	Married
D                	Divorced
W                	Widowed
*/
import java.util.Scanner;

public class L02P02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter code: ");
        
        /*Avg Rust Syntax*/
        char code = input
                        .nextLine()
                        .toUpperCase()
                        .charAt(0);
        
        if (code == 'S') {
            System.out.println("Single");
        }
        else if (code == 'M') {
            System.out.println("Married");
        }
        else if (code == 'D') {
            System.out.println("Divorced");
        }
        else if (code == 'w') {
            System.out.println("Widowed");
        } 
        else {
            System.out.println("Enter a valid code");
        }
    }
}