// MATH: Take four numbers from a user, representing two points (x1,y1) and (x2,y2).  Display the slope and distance between the two points.
import java.util.Scanner;

public class L02P03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double[] coord1 = new double[2];
        double[] coord2 = new double[2];
        
        System.out.print("Enter x1 - ");
        coord1[0] = input.nextDouble();
        
        System.out.print("Enter x2 - ");
        coord1[1] = input.nextDouble();
        
        System.out.print("Enter y1 - ");
        coord2[0] = input.nextDouble();
        
        System.out.print("Enter y2 - ");
        coord2[1] = input.nextDouble();
        
        System.out.printf("The slope is - %.2f",
            (coord2[1] - coord1[1])
                        /
            (coord2[0] - coord1[0])
        );
    }
}