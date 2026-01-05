/*
Write a program that generates a random number between 1 and 10, asks the user for their guess, and then tells them if they are correct or incorrect.
*/
import java.util.Scanner;

public class L01P05 {
    public static void main(String[] args) {
        int randNum = (int)(Math.random() * 10 + 1); // [1, 10]
        
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();
        
        if (guess == randNum) {
            System.out.println("Correct");
        }
        else {
            System.out.println("Wrong");
        }
    }
}