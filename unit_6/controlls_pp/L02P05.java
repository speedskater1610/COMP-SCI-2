/*
Write the code to generate a random card from a deck (Ace-King) in one of the appropriate suits (Clubs, Hearts, Diamonds, Spades).  The program should generate a random number for the suit and a random number for the card value.  Then, output the card name in the form "Ace of Clubs" or "10 of Hearts".
*/

public class L02P05 {
    public static void main(String[] args) {
        int randType = (int)(Math.random() * 14); // [0,13]
        int randSuit = (int)(Math.random() * 4); // [0,3]
        
        Card card = new Card(randType, randSuit);
        card.print();
        
    }
    
    public enum CardType {
        ACE(0),
        ONE(1),
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9),
        TEN(10),
        JACK(11),
        QUEEN(12),
        KING(13);
        
        private final int cardCode;
        
        CardType(int cardCode) {
            this.cardCode = cardCode;
        }
    }
    
    public enum CardSuit {
        CLUBS(0),
        HEARTS(1),
        DIAMONDS(2),
        SPADES(3);
        
        private final int suitCode;
        
        CardSuit(int suitCode) {
            this.suitCode = suitCode;
        }
    }
    
    public static class Card {
        private final CardType type;
        private final CardSuit suit;
        
        public Card(int type, int suit) {
            this.type = CardType.values()[type]; 
            this.suit = CardSuit.values()[suit];
        }
        
        // DRY
        private <E extends Enum<E>> String cardString(E value) {
            return new StringBuilder(value.name().toLowerCase())
                        .deleteCharAt(0) // rm first  char
                        .insert(0, 
                            value.name().charAt(0)
                        )
                        .toString();
        }
        
        public void print() {
            String cardType = cardString(this.type);
            String cardSuit = cardString(this.suit);
            
            System.out.println(cardType + " of " + cardSuit);
        }
    }
}