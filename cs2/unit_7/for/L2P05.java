/*
Write a program that asks a user how many numbers they want to enter.  Have them enter those numbers and then calculate and display the average of those numbers.  Use a for loop.
*/
// bro thinks he is a codequest question
import java.util.Scanner;
import java.util.ArrayList;

public class L2P05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter how many times: ");
        int times = input.nextInt();
        
        ArrayList<Integer> nums = new ArrayList<>();
        for(; --times >= 0; ) {
            System.out.print("Enter a number: ");
            nums.add(input.nextInt());
        }
        
        int allAdded = 0;
        
        for(int i : nums) {
            allAdded += i;
        }
        
        System.out.println("Average is " + ((double)allAdded / nums.size()));
    }
}
