package MyPackage;


public class Driver {

	public static void main(String[] args) {
		String myMessage = "Hello!"; // This is called a String Literal, named for the manually-entered value
		int runIterations = 5;
		
		for (int i = 0; i < runIterations; ++i) {
			System.out.println(myMessage + ": " + i);
		}
		
		/*
		 * 1. Start i at 0
		 * 2. Check if i is less than the value stored in runIterations. If it isn't, the for-loop ends
		 * 3. If it is, run the code between the curly braces and increment (that is, add 1 to) the value held by i
		 * 4. Go to step 2
		 */
		
		int j = 0;
		while (j < runIterations)
		{
			System.out.println("J is still going! J = " + j);
			++j;
		}
		
		boolean done = false;
		// ! symbol means "not", negates any boolean value (ie reverses it)
		while (!done) { // Could also have written done == false
			System.out.println("Still not done!");
			++j;
			
			if (j % 12 == 0)
				done = true;
		}
		
		// While loops are useful for code that needs to run so long as something is true
		// For loops are useful for running for every item in a list or for a certain number of times
		
		// Do-while loops always run the enclosed code at least once, because the check for continuing is done at the end and not the beginning
		do {
			// Do more stuff
		} while (!done);
		
		
		// When doing a series of checks (i.e. boolean statements), we can use the keywords if, else to chain them together
		boolean signedUp = false, qualifiesForPremium = false;
		int age = 20;
		
		if (signedUp) {
			System.out.println("Signed up!");
			
			if (qualifiesForPremium && age >= 21) {
				// Give premium service
			} else {
				// In all other cases, give regular service
			}
		} else {
			if (age > 20) {
				// This will only be run if signedUp is FALSE and age is greater than 20
				System.out.println("Age is greater than 20!");
			} else if (age > 15) {
				System.out.println("Age is greater than 15!");
			} else if (age > 10) {
				System.out.println("Age is greater than 10!");
			} else {
				System.out.println("Youre young!");
				// Usually best practice to have an else block. At minimum can put errors here if this code should never run
				// or we simply need to catch all remaining cases
			}
		}
		
		// A Switch statement is best for checking for different specific values of some variable
		// Can check for values Strings, ints, or enums (which are ints in the background)
		String command = "message";
		switch (command) {
		
		// Each potential value that we are checking should have a case
		case "download":
			// Function A
			
			System.out.println("Downloading a file!");
			
			// Use break if you want to immediately exit a block (i.e. anything between { } ) 
			// even if there are more lines of code to run the block
			break;
			
		case "message":
			// Function A
			// Function B
			
			System.out.println("Message has been sent!");
			break;
			
		case "upload":
			System.out.println("Uploading!");
			break;
		
		// This case runs if no other case is selected
		default:
			System.out.println("No other cases  matched...");
		}
	}
}
