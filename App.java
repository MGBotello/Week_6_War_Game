
public class App {

	public static void main(String[] args) {
		
		Deck newDeck = new Deck(); // Creating New Deck of 52 cards.
		
		Player player1 = new Player("MATT");// Creating player 1
		Player player2 = new Player("ALEX");// Creating player 2
		
		newDeck.shuffle();  // New deck is shuffled, which allows different outcomes when multiple games are played
		
		for (int i = 0; i < 52 ; i++) {         //
			if (i % 2 == 0) {					// This for loop divides the deck
				player1.drawCard(newDeck);      // of 52 cards, between the two players
				}else {							//* This creates a mini deck of 26 cards for each player
					player2.drawCard(newDeck);  //which will be the hand of that player
					}
			}
		
		// Integer Array to store the values of the 26 cards being flipped for player 1
		// from turn 1 to turn 26
		int[] player1PlayingCards = new int[26]; 
		
		
		/* This for-loop adds the values of the flipped cards to the array above.
		* it iterates 26 times, once for each card
		* we call the flip method on player 1 to get the first flipped card,
		* then, we get the value of that flipped card and add it  to the Array above
		*/
		for (int i = 0; i < 26 ; i++ ) {     							
			player1PlayingCards[i]= player1.flipCard().getValue(i);		
			} 
		
		
		System.out.println("Cards being played by " + player1.getName());
		
		/* This for-loop is just to show the cards being flipped and played by player 1
		 * It also separates each number with a comma except the last number
		 */
		for (int i = 0 ; i<player1PlayingCards.length;i++) {
			if (i <= 24) {
				System.out.print(player1PlayingCards[i]+ ",");
				}else {
					System.out.println(player1PlayingCards[i]);
					}
			}
		
		// *******  Same code as above but for player 2.  *********
		int [] player2PlayingCards = new int [26];
		
		for (int i = 0; i < 26 ; i++ ) {
			player2PlayingCards[i] = player2.flipCard().getValue(i);
			}
		
		System.out.println("");
		System.out.println("Cards being played by " + player2.getName());
		
		for (int i = 0 ; i<player2PlayingCards.length;i++) {
			if (i <= 24) {
				System.out.print(player2PlayingCards[i]+ ",");
				}else {
					System.out.println(player2PlayingCards[i]);
					System.out.println("");//Cosmetic line
					}
			}		
		
		/* This for-loop uses the two arrays created above that contain the values of the cards
		 * that were flipped by each player. It compares the values of the cards
		 * and gives one point to the owner of the higher value card or no point if its a draw.
		 * it calls the increment-score method on the winning player to increase their score by 1. 
		 * It also displays (prints out) who gets the point (if any) and shows the score during 
		 * that particular turn. 
		 */
		for (int i = 0; i < 26; i++) {
			if (player1PlayingCards[i] > player2PlayingCards[i]) {
				player1.incrementScore();
				System.out.print("Turn " + (i+1) + ": " + "One point for " + player1.getName());
				System.out.print("--> Score: " + player1.getName() + ": " + player1.getScore());
				System.out.println("   " + player2.getName() + ": " + player2.getScore());
				
			}else if(player1PlayingCards[i] < player2PlayingCards[i]){
				player2.incrementScore();
				System.out.print("Turn " + (i+1) + ": " + "One point for " + player2.getName());
				System.out.print("--> Score: " + player1.getName() + ": " + player1.getScore());
				System.out.println("   " + player2.getName() + ": " + player2.getScore());
				
			}else {
				System.out.println("Turn " + (i+1) + ": " + "Draw");
				}
			}
		
		//Finally, this if-else-if statement compares the final score and displays the name of the winner
		System.out.println("");
		if ( player1.getScore() > player2.getScore()) {
			System.out.println("          * * * " + player1.getName() +  " WINS! * * *");
		}else if ( player1.getScore() < player2.getScore() ) {
			System.out.println("          * * * " + player2.getName() + " WINS! * * *");
		}else {
			System.out.println("          ********** DRAW **********");
			}
		
	}//End of the main method
	}//end of the class "APP"
