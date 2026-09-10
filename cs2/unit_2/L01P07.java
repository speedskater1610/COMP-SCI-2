// Create a char variable.  Cast it as an int,  and output it.
import java.util.Scanner;

public class L01P07 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter a char - ");
        char value = input.nextLine().charAt(0);
        
        System.out.println("As a int that is " + (int)value);
    }
}