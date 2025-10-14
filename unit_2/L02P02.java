//Ask a user for their age and their name (in that order).  Output both values in a full sentence.
import java.util.Scanner;

public class L02P02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is your age - ");
        int age = input.nextInt();
        
        input.nextLine();
        
        System.out.print("What is your name - ");
        String name = input.nextLine();
        
        System.out.println(name + " is " + age + " years  old");
    }
}