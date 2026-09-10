// MATH: Take two side lengths from a user. Use the Pythagorean Theorem to find and display the length of the hypotenuse.
import java.util.Scanner;


public class L02P04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter side length 1 - ");
        double num1 = input.nextDouble();
        
        System.out.print("Enter side length 2 - ");
        double num2 = input.nextDouble();
        
        System.out.printf("The hypo is - %f", 
            Math.sqrt(
                Math.pow(num1, 2) 
                +
                Math.pow(num2, 2)
            )
        );
    }
}