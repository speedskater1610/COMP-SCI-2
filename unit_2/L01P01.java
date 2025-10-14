//Take a user's course name and grade and display the information on the screen.
import java.util.Scanner; 

public class L01P01 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter course name - ");
        String courseName = input.nextLine();

        System.out.print("Enter course grade - ");
        float courseGrade = (float)input.nextDouble();
        
        
        System.out.printf("You have a %.2f in %s", courseGrade, courseName);
    }
}