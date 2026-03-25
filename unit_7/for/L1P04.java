import java.util.Scanner;
import java.util.ArrayList;

public class L1P04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ArrayList<Integer> nums = new ArrayList<>();
        
        for (int i = 0; i < 9; i++) {
            System.out.println("Enter num: ");
            nums.add(input.nextInt());
        }
        
        int product = 0;
        for (int i: nums) {
            product += i;
        }
        
        System.out.println("All added together is: " + product);
    }
}
