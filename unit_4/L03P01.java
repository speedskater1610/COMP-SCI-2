// Take input from the user in the following form (b^e).  For example, 3^4.  Use String and Math methods to output b raised to the e power.
import java.util.Scanner;

public class L03P01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter equation is this way\n\tA^B\n\t>");
        String formula = input
                            .nextLine()
                            .trim();
        
        
        double num0 = Double.parseDouble(formula.substring(0, formula.indexOf("^")));
        double num1 = Double.parseDouble(formula.substring(formula.indexOf("^")+1));
        
        System.out.printf("%.3f raised to the power %.3f is %.3f", 
            num0, 
            num1, 
            Math.pow(
                num1, 
                num0
            )
        );
    }
}