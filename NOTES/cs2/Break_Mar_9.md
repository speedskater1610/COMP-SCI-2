<!--Mar 9-->
# The `break` statement

The `break` statement can be used to end a loop early.


### Ex. Number guessing game 
```java
import java.util.Scanner;

public class Guess {
    public static void main(String[] a) {
        Scanner input = new Scanner(System.in);
        int num = (int)(Math.random() * 10) + 1;
        
        for(int i = 0; i < 5; i++) {
            System.out.print("Enter guess #" + i + " :");
            int guess = input.nextInt();
            
            if (guess == num) {
                System.out.println("You guessed correctly!");
                break;
            }
            
            if (i == 4) {
                System.out.println("Out of guesses");
            }
        }
    }
}
```
