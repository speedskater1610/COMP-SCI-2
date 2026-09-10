/*
Write a program that asks a user to enter a name shorter than 5 characters.  If they succeed, output the name, otherwise, output the first 5 characters of what they entered.
*/

import java.util.Scanner;

public class L01P04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a name less than 5 chars : ");
        String name = input.nextLine();
        
        if (name.length() < 5) {
            System.out.println("Good job");
        } 
        else {
            System.out.println("Bad job");
        }
    }
}