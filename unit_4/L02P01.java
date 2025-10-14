// MATH: Ask the user for a double.  Use one of the Math methods to round the number up.
import java.util.Scanner;

public class L02P01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a double - ");
        double num = input.nextDouble();
        
        System.out.println(Math.ceil(num));
    }
}