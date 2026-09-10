import java.util.Scanner;

public class MyProgram {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        
        // get the user namne
        System.out.print("Enter your name - ");
        String name = reader.nextLine();
        
        // get the user's age
        System.out.print("Enter your age - ");
        int age = reader.nextInt();
        
        System.out.printf("%s is %d years old\n\n", name, age);
        
        reader.nextLine();
        
        // part 2 starts here
        System.out.print("Enter your first initial as a capital letter - ");
        char firstInit = reader.nextLine().charAt(0);
        
        System.out.print("Enter your middle initial as a capital letter - ");
        char middleInit = reader.nextLine().charAt(0);
        
        System.out.print("Enter your last initial as a capital letter - ");
        char lastInit = reader.nextLine().charAt(0);
        
        System.out.println("The ASCII values for your initials (in order) are: ");
        System.out.print((int)firstInit + " => " + (int)middleInit +  " => " + (int)lastInit);
    }
}
