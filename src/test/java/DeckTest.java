import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/*
 * Contains test cases for the Deck() and getDeck()
 * methods of the Deck class
 */

public class DeckTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testDeck() {
		Deck deck = new Deck();
		assertEquals(true, deck instanceof Deck);
	}

	@Test
	public void testGetDeck() {
		Deck deck = new Deck();
		assertEquals(52, deck.getDeck().size());
	}
}
