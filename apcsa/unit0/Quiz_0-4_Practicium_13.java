import java.util.Scanner;

public class Question13 {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        
        /* Use random formula to generate [-1000, 1000]. */
        int numToGuess = (int)(Math.random() * 2001) - 1000;
        int userGuess = -1001; /* Not possible to generate so the loop will always run 1 time. */
        
        int guessCount = 0;
        
        while (numToGuess != userGuess) {
            System.out.print("Enter guess: ");
            userGuess = sc.nextInt();
            
            ++guessCount;
            
            /* Give user feedback on if they are too high, too low, or correct. */
            if (userGuess > numToGuess) System.out.println("Too high!");
            else if (userGuess < numToGuess) System.out.println("Too Low!");
            else System.out.printf("Correct Guess, it took you %d guesses to guess %d\n", guessCount, numToGuess);
        }
    }
}
