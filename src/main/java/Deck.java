import java.util.ArrayList;
import java.util.Collections;
/*
 * A Deck of cards is represented as an arraylist of Card class
*/

public class Deck {
	ArrayList<Card> deck;
	char[] suits;
	// Initializing the Deck
	public Deck()
	{
		deck=new ArrayList<Card>();
		suits=new char[]{'d','h','c','s'};
		for(int i=1;i<=13;i++)
		{
			
			for(int j=0;j<4;j++)
			{ 
				Card card=new Card();
				card.setSuit(suits[j]);
				card.setRank(i);
				deck.add(card);
			}
		}
		this.deck=deck;
		
	}
	// Method to return the initialized deck
	public ArrayList<Card> getDeck()
	{
		return deck;
	}
	
}
