package week06CodingProject;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	// Fields (hand, score, name)
	private List<Card> hand = new ArrayList<Card>();
	private int score = 0;
	private String name;
	
	// Constructor (Player)
	public Player (String name, int score, List<Card> hand) {
		this.name = name;
		this.score = score;
		this.hand = hand;
	}

	// Method (describe())
	public void describe() {
		System.out.println("My name is " + name + ", and the cards I have are");
		for (Card card : hand) {
			card.describe();
		}
	}

	// Method (flip())
	public Card flip() {
		Card top = new Card(name, score);
		top = hand.remove(0);
		return top;
	}
	
	// Method (draw())
	public void draw(Deck deck) {
		Card card = deck.draw();
		this.hand.add(card);
	}
	
	// Method (incrementScore())
	public void incrementScore() {
		this.score++;
	}
	
	// Methods (Getters and Setters)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	
}
