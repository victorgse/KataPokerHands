package poker;

public class Card {
	
	public enum Suit {
		Clubs, Diamonds, Hearts, Spades
	}
	
	public enum Value {
		Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King, Ace
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
			value = Value.Two;
			break;
		case '3':
			value = Value.Three;
			break;
		case '4':
			value = Value.Four;
			break;
		case '5':
			value = Value.Five;
			break;
		case '6':
			value = Value.Six;
			break;
		case '7':
			value = Value.Seven;
			break;
		case '8':
			value = Value.Eight;
			break;
		case '9':
			value = Value.Nine;
			break;
		case 'T':
			value = Value.Ten;
			break;
		case 'J':
			value = Value.Jack;
			break;
		case 'Q':
			value = Value.Queen;
			break;
		case 'K':
			value = Value.King;
			break;
		case 'A':
			value = Value.Ace;
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
			suit = Suit.Clubs;
			break;
		case 'D':
			suit = Suit.Diamonds;
			break;
		case 'H':
			suit = Suit.Hearts;
			break;
		case 'S':
			suit = Suit.Spades;
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
