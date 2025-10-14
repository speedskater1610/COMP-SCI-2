// Create a decimal value in a double variable.  Cast it as an int and output it
import java.util.Scanner;

public class L01P06 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter a decimal value - ");
        double value = input.nextDouble();
        
        System.out.println("As a int that is" + (int)value);
    }
}