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
	public void testGetSuit() {
		Card card=new Card();
		card.setSuit('s');
		assertEquals('s',card.getSuit());
	}
   
	@Test
	public void testGetRank() {
		Card card=new Card();
		card.setRank(3);
		assertEquals(3,card.getRank());
	}

}
