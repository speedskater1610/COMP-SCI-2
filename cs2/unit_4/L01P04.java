// STRING: Take a name as input from a user and output a message with the word hello concatenated in front of the name.  (e.g. Input ("Mickey") – Output ("Hello, Mickey").
import java.util.Scanner;

public class L01P04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        
        System.out.println("Hello, " + name);
    }
}