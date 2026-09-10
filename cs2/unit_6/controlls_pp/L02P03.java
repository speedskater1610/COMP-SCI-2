/*
Ask the user to enter a username and password.  If the username is "Ali Baba" and the password is "abracadabra", then they have appropriate login credentials – tell them so.  Otherwise, tell them that this information is restricted.
*/
import java.util.Scanner;

public class L02P03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter username: ");
        String username = input.nextLine();
        
        System.out.print("Enter password: ");
        String password = input.nextLine();
        
        if (username.equals("Ali Baba") && password.equals("abracadabra")) {
            System.out.println("Good login creds");
        }
        else {
            System.out.println("Wrong creds");
        }
    }
}