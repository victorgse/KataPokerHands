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
		Value tempValue;

		switch (ch) {
		case '2':
			tempValue = Value.TWO;
			break;
		case '3':
			tempValue = Value.THREE;
			break;
		case '4':
			tempValue = Value.FOUR;
			break;
		case '5':
			tempValue = Value.FIVE;
			break;
		case '6':
			tempValue = Value.SIX;
			break;
		case '7':
			tempValue = Value.SEVEN;
			break;
		case '8':
			tempValue = Value.EIGHT;
			break;
		case '9':
			tempValue = Value.NINE;
			break;
		case 'T':
			tempValue = Value.TEN;
			break;
		case 'J':
			tempValue = Value.JACK;
			break;
		case 'Q':
			tempValue = Value.QUEEN;
			break;
		case 'K':
			tempValue = Value.KING;
			break;
		case 'A':
			tempValue = Value.ACE;
			break;
		default:
			tempValue = null;
			break;
		}

		return tempValue;
	}

	private Suit extractSuit(String card) {
		char ch = card.charAt(1);
		Suit tempSuit;

		switch (ch) {
		case 'C':
			tempSuit = Suit.CLUBS;
			break;
		case 'D':
			tempSuit = Suit.DIAMONDS;
			break;
		case 'H':
			tempSuit = Suit.HEARTS;
			break;
		case 'S':
			tempSuit = Suit.SPADES;
			break;
		default:
			tempSuit = null;
			break;
		}

		return tempSuit;
	}

	public Value getValue() {
		return value;
	}

	public Suit getSuit() {
		return suit;
	}

}
