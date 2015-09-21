package poker;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HandTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

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

}
