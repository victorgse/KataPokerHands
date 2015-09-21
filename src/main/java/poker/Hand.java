package poker;

import java.util.Set;
import java.util.TreeSet;

public class Hand {
    
    private Set<Card> cards = new TreeSet<Card>();
    
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
