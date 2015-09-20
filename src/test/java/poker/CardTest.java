package poker;

import org.junit.Test;
import static org.junit.Assert.*;

public class CardTest {

    @Test
    public void testCard_getValue() {
        Card cardUnderTest = new Card("2C");
        assertEquals(Card.Value.Two, cardUnderTest.getValue());
        
        cardUnderTest = new Card("3C");
        assertEquals(Card.Value.Three, cardUnderTest.getValue());
        
        cardUnderTest = new Card("4C");
        assertEquals(Card.Value.Four, cardUnderTest.getValue());
        
        cardUnderTest = new Card("5C");
        assertEquals(Card.Value.Five, cardUnderTest.getValue());
        
        cardUnderTest = new Card("6C");
        assertEquals(Card.Value.Six, cardUnderTest.getValue());
        
        cardUnderTest = new Card("7C");
        assertEquals(Card.Value.Seven, cardUnderTest.getValue());
        
        cardUnderTest = new Card("8C");
        assertEquals(Card.Value.Eight, cardUnderTest.getValue());
        
        cardUnderTest = new Card("9C");
        assertEquals(Card.Value.Nine, cardUnderTest.getValue());
        
        cardUnderTest = new Card("TC");
        assertEquals(Card.Value.Ten, cardUnderTest.getValue());
        
        cardUnderTest = new Card("JC");
        assertEquals(Card.Value.Jack, cardUnderTest.getValue());
        
        cardUnderTest = new Card("QC");
        assertEquals(Card.Value.Queen, cardUnderTest.getValue());
        
        cardUnderTest = new Card("KC");
        assertEquals(Card.Value.King, cardUnderTest.getValue());
        
        cardUnderTest = new Card("AC");
        assertEquals(Card.Value.Ace, cardUnderTest.getValue());
    }
    
    @Test
	public void testCard_getSuit() {
    	Card cardUnderTest = new Card("2C");
    	assertEquals(Card.Suit.Clubs, cardUnderTest.getSuit());
    	
    	cardUnderTest = new Card("2D");
    	assertEquals(Card.Suit.Diamonds, cardUnderTest.getSuit());
    	
    	cardUnderTest = new Card("2H");
    	assertEquals(Card.Suit.Hearts, cardUnderTest.getSuit());
    	
    	cardUnderTest = new Card("2S");
    	assertEquals(Card.Suit.Spades, cardUnderTest.getSuit());
	}

}
