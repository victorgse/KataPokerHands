package poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
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
    
    public boolean isStraight() {
        List<Card> cardsList = new ArrayList<Card>(cards);
        Collections.sort(cardsList);
        for (int i = 1; i < cardsList.size(); i++) {
            if ((cardsList.get(i).getValue().ordinal() - cardsList.get(i - 1).getValue().ordinal()) != 1) {
                return false;
            }
        }
        return true;
    }
    
    public boolean isFlush() {
        Set<Suit> suitsWithinHand = new HashSet<Suit>();
        cards.forEach(card -> suitsWithinHand.add(card.getSuit()));
        return (suitsWithinHand.size() == 1) ? true : false;
    }
    
    public boolean isStraightFlush() {
        return (this.isStraight() && this.isFlush());
    }

}
