package Driver;

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
			} catch (Exception e) {
				System.out.println("Hey, you have to type an integer! " + e.getMessage());
			}
		}
	}
	
	public static int add(int a, int b) { 
		return a + b; 
	}
}
