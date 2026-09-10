/*
The game of craps is played with two dice.  Use Math.random to generate two numbers between 1 and 6, each representing the roll of a die.  The player rolls both die, if the sum is 7 or 11, they are an instant winner.  If the sum is 2 or 10, they are an instant loser.  Any other sum is set as the point and should be output.  Be sure to use a nested if structure.
*/


public class L02P04 {
    public static void main(String[] args) {
        int dieSum = rollDie() + rollDie();
        
        if (dieSum == 7 || dieSum == 11) {
            System.out.println("Winner");
        } 
        else if (dieSum == 2 || dieSum == 10) {
            System.out.println("Loser");
        }
        else {
            System.out.println(dieSum);
        }
    }
    
    public static int rollDie() {
        return (int)(Math.random() * 6 + 1);
    }
}