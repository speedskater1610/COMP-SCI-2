/*
Write a program that asks the user to enter a number between 10 and 20.  Then print "hello" on the screen that many times.  Use a for loop.
*/
import java.util.Scanner;

public class L2P02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number between 10 & 20:");
        int num = input.nextInt();
    
        if (num < 10 || num > 20) {
            System.err.println("Bad number range!");
            System.exit(1);
        }
        
        for(; --num >= 0;) { 
/**
lowk most fire for loop I have ever written

other than maybe this

```C++
for(auto i{10uz}; i--;) {}
```

you dont even know how good this syntax is 
*/
            System.out.println("hello");
        }
    }
}
