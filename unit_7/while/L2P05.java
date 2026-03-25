/*Write a program that will check a user's password to see if it is strong enough. A strong password is at least 10 characters long and also contains either a "$" symbol or a "#" symbol. Prompt the user until they enter a strong password. When they enter a strong password, print the message "Password Accepted" to the console. 
*/
import java.util.Scanner;

public class L2P05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String password = new String();
        boolean isGoodPassword = isGoodPassword(password);
        
        while (!isGoodPassword) {
            System.out.print("Enter password: ");
            password = sc.nextLine();
            
            isGoodPassword = isGoodPassword(password);
        }
        
        System.out.println("Password accepted");
    }
    
    public static boolean isGoodPassword(String password) {
        return (password.length() >= 10) && (
                    (password.contains("$")) ||
                    (password.contains("#"))
                );
    }
}