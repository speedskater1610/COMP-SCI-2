/*
Write a program that asks the user to enter a number.  The program should tell the user if their number is even or odd.

*/

import java.util.Scanner;

public class L01P02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = input.nextInt();
    
        if (number % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
    }
}