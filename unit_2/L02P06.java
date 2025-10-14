// Ask a user for three values.  The first is the cost of an item, the second is a discount percentage and the third is a tax percentage.  The program should calculate the final cost of the item after the discount is taken and the tax is applied to the discounted cost.  All input should be taken as integers.

import java.util.Scanner;

public class L02P06 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter the cost of a item : ");
        int cost = input.nextInt();
        
        System.out.print("Enter the discount percentage as integer (without the \"%\") : ");
        int discount = input.nextInt();
        
        System.out.print("Enter the tax percentage as a integer (without the \"%\") : ");
        int tax = input.nextInt(); 
        
        
        System.out.printf(
            "With the original cost of: \t\t %d\n" +
            "The discount of: \t\t\t %d\n" +
            "The tax of: \t\t\t\t %d\n" +
            "\t The final price comes out to: \t %d",
            
            cost,
            discount, 
            tax, 
            ((cost) - (cost * (discount/100))) * ((tax/100)+1)
        );
    }
}