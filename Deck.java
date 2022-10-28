import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	public List<Card> cards = new ArrayList<Card>(); // Field/variable-->List which will hold all 52 cards in the deck
	
		
	public Deck() { //Constructor(blueprint or recipe) to build the deck
		
		
	
		// String array to hold all the possible values written with words/strings
		String[] value = {"Two", "Three", "Four", "Five", "Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};
	
		
		/*Each for loop below will create all 13 values for each suit
		* Starts at 2 since our lowest value in our deck will be 2.
		*/
		
		// Hearts suit:
		for (int i = 2; i < 15; i++) {
			cards.add(new Card(i,value[i-2] + " of Hearts,"));
		}
		//Clubs suit:
		for (int i = 2; i < 15; i++) {
			cards.add(new Card(i,value[i-2] + " of Clubs,"));
		}
		//Spades Suit:
		for (int i = 2; i < 15; i++) {
			cards.add(new Card(i,value[i-2] + " of Spades,"));
		}
		//Diamond suit:
		for (int i = 2; i < 15; i++) {
			cards.add(new Card(i,value[i-2] + " of Diamonds,"));
		}
		
	}
	
	// Shuffle method. Will shuffle a newly created Deck
	public void shuffle () { // Shuffles the "cards list or deck"
		Collections.shuffle(cards);
	}
	
	/* This method below will take the first card in cards array A.K.A our deck
	* and place it into one of the players hand. And then delete that 
	* card from the deck
	*/
	public Card drawCard() {
		Card cardDrawn = cards.get(0);
		cards.remove(cardDrawn);
		return cardDrawn;
		
	}

	
}

	
	
	

	
	

	
	

