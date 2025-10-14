// Write a program that asks the user for two values, a dividend and divisor (not = 0).  Create another variable called quotient that stores the value of dividend/divisor.  Finally, create a fourth variable called remainder that stores the value of dividend%divisor.  Output the quotient and remainder.

import java.util.Scanner;

public class L02P03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a Value (Dividend) - ");
        int dividend  = input.nextInt();
        
        System.out.print("Enter a Value (Divisor) - ");
        int divisor = input.nextInt();
        
        double quotient = 0;
        int remainder = 0;
        
        try { 
            quotient = dividend / divisor;
            remainder = dividend % divisor;
        } catch (ArithmeticException e) {
            System.err.printf(
                "Error: You can not divide by zero" +
                "\nwith dividend %d and divisor %d\n", 
                dividend, 
                divisor
            );
            
            System.exit(1);
        } finally {
            System.out.printf("the dividend \t\t\t%d\n" +
            "the divisor \t\t\t%d\n" +
            "makes the quotient \t\t%f\n" +
            "and the remainder \t\t%d \n", 
            dividend, divisor, quotient, remainder);
        }
        System.exit(0);
    }
}
