import java.util.Scanner;

public class L1P01{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number 10-20: ");
        int times = input.nextInt();
        
        while (times > 0) {
            System.out.println("Java");
            times--;
        }
    }
}