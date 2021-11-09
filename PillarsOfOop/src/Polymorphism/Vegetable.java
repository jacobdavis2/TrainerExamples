package Polymorphism;

public class Vegetable extends Food {

	public Vegetable(int calories, String name, boolean isTuber) {
		// The "super" keyword calls the superclass constructor
		super(calories, name);
		
		this.isTuber = isTuber;
	}
	
	boolean isTuber;
}
