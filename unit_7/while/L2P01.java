/*Write a program that asks a user how many numbers they want to enter.  Have them enter those numbers and then calculate and display the average of those numbers.  Use a while loop.
*/
import java.util.Scanner;

public class L2P01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many nums do you want to average: ");
        int times = sc.nextInt();
        int i = times;
        
        int sum = 0;
        while (i >= 1) {
            System.out.print("Enter num: ");
            sum += sc.nextInt();
            
            i--;
        }
        
        System.out.println("Average is - " + sum / times);
    }
}