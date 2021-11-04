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
			
			if (j % 12 == 0)
				done = true;
		}
		
		// While loops are useful for code that needs to run so long as something is true
		// For loops are useful for running for every item in a list or for a certain number of times
		
		// Do-while loops always run the enclosed code at least once, because the check for continuing is done at the end and not the beginning
		do {
			// Do more stuff
		} while (true);
	}
}
