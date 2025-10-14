// MATH: Have the user enter two numbers.  Display the smallest of the two and the largest of the two.
import java.util.Scanner;

public class L01P03 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter a number - ");
        double num1 = input.nextDouble();
        
        System.out.print("Enter a number - ");
        double num2 = input.nextDouble();
        
        System.out.printf("The larger one is %f\n", Math.max(num1, num2));
        System.out.printf("The smaller one is %f\n", Math.min(num1, num2));
    }
}