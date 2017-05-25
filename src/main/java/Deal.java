import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


public class Deal {
	
	private boolean shuffle=false;
	
	public void shuffle(ArrayList<Card> deck)
	{
		Collections.shuffle(deck);
		shuffle=true;
	}
	public boolean isShuffle()
	{
		return shuffle;
		
	}
	public Card dealOneCard(ArrayList<Card> deck)
	{
		shuffle(deck);
		Random random=new Random();
		Card card=new Card();
		int index=0;
		if(deck.size()>0)
		{
		 index=random.nextInt(deck.size());
		 
			card.setSuit(deck.get(index).getSuit());
			card.setRank(deck.get(index).getRank());
			card=deck.remove(index);
			
		}
		else
		{
			System.out.print("dealt 52 already");
		}
		return card;
	}
	public void showCard(Card card)
	{
		switch(card.getSuit()){
		case 'h':
			System.out.print("Hearts");
			break;
		case 'd':
			System.out.print("Diamonds");
			break;
		case 'c':
			System.out.print("Clubs");
			break;
		case 's':
			System.out.print("Spades");
			break;	
		}
		switch(card.getRank())
		{
		case 1:
			System.out.print(" "+"Ace");
			break;
		case 11:
			System.out.print(" "+"Jack");
			break;
		case 12:
			System.out.print(" "+"Queen");
			break;
		case 13:
			System.out.print(" "+"King");
			break;
		default:
			System.out.print(" "+card.getRank());
		}
		System.out.println();
	}
	public void makeDeal()
	{
		System.out.println("How many cards do you wanna deal? (limit: 52)");
		Scanner s=new Scanner(System.in);
		int deals=s.nextInt();
		if(deals>52)
		{
			System.out.println("You can't make more than 52 deals");
			System.out.println("Wanna try again y/n");
			String choice=s.next();
			if(choice.toLowerCase().equals("y"))
			{
				makeDeal();
			}
			else
			{
				return;
			}
		}
		else
		{
			Deck deck=new Deck();
			Deal deal=new Deal();
			int i=0;
			while(i<deals)
			{
				Card card=new Card();
				card=deal.dealOneCard(deck.getDeck());
				deal.showCard(card);
				i++;
			}
			
		}
	}
	public static void main(String[] args)
	{
		Deal deal=new Deal();
		deal.makeDeal();
	}
}
