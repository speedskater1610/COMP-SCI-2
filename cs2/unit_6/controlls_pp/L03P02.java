/*
Similar to the way that String cannot use ==, they also cannot use > or < as that would compare their memory locations, not their content.  So, to compare strings, we need to use a compareTo method.  It works similar to the .equals method in that it is called from one string and takes another as a parameter (s1.compareTo(s2)).  The compareTo method returns a positive if s1 comes after s2, 0 if they are the same and a negative if s1 comes before s2.  Store the following strings in variables and output the result of the compareTo functions as they are called on each other (Apple, apple, banana).  How would you use this in a condition?  Use this information to write a console program that takes two Strings from a user and outputs which one is first alphabetically.
*/
import java.util.Scanner;

public class L03P02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter A String : ");
        String s1 = input.nextLine();
        
        System.out.print("Enter A String : ");
        String s2 = input.nextLine();
    
        if ((s1.compareTo(s2)) > 0) 
            System.out.println("the first string comes before the 2nd");
        else 
            System.out.println("The second string comes before the 1st");
    }
}