/*
A greatest common factor is the largest number that evenly divides two numbers.  For example, the GCF of 12 and 18 is 6 as the factors of 12={1,2,3,4,6,12} and the factors of 18={1,2,3,4,6,9,18}.  The biggest number that evenly divides both is 6.  Write a program that takes two integers as input and output the greatest common factor of those two numbers.
*/
import java.util.Scanner;
import java.util.ArrayList;

public class L3P02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num1 = input.nextInt();
        
        System.out.print("Enter a number: ");
        int num2 = input.nextInt();
    
        System.out.println("GCF is " + GCF(num1, num2));
    }
    
    // holy goated time complexity 
    // tacticle binary search incoming
    // holy-c rewrite when?
    public static int GCF(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return GCF(b, a % b);
        }
    }
    // holy-c rewrite now...
    /*
I64 GCF(I64 a, I64 b) {
    if (b == 0) {
        return a;
    } else {
        return GCF(b, a % b);
    }
}

U0 Main() {
  I64 num1 = 56;
  I64 num2 = 98;
  I64 result = GCF(num1, num2);

  "%d\\n", result;
}
    */
}