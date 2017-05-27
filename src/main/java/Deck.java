import java.util.*;

/*
 * A Deck of cards is represented as an ArrayList of Card class
 */

public class Deck {
	ArrayList<Card> deck;

	// char[] suits;
	// Initializing the Deck
	public Deck() {
		deck = new ArrayList<Card>();
		// suits=new char[]{'d','h','c','s'};
		for (Card.Suit suit : Card.Suit.values()) {
			for (Card.Rank rank : Card.Rank.values()) {
				Card card = new Card(suit, rank);
				deck.add(card);
			}
		}
		this.deck = deck;

	}

	// Method to return the initialized deck
	public ArrayList<Card> getDeck() {
		return deck;
	}

}
