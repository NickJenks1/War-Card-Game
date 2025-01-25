package week06CodingProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	// Field (List cards)
	private List<Card> cards = new ArrayList<Card>();
	
	// Fields (String[] names, String[] values)
	public String[] names = {"Hearts", "Diamonds", "Clubs", "Spades"};
	
	public String[] values = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
							  "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
	
	// Constructor (Deck())
	public Deck() {
		for (String name : names) {
			int cardNumber = 2;
			for (String suit : values) {
				Card card = new Card(name, cardNumber);
				card.setName(suit + " of " + name);
				card.setValue(cardNumber);
				this.cards.add(card);
				cardNumber++;
			}
			}
		}
	
	// Methods (shuffle(), draw())
	public void shuffle() {
		Collections.shuffle(this.cards);
	}	
	
	public Card draw() {
		Card drawnCard = cards.get(0);
		cards.remove(0);
		return drawnCard;
	}
	
}
