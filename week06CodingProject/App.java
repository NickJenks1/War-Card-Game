package week06CodingProject;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		// Instantiate (Deck)
		Deck deck = new Deck();
		
		// Instantiate (hands)
		List<Card> hand1 = new ArrayList<Card>();
		List<Card> hand2 = new ArrayList<Card>();
		
		// Instantiate (players)
		Player player1 = new Player("Nick", 0, hand1);
		Player player2 = new Player("Drea", 0, hand2);

		// Shuffle
		deck.shuffle();
		
		// For loop (Draw all cards)
		for (int d = 1; d <= 52; d++) {
			if (d % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
		}
		
		// Description of players and the cards they have been dealt
		player1.describe();
		System.out.println("-----------------------");
		player2.describe();
		System.out.println("-----------------------");
		System.out.println("Cards are dealt!");
		System.out.println();
		System.out.println("Nick's cards = " + hand1.size());
		System.out.println("Drea's cards = " + hand2.size());
		System.out.println("-----------------------");
		
		
		
		// For loop (Play out the cards, shows scores after each turn)
		for (int w = 0; w < 26; w++) {
			
			Card player1TopCard = player1.flip();
			Card player2TopCard = player2.flip();
			
			if (player1TopCard.getValue() > player2TopCard.getValue()) {
				player1.incrementScore();
				System.out.println("-----------------------");
				System.out.println(player1.getName() + "'s card:");
				player1TopCard.describe();
				System.out.println();
				System.out.println(player2.getName() + "'s card:");
				player2TopCard.describe();
				System.out.println();
				System.out.println(player1.getName() + " WINS THE TURN!");
				System.out.println(player1.getName() + " has won a point!");
				System.out.println();
				System.out.println(player1.getName() + "'s score: " + player1.getScore());
				System.out.println();
				System.out.println(player2.getName() + "'s score: " + player2.getScore());
				
			} else if (player1TopCard.getValue() < player2TopCard.getValue()) {
				player2.incrementScore();
				System.out.println("-----------------------");
				System.out.println(player1.getName() + "'s card:");
				player1TopCard.describe();
				System.out.println();
				System.out.println(player2.getName() + "'s card:");
				player2TopCard.describe();
				System.out.println();
				System.out.println(player2.getName() + " WINS THE TURN!");
				System.out.println(player2.getName() + " has won a point!");
				System.out.println();
				System.out.println(player1.getName() + "'s score: " + player1.getScore());
				System.out.println();
				System.out.println(player2.getName() + "'s score: " + player2.getScore());
				
			} else {
				System.out.println("-----------------------");
				System.out.println(player1.getName() + "'s card:");
				player1TopCard.describe();
				System.out.println();
				System.out.println(player2.getName() + "'s card:");
				player2TopCard.describe();
				System.out.println();
				System.out.println("It is a draw.");
				System.out.println("No points awarded!");
				System.out.println();
				System.out.println(player1.getName() + "'s score: " + player1.getScore());
				System.out.println();
				System.out.println(player2.getName() + "'s score: " + player2.getScore());
			}
			
		}
		
		// Displays the final scores
		System.out.println("-----------------------");
		System.out.println();
		System.out.println("--- Final scores ---");
		System.out.println();
		System.out.println(player1.getName() + ":");
		System.out.println(player1.getScore());
		System.out.println();
		System.out.println(player2.getName() + ":");
		System.out.println(player2.getScore());
		System.out.println();
		
		// Displays win messages, or draw message
		if (player1.getScore() > player2.getScore()) {
			System.out.println("Congrats, " + player1.getName() + "! You have won the game!");
		} else if (player1.getScore() < player2.getScore()) {
			System.out.println("Congrats, " + player2.getName() + "! You have won the game!");
		} else {
			System.out.println("The game has resulted in a draw! Better luck next time!");
		}
		
	}

}
