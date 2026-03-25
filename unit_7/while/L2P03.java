/*Write a program that adds up all of the numbers that a user enters.  Do not ask the user ahead of time how many numbers they want to enter.  Instead, have them enter -999 to signal the end of their input.  Be sure not to include the -999 in the total.  At the end of the program, output the total of the number.  Use a while loop.
*/

import java.util.Scanner;

public class L2P03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter numbers until -999 to add together;");
        int sum = 0;
        
        int input = 0;
        while (input != -999) {
            System.out.print("Enter num: ");
            input = sc.nextInt();
        
            sum += input;
        }
        
        System.out.println("Sum is " + (sum+999));
    }
}