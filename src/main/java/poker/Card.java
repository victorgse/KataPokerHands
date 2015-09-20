package poker;

public class Card {
	
	public enum Suit {
		CLUBS, DIAMONDS, HEARTS, SPADES
	}
	
	public enum Value {
		TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
	}

	private Value value;
	private Suit suit;

	public Card(String card) {
		this.value = extractValue(card);
		this.suit = extractSuit(card);
	}

	private Value extractValue(String card) {
		char ch = card.charAt(0);
		Value value;

		switch (ch) {
		case '2':
			value = Value.TWO;
			break;
		case '3':
			value = Value.THREE;
			break;
		case '4':
			value = Value.FOUR;
			break;
		case '5':
			value = Value.FIVE;
			break;
		case '6':
			value = Value.SIX;
			break;
		case '7':
			value = Value.SEVEN;
			break;
		case '8':
			value = Value.EIGHT;
			break;
		case '9':
			value = Value.NINE;
			break;
		case 'T':
			value = Value.TEN;
			break;
		case 'J':
			value = Value.JACK;
			break;
		case 'Q':
			value = Value.QUEEN;
			break;
		case 'K':
			value = Value.KING;
			break;
		case 'A':
			value = Value.ACE;
			break;
		default:
			value = null;
			break;
		}

		return value;
	}

	private Suit extractSuit(String card) {
		char ch = card.charAt(1);
		Suit suit;

		switch (ch) {
		case 'C':
			suit = Suit.CLUBS;
			break;
		case 'D':
			suit = Suit.DIAMONDS;
			break;
		case 'H':
			suit = Suit.HEARTS;
			break;
		case 'S':
			suit = Suit.SPADES;
			break;
		default:
			suit = null;
			break;
		}

		return suit;
	}

	public Value getValue() {
		return value;
	}

	public Suit getSuit() {
		return suit;
	}

}
