/*
Write  a program that takes a year.  The program is to determine if the year is a leap year or not.  Leap years are divisible by 4, unless it is also divisible by 100 but not 400.  For example, 2003 is not, but 2004 is.  1900 is not, but 2000 is.  If they input a year before 1582, output an error message stating that there were no leap years before then.
Examples:
	1980 – leap year
	1900 – not
	1200 – not
	2000 – leap year
		3000 – not
*/
import java.util.Scanner;

public class L04P01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a year:");
        int year = input.nextInt();
        
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                System.out.println("Not a leap year");
            } 
            else {
                System.out.println("Is a leap year");
            }
        } else {
            System.out.println("Not a leap year");
        }
    }
}