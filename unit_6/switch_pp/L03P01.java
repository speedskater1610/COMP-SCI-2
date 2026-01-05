/*
The McDowell Restaurant chain has asked you to write a menu program for their new fast-food service machines. Your program should print a menu like this:
*************************************
McDowell's Restaurant
*************************************
Make your selection from the menu below:
Regular Hamburger			$1.50
Regular Cheeseburger			$1.75
Fish Sandwich				$2.50
Half-pounder with cheese		$2.75
French Fries				$0.99
Large soft drink				$1.25
**************************************
Select 1, 2, 3, 4, 5, or 6----->
Your program should read the customer's selection and compute the price, including 6.5% sales tax. Note that using this menu, the customer can make just one selection. The input is one number between 1 and 6. 

The program should print the message:

Please pay [print amount here] dollars.
Thank you for eating at McDowell's.

		The output should have two decimal digits after decimal points.

*/
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class L03P01 {
    public static void main(String[] args) {
        System.out.println(
"*************************************\n" + 
"Make your selection from the menu below:\n" +
"Regular Hamburger\t\t\t$1.50\n" +
"Regular Cheeseburger\t\t\t$1.75\n" +
"Fish Sandwich\t\t\t\t$2.50\n" +
"Half-pounder with cheese\t\t$2.75\n" +
"French Fries\t\t\t\t$0.99\n" +
"Large soft drink\t\t\t$1.25\n" +
"**************************************\n"
            );
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string of the items you want seperated by commas\n(Ex. 3,5,2,1,6)\n\t> ");
        String[] items = input.nextLine().split(",");
        
        
        List<Integer> itemList = Stream.of(items)
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());
        
            /* Thread safe way but who cares about safeness */
            /* This is java not rust */
            /* Also why would a multi thread this */
            /* Also using a mutex here is better */
            /* because it is a single "reference var" (pointer) */
            
        // AtomicDouble cost = new AtomicDouble(0.0);
        // itemList.forEach(item -> cost.addAndGet(getPrice(item)));
        
        double cost = itemList.stream()
                        /*Ooo lambda fancy*/
                           .mapToDouble(item -> getPrice(item)) 
                           .sum();
                           
        System.out.println("Price is " + cost);
    }
    
    public static double getPrice(int item) {
        switch (item) {
            case 1:     return      1.50;
            case 2:     return      1.75;
            case 3:     return      2.50;
            case 4:     return      2.75;
            case 5:     return      0.99;
            case 6:     return      1.25;
            default:    return      0.00;
        }
    }
}