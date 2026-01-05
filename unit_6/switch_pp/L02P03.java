/*
Write the code to generate a random card from a deck. A-K in one of the appropriate suits (Clubs, Hearts, Diamonds, Spades). The program should generate a random number for the suit and a random number for the card value. Then, output the card name in the form "Ace of Clubs" or "10 of Hearts". Use switch statements for the output conditions.
*/

public class L02P03 {
    public static void main(String[] args) {
        String[] cardNums = {
            "ace", 
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine",
            "ten",
            "jack",
            "queen",
            "king"
        };
        
        String[] cardSuits = {
            "hearts",
            "diamonds",
            "spades",
            "clubs"
        };
        
        int randNum = (int)(Math.random() * cardNums.length);
        int randSuit = (int)(Math.random() * cardSuits.length);
        
        System.out.println(cardNums[randNum] + " of " + cardSuits[randSuit]);
    }
}