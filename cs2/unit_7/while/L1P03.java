import java.util.Scanner;

public class L1P03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int i = 9;
        int sum = 0;
        while (i > 0) {
            System.out.print("Enter num: ");
            sum += input.nextInt();
            i--;
        }
        
        System.out.println("Total was " + sum);
    }
}