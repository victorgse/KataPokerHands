package poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import poker.Card.Suit;

public class Hand {
    
    private Set<Card> cards = new HashSet<Card>();
    private Set<Card.Value> pairs = new HashSet<Card.Value>();
    private Card.Value threeOfAKind = null;
    private Card.Value fourOfAKind = null;
    
    public Hand(String hand) {
        String[] cardTokens = hand.split(" ");
        List<Card.Value> cardValuesList = new ArrayList<Card.Value>();
        for (String cardToken : cardTokens) {
            Card card = new Card(cardToken);
            cardValuesList.add(card.getValue());
            cards.add(card);
        }
        for (Card.Value cardValue : Card.Value.values()) {
            int cardValueFrequency = Collections.frequency(cardValuesList, cardValue);
            if (cardValueFrequency == 2) {
                pairs.add(cardValue);
            } else if (cardValueFrequency == 3) {
                threeOfAKind = cardValue;
            } else if (cardValueFrequency == 4) {
                fourOfAKind = cardValue;
            }
        }
    }

    public boolean contains(Card card) {
        return cards.contains(card);
    }

    public int size() {
        return cards.size();
    }
    
    public boolean hasPair() {
        return !pairs.isEmpty();
    }
    
    public boolean hasTwoPairs() {
        return pairs.size() == 2;
    }
    
    public boolean hasThreeOfAKind() {
        return threeOfAKind != null;
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
    
    public boolean isFullHouse() {
        return this.hasThreeOfAKind() && this.hasPair();
    }
    
    public boolean hasFourOfAKind() {
        return fourOfAKind != null;
    }
    
    public boolean isStraightFlush() {
        return this.isStraight() && this.isFlush();
    }

}
