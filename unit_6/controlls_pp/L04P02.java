/*
Bob was invited to a certain royal wedding in a foreign country.  The bride and groom requested that donations be made to charity in lieu of wedding gifts, and Bob has decided to follow this route.  Unfortunately, the gifts are in a foreign currency, which Bob finds confusing.  He want to put the donation on a credit card, but the credit card also charges a fee, given by the larger of a percentage of the transaction cost, or a fixed amount.  For example, the company might charge the large of 2.5% or $5.00.  that charge is assessed after rounding the gift to the nearest cent.  Write a program that converts currency and tells Bob the amount that would be charged to his credit card.  Your program should take inputs for <Foreign Currency>, <Exchange Rate>, <Percentage>, <Minimum> and display the amount charged to the nearest cent.  Foreign Currency is the amount of the donation.  Exchange rate is the cost in dollars for one unit of the foreign currency.  Percentage and Minimum refer to the additional charges for the credit card company.  

For example, the input 100.00,  1.66648,  2.5,  5 means he gives 100.00 units of the currency, each unit costs $1.66648 and the credit card company charges the larger of 2.5% and $5.00.  In this case, the cost of the currency would be  $166.648 and 2.5% of this is $4.166199, so the company would charge $5.00 since it is larger.  The total would be $171.65 (rounded to the nearest cent).  
	
Examples:
	Input				Output
	100.00, 1.66648, 2.5, 5		171.65
	100.00, 1.66648, 2.5, 3		170.81
	1000.00, 1.66648, 3, 5		1716.47
    1000.00, 0.600067, 5, 5		  630.07
*/
import java.util.Scanner;

public class L04P02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Enter the amount of units : ");
        double units = input.nextDouble();
        
        System.out.println("Enter the amount of dollars per unit : ");
        double dollarPerUnit = input.nextDouble();
        
        System.out.println("Enter the percent that the bank charges as a larger (format as a decimal (25% is 0.25) : )");
        double largerPercent = input.nextDouble();
        
        System.out.println("Enter the amount that the bank charges as a larger fixed value : ");
        double largerFixed = input.nextDouble();
        
        System.out.printf("The cost in $%.2f usd.\n", calculateCost(units, dollarPerUnit, largerPercent, largerFixed));
    }
    public static double calculateCost(
                            double units, 
                            double dollarPerUnit, 
                            double largerPercent, 
                            double largerFixed) {
        double totalCostDollar = units * dollarPerUnit;
        
        double totalCostWithPercent = totalCostDollar * largerPercent;
        if (totalCostWithPercent > largerFixed) {
            return totalCostWithPercent;
        }
        
        return totalCostDollar + largerFixed;
    }
}