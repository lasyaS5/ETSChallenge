import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

/*
 * Contains test cases for the isShuffle() dealOneCard()
 * methods of the Deal class, also contains another function 
 * which ensures that the card is dealt
 */

public class DealTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIsShuffle() {
		Deck deck=new Deck();
		Deal deal=new Deal();
		deal.shuffle(deck.getDeck());
		assertTrue(deal.isShuffle());
	}

	@Test
	public void testDealOneCard() {
		Deck deck=new Deck();
		Deal deal=new Deal();
		deal.dealOneCard(deck.getDeck());
		assertTrue(deck.getDeck().size()<52);
	}
	@Test
	public void testCallDealOneCard(){
		Deck deck=new Deck();
		Deal deal=new Deal();
		//making 10 calls to the dealOneCard() function
		int num_of_calls=10;
		int i=0;
		while(i<num_of_calls)
		{
		deal.dealOneCard(deck.getDeck());
		i++;
		}
		// Checking the size of the deck after the calls
		assertTrue(deck.getDeck().size()==(52-i));
	}

}
