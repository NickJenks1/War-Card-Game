package week06CodingProject;

public class Card {
	
	// Fields (String name, String value)
	private String name;
	private int value;
	
	// Constructor (Card)
	Card (String name, int value) {
		this.name = name;
		this.value = value;
	}

	// Method (describe())
	public void describe() {
		System.out.println(name);
	}
	
	// Methods (Getters and Setters)
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
}
