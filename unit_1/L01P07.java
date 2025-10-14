/*
Write a program that creates two values, a dividend and divisor (not = 0).  Create another variable called quotient that stores the value of dividend/divisor.  Finally, create a fourth variable called remainder that stores the value of dividend%divisor.  Output the quotient and remainder.
*/

public class L01P07 {
    public static void main(String[] args) {
        double dividend = 6.78;
        double divisor = 4.5;
        
        double quotient = dividend / divisor;
        double remainder = dividend % divisor;
        
        System.out.printf("Using \ndividend -  %f \ndivisor - %f \n\tthe quotient is %f \n\tthe remainder is %d", dividend, divisor, divisor, remainder);
    }
}
