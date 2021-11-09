package Driver;

import java.io.IOException;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		while (true) {
			// Declaration of two variables with no values
			int a, b;
			
			// Read into these numbers
			Scanner scanner = new Scanner(System.in);
			
			try {
				// Here, a is assigned to by the user's input via the Scanner
				System.out.print("First number: ");
				a = scanner.nextInt();
				
				// Here, b is assigned as well
				System.out.print("Second number: ");
				b = scanner.nextInt();
				
				// a and b are used here because they have values from user input
				System.out.println("Sum: " + add(a, b));
				
				// Can use custom Exception classes by extended Exception
				throw new MyException();
				
			} catch (Exception e) {
				System.out.println("Hey, you have to type an integer! " + e.getMessage());
			} finally {
				// This code always runs, regardless of if an exception is thrown or what kind of exception
				// Useful for cleanup, logging, etc
			}
		}
	}
	
	public static int add(int a, int b) { 
		return a + b; 
	}
	
	
	// When throwing exceptions or using methods that do,
	// those exceptions must either be HANDLED in a try-catch block
	// or declared in the method header using throws
	// Being in this situation means you are using a CHECKED EXCEPTION
	// ie checked that it is properly handled by your IDE/compiler
	public static void uhOh() throws IOException {
		throw new IOException();
	}
}
