import java.util.Scanner;

public class L1P05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int times = input.nextInt();
        
        for (int i = times; i > 0; i--) {
            System.out.println("Java");
        }
    }
}