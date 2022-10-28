import java.util.ArrayList;
import java.util.List;

public class Player {
	
	// below are the fields/variables of this class
	List<Card> playersHand = new ArrayList<>(); // Contains elements of "Card" data type
	private int score;
	private String name;
	
	//Constructor to make the player(s) when called upon
	// The player will have a name and a starting score of 0, which will be updated 
	// if that player wins a round. 
	public Player (String name) {
		this.name = name;
		this.score = 0;
		}
	
	// when called upon, this method will add a card to the players hand from the deck
	public void drawCard (Deck deck) {
		playersHand.add(deck.drawCard());
		}
	
	// This method will describe a player by name and will also call the method "describeCard"
	// from the Card Class, to show the card a player has. 
	public void describePlayer() {
		System.out.println(name + " has:");
		for (Card card : playersHand) {
			card.describeCard();
			}
		}
	
	// This List was created to hold the value of the cards being played or flipped by each player
	List<Card> cardsBeingPlayed = new ArrayList<>();

	
	//This method "grabs" the top/first card of a players hand and adds it to the List above
	// and removes it from the players "hand"
	// because that card was played and it isn't in the players hand anymore
	public Card flipCard () {
		Card flippedCard = playersHand.get(0);
		cardsBeingPlayed.add(flippedCard);
		playersHand.remove(0);
		return flippedCard;
		}
	
	// This method describes the cards in the List above
	// which represents the card being played or flipped in that players turn
	public void describeCard() {
		for (Card card:cardsBeingPlayed) {
			card.describeCard();
			}
		}
	
	
	// This method will be called when a player wins a round. It will increase that player's
	// score by 1. 
	public void incrementScore() {
	score++;
	}
	
	
	
		

	
	
	
	
	
	
	
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
