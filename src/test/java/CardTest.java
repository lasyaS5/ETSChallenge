import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/*
 * Contains test cases for the getSuit() and getRank() 
 * methods of the Card class
 */

public class CardTest {

	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void testGetSuitGetRank() {

		Card card = new Card(Card.Suit.CLUBS, Card.Rank.ACE);
		assertEquals("Clubs", card.getSuit().getText());
		assertEquals(1, card.getRank().getRank());
		assertEquals("Ace", card.getRank().getText());

	}

}
