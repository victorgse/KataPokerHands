package poker;

import java.util.HashMap;
import java.util.Map;

public class Card implements Comparable<Card> {

    public enum Value {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
    }
    
    public enum Suit {
        CLUBS, DIAMONDS, HEARTS, SPADES
    }
    
    private static final Map<Character, Value> valuesMap = new HashMap<Character, Value>();
    static {
        valuesMap.put('2', Value.TWO);
        valuesMap.put('3', Value.THREE);
        valuesMap.put('4', Value.FOUR);
        valuesMap.put('5', Value.FIVE);
        valuesMap.put('6', Value.SIX);
        valuesMap.put('7', Value.SEVEN);
        valuesMap.put('8', Value.EIGHT);
        valuesMap.put('9', Value.NINE);
        valuesMap.put('T', Value.TEN);
        valuesMap.put('J', Value.JACK);
        valuesMap.put('Q', Value.QUEEN);
        valuesMap.put('K', Value.KING);
        valuesMap.put('A', Value.ACE);
    }
    
    private static final Map<Character, Suit> suitsMap = new HashMap<Character, Suit>();
    static {
        suitsMap.put('C', Suit.CLUBS);
        suitsMap.put('D', Suit.DIAMONDS);
        suitsMap.put('H', Suit.HEARTS);
        suitsMap.put('S', Suit.SPADES);
    }

    private Value value;
    private Suit suit;

    public Card(String card) {
        this.value = extractValue(card);
        this.suit = extractSuit(card);
    }

    private Value extractValue(String card) {
        return valuesMap.get(card.charAt(0));
    }

    private Suit extractSuit(String card) {
        return suitsMap.get(card.charAt(1));
    }

    public Value getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public int compareTo(Card otherCard) {
        return this.value.compareTo(otherCard.value);
    }
    
    @Override
    public boolean equals(Object otherCard) {
        return this.compareTo((Card) otherCard) == 0;
    }

}
