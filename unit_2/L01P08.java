// Create a String variable that stores a number.  Parse the string into an int and increment it by one.
import java.util.Scanner;

public class L01P08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String strValue = input.nextLine();
        int intValue = Integer.parseInt(strValue);
        ++intValue;
        System.out.println("As a int that is " + intValue);
    }
}