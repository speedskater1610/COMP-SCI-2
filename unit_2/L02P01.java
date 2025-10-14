// Write a program that asks a user for  three double variables and stores their average in a variable called avg.  Output the average.
import java.util.Scanner;

public class L02P01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number - ");
        double value1 = input.nextDouble();
        
        System.out.print("Enter another number - ");
        double value2 = input.nextDouble();
        
        System.out.print("Enter another number - ");
        double value3 = input.nextDouble();
        
        double[] numbers = {value1, value2, value3};
        double sum = 0; 
        
        for (double num : numbers) {
            sum += num;
        }
        sum = sum/numbers.length;
        
        System.out.println("The average is " + sum);
    }
}