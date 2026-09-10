/*
Each disk drive in a shipment of devices is stamped with a code from 1 to 4, which indicates a manufacturer as follows:
1                	3M Corporation
2                	Maxell Corporation
3                	Sony Corporation
4                	Verbatim Corporation
       Write a program that accepts the code number as input, and, based on the value entered, displays the correct 
       manufacturer.
       
       Use an if-else chain.
*/
import java.util.Scanner;

public class L02P01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a valid label");
        int label = input.nextInt();
        
        if (label == 1) {
            System.out.println("3M Corporation");
        }
        else if (label == 2) {
            System.out.println("Maxell Corporation");
        }
        else if (label == 3) {
            System.out.println("Sony Corporation");
        }
        else if (label == 4) {
            System.out.println("Verbatim Corporation");
        } 
        else {
            System.out.println("Please enter a valid label");
        }
    }
}