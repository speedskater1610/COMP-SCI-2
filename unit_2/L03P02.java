/* (*from the 2019 Widener Programming Contest) Write a program that converts a decimal value representing hours into a whole number of hours and a whole number of minutes (the minutes must be rounded down).
	INPUT: A floating point number representing hours
	OUTPUT: Two integers, separated by a space.  First integer represents the whole number of 
		     hours and the second integer represents the whole number of minutes rounded 
		     down.
	EXAMPES:
		Input: 2.44			Output: 2 26
		Input: 2.68			Output: 2 40
		Input: 0.5			Output: 0 30
*/
import java.util.Scanner;

public class L03P02 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter the hours - ");
        double value  = input.nextDouble(); 
        
        System.out.printf("%.0f %.0f",  
            Math.floor(value), 
            amountOfMin(value)
        );
    }
    
    public static double amountOfMin (double val) {
        // 60 being the amount of minutes in a hour
        return  (Math.floor(val * 60)) - (Math.floor(val) * 60);
    }
}