import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Deal {

	public void shuffle(ArrayList<Card> deck) {
		Collections.shuffle(deck);

	}

	public Card dealOneCard(ArrayList<Card> deck) {
		shuffle(deck);
		Random random = new Random();
		Card card = null;
		int index = 0;
		if (deck.size() > 0) {
			index = random.nextInt(deck.size());

			card = new Card(deck.get(index).getSuit(), deck.get(index)
					.getRank());
			card = deck.remove(index);

		} else {
			System.out.print("dealt 52 already");
		}
		return card;
	}

	public void showCard(Card card) {
		System.out.print(card.getSuit().getText() + " "
				+ card.getRank().getText());
		System.out.println();
	}

	public void makeDeal() {
		System.out.println("How many cards do you wanna deal? (limit: 52)");
		Scanner s = new Scanner(System.in);
		int deals = s.nextInt();
		if (deals > 52) {
			System.out.println("You can't make more than 52 deals");
			System.out.println("Wanna try again y/n");
			String choice = s.next();
			if (choice.toLowerCase().equals("y")) {
				makeDeal();
			} else {
				return;
			}
		} else {
			Deck deck = new Deck();
			Deal deal = new Deal();
			int i = 0;
			while (i < deals) {
				Card card = null;
				card = deal.dealOneCard(deck.getDeck());
				deal.showCard(card);
				i++;
			}

		}
	}

	public static void main(String[] args) {
		Deal deal = new Deal();
		deal.makeDeal();
	}
}
