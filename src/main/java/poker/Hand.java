package poker;

import java.util.HashSet;
import java.util.Set;

import poker.Card.Suit;

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
    
    public boolean isFlush() {
        Set<Suit> suitsWithinHand = new HashSet<Suit>();
        cards.forEach(card -> suitsWithinHand.add(card.getSuit()));
        return (suitsWithinHand.size() == 1) ? true : false;
    }

}
