/*
The game of craps is played with two dice. Use Math.random to generate two numbers between 1 and 6, each representing the roll of a die. The player rolls both die, if the sum is 7 or 11, they are an instant winner. If the sum is 2 or 10, they are an instant loser. Any other sum is set as the point. Be sure to use a switch structure.
*/

public class L02P01 {
    public static void main(String[] args) {
        int roll = 
            (int)(Math.random() * 6 - 1) 
                + 
            (int)(Math.random() * 6 - 1);
        
        switch (roll) {
            case 7:
            case 11:
                System.out.println("Winner.");
                break;
            case 2:
            case 10:
                System.out.println("Loser.");
                break;
            default:
                System.out.println("Point.");
                break;
        }
    }
}