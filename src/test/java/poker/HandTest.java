package poker;

import static org.junit.Assert.*;

import org.junit.Test;

public class HandTest {

    @Test
    public void testHandContains() {
        Hand handUnderTest = new Hand("2H 3D 5S 9C KD");
        assertEquals(5, handUnderTest.size());
        assertEquals(true, handUnderTest.contains(new Card("2H")));
        assertEquals(true, handUnderTest.contains(new Card("3D")));
        assertEquals(true, handUnderTest.contains(new Card("5S")));
        assertEquals(true, handUnderTest.contains(new Card("9C")));
        assertEquals(true, handUnderTest.contains(new Card("KD")));
        assertEquals(false, handUnderTest.contains(new Card("2D")));
        assertEquals(false, handUnderTest.contains(new Card("AD")));
    }
    
    @Test
    public void testHandIsStraight() {
        Hand handUnderTest = new Hand("8S 9S TS JS QS");
        assertEquals(true, handUnderTest.isStraight());
        
        handUnderTest = new Hand("2S 8S AS QS 3C");
        assertEquals(false, handUnderTest.isStraight());
    }
    
    @Test
    public void testHandIsFlush() {
        Hand handUnderTest = new Hand("2S 8S AS QS 3S");
        assertEquals(true, handUnderTest.isFlush());
        
        handUnderTest = new Hand("2S 8S AS QS 3C");
        assertEquals(false, handUnderTest.isFlush());
    }

}
