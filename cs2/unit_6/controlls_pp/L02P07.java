/*
Ask the user for a time (hours and minutes).  Determine that each number is valid (1<=hours<=12 and 0<=minutes<=59).   If either part is not valid, tell the user.  Otherwise, state that the time is valid.
*/
import java.util.Scanner;

public class L02P07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter hours");
        int hours = input.nextInt();
        
        System.out.print("Enter minutes");
        int minutes = input.nextInt();
        
        if (!(0 <= minutes && minutes <= 59)) {
            System.out.println("Minutes are not valid");
            System.exit(1);
        }
        if (!(1 <= hours && hours <= 12)) {
            System.out.println("Hours are not valid");
            System.exit(1);
        }
        
        System.out.println("Everything looks good");
    }
}