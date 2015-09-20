package poker;

import org.junit.Test;
import static org.junit.Assert.*;

public class CardTest {

    @Test
    public void testCard_getValue() {
        Card cardUnderTest = new Card("2C");
        assertEquals(Card.Value.TWO, cardUnderTest.getValue());
        
        cardUnderTest = new Card("3C");
        assertEquals(Card.Value.THREE, cardUnderTest.getValue());
        
        cardUnderTest = new Card("4C");
        assertEquals(Card.Value.FOUR, cardUnderTest.getValue());
        
        cardUnderTest = new Card("5C");
        assertEquals(Card.Value.FIVE, cardUnderTest.getValue());
        
        cardUnderTest = new Card("6C");
        assertEquals(Card.Value.SIX, cardUnderTest.getValue());
        
        cardUnderTest = new Card("7C");
        assertEquals(Card.Value.SEVEN, cardUnderTest.getValue());
        
        cardUnderTest = new Card("8C");
        assertEquals(Card.Value.EIGHT, cardUnderTest.getValue());
        
        cardUnderTest = new Card("9C");
        assertEquals(Card.Value.NINE, cardUnderTest.getValue());
        
        cardUnderTest = new Card("TC");
        assertEquals(Card.Value.TEN, cardUnderTest.getValue());
        
        cardUnderTest = new Card("JC");
        assertEquals(Card.Value.JACK, cardUnderTest.getValue());
        
        cardUnderTest = new Card("QC");
        assertEquals(Card.Value.QUEEN, cardUnderTest.getValue());
        
        cardUnderTest = new Card("KC");
        assertEquals(Card.Value.KING, cardUnderTest.getValue());
        
        cardUnderTest = new Card("AC");
        assertEquals(Card.Value.ACE, cardUnderTest.getValue());
    }
    
    @Test
	public void testCard_getSuit() {
    	Card cardUnderTest = new Card("2C");
    	assertEquals(Card.Suit.CLUBS, cardUnderTest.getSuit());
    	
    	cardUnderTest = new Card("2D");
    	assertEquals(Card.Suit.DIAMONDS, cardUnderTest.getSuit());
    	
    	cardUnderTest = new Card("2H");
    	assertEquals(Card.Suit.HEARTS, cardUnderTest.getSuit());
    	
    	cardUnderTest = new Card("2S");
    	assertEquals(Card.Suit.SPADES, cardUnderTest.getSuit());
	}

}
