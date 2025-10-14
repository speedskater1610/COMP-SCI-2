// MATH: Have the user enter three numbers.  Display the largest of the numbers.
import java.util.Scanner;

public class L02P02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double[] nums = new double[3];
        
        System.out.print("Enter a number - ");
        nums[0] = input.nextDouble();
        
        System.out.print("Enter a number - ");
        nums[1] = input.nextDouble();
        
        System.out.print("Enter a number - ");
        nums[2] = input.nextDouble();
        
        System.out.println(
            "The largest ones is - " + 
            Math.max(
                nums[0], 
                Math.max(nums[1], nums[2])
            )
        );
    }
}