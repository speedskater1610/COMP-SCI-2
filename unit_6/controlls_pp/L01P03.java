/*Write a program that asks the user if they would like to continue.  If they say yes, print "The program continues."  If they say no, print, "The program ends."
*/

import java.util.Scanner;

public class L01P03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String response = "";
        
        do {
            System.out.print("Do you want to continue\n\n[Y] -  yes, [N] - no\n>");
            response = input.nextLine();
            
            if (response.equalsIgnoreCase("Y")) {
                System.out.println("The program continues");
            } 
            else if (response.equalsIgnoreCase("N")) {
                System.out.println("The program ends");
            }
        } while (response.equalsIgnoreCase("Y"));
    
        return;
    }
}