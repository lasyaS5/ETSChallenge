public class Card {
	private Suit suit;
	private Rank rank;

	public Card(Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
	}

	public enum Suit {
		HEARTS("Hearts"), DIAMONDS("Diamonds"), SPADES("Spades"), CLUBS("Clubs");
		private String suit;

		Suit(String suit) {
			this.suit = suit;
		}

		public String getText() {
			return this.suit;
		}
	}

	public enum Rank {
		ACE(1, "Ace"), TWO(2, "Two"), THREE(3, "Three"), FOUR(4, "Four"), FIVE(
				5, "Five"), SIX(6, "Six"), SEVEN(7, "Seven"), EIGHT(8, "Eight"), NINE(
				9, "Nine"), TEN(10, "Ten"), JACK(11, "Jack"), QUEEN(12, "Queen"), KING(
				13, "King");
		private int rank;
		private String text;

		Rank(int rank, String text) {
			this.rank = rank;
			this.text = text;
		}

		public int getRank() {
			return this.rank;
		}

		public String getText() {
			return this.text;
		}
	}

	public Suit getSuit() {
		return suit;
	}

	public Rank getRank() {
		return rank;
	}

}
