
public class Card {

/*
 * Represents a single card in the deck 
 * spades-'s', diamond-'d', hearts-'h', clubs-'c'
 * Ace-1, Jack-11, Queen- 12, King- 13
*/
	
private char suit;
private int rank;

/* 
 * getters and setters for Card class
*/

public void setSuit(char suit) {
	// TODO Auto-generated method stub
	this.suit=suit;
}

public char getSuit()
{
	return suit;
}

public void setRank(int rank)
{
	this.rank=rank;
}

public int getRank()
{
	return rank;
}

}
