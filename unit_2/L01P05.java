// Ask the user for their batting average (decimal value) and display it.
import java.util.Scanner;

public class L01P05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is your batting average - ");
        double average = input.nextDouble();
        
        System.out.printf("Your average is %f", average);
    }
}