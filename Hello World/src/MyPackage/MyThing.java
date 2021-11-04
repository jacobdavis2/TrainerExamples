package MyPackage;

public class MyThing {
	
	// If no constructor is defined, all objects have a no-params constructor that does nothing called a "default constructor"
	// As soon as a constructor of any kind is defined, you lose access to your default constructor
	
	// Constructors are special methods that run immediately upon creation of an object
	public MyThing() {
		System.out.println("Hello from inside a no-params constructor!");
	}
	
	// We can pass parameters into constructors as well. These are called "parameterized constructors".
	public MyThing(int a, float b) {
		System.out.println("Hello from inside a parameterized constructor!");
		
		// Constructors are often used to set initial values for data in the data model
		this.myWholeNumber = a;
		this.myDecimal = b;
	}
	
	/* Ways to name variables and classes in Java:
	 * Camel Case: firstLetterLowerCase, upper case for each new word's first letter, no spaces
	 * Pascal Case: Capitalize first letter of every word, no spaces
	 * 
	 * Alternate naming strategies:
	 * Snake Case: under_scores_separating_words, no spaces or caps
	 * Kebab Case: hyphens-separating-words, no spaces or caps
	 * 
	 * NO NUMBERS
	 */
	
	// PRIMITIVE DATA TYPES
	// Whole numbers
	byte myByte = 1; // 8 bits, half of an short
	short mySmallNumber = 5; // Half of an int. 16 bits
	int myWholeNumber; // Short for 'integer'. 32 bits. Whole numbers only, eg 1, 5, etc
	long myBigNumber; // 64 bit, twice as large as an int
	
	// Decimal numbers
	float myDecimal = 1.05f; // 'Floating-point' or decimal number. 32 bits. Notoriously inaccurate. MUST use f or Java thinks its a double 
	double myMorePreciseDecimal = 1.06; // 64 bits, double precision decimal number
	
	// True / false
	boolean myTrueOrFalse; // 1 byte or 8 bits
	
	// Character
	char myCharacter; // 16 bits, stores ASCII unless otherwise specified
	
	// Reference - holds the memory address of some object
	Object o; // References are 32 bits on a x86 (32-bit machine) and 64 bits on a 64-bit machine
	
	// My first method. Prints a string that contains some of the values of this class
	public void PrintMyValues() {
		System.out.println("My values are: " + myByte + ", " + mySmallNumber + ", " + myDecimal);
	}
	
}
