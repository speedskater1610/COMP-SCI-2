/*
Write a program that stores two integers from the user and allows them to enter a character. If they enter A, add the numbers, M – multiply the numbers, S – subtract the numbers, D – divide the numbers(be careful of division by 0). Display the results of your arithmetic. Use a switch statement.
*/
import java.util.Scanner;

public class L02P02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter operation char: ");
        char op = input.nextLine().toLowerCase().charAt(0);
        
        System.out.print("Enter the first num: ");
        int num1 = input.nextInt();
        
        System.out.print("Enter the second num: ");
        int num2 = input.nextInt();
        
        
        Operation operation;
        switch (op) {
            case 'a':
                operation = Operation.A;
                break;
                
            case 'm':
                operation = Operation.M;
                break;
                
            case 's':
                operation = Operation.S;
                break;
                
            case 'd':
                operation = Operation.D;
                break;
                
            default:
                System.out.println("Invalid operation entered. Exiting.");
                input.close();
                return;
        }
        
        System.out.println("Output is: " + operation.process(num1, num2));
    }
    
    public enum Operation {
        /* Did java do something correct? */
        /* No because this is a tagged union not a enum */
        /* But I do like the syntax */
        A(1) {
            @Override
            public int process(int a, int b) {
                return a + b;
            }
        },
        M(2) {
            @Override
            public int process(int a, int b) {
                return a * b;
            }
        },
        S(3) {
            @Override
            public int process(int a, int b) {
                return a - b;
            }
        },
        D(4) {
            @Override
            public int process(int a, int b) {
                if (b == 0) return 0;
                return a / b;
            }
        };
        
        public abstract int process(int a, int b);
        public final int tag;
    
        private Operation(int code) {
            this.tag = code;
        }
    }
}