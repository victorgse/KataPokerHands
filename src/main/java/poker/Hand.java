package poker;

import java.util.HashSet;
import java.util.Set;

public class Hand {
    
    private Set<Card> cards = new HashSet<Card>();
    
    public Hand(String hand) {
        String[] cardTokens = hand.split(" ");
        for (String cardToken : cardTokens) {
            cards.add(new Card(cardToken));
        }
    }

    public boolean contains(Card card) {
        return cards.contains(card);
    }

    public int size() {
        return cards.size();
    }

}
