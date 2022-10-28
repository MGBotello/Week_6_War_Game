
public class Card {
	
	
	// Field values A.K.A Variables
	private int value;
	private String name;
	
	// Constructor to build a "Card" object
	public Card (int value, String name) {
		this.name = name;
		this.value = value;
	}
	
	// Method to be called in the main APP to describe a card
	// with the name and value of that card
	public void describeCard() {
		System.out.println(name + " " + "Value: " + value);
	}
	
	// Getters and Setters for the above fields/variables to 
	//be able to get and set values to the variables of this class
	public int getValue(int x) {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
				
	}
	
