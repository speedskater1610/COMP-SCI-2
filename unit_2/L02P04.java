// Ask the user for the month, day and year of their birthday.  Format the output as a date.
import java.util.Scanner; 

public class L02P04 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter the month that your where born in (as a integer corresposnding to the month Ex: january would be \"1\") - ");
        int month = input.nextInt();
        
        System.out.print("Enter the day of the month you where born (As a Integer) - ");
        int day = input.nextInt();
        
        System.out.print("Enter the year  that you where born (As a Integer) - ");
        int year = input.nextInt();
        
        System.out.printf("%d/%d/%d\n", month, day, year);
    }
}