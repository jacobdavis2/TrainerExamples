package MyPackage;

public class ArithmeticOperators {

	public void operate() {
		/* Standard arithmetic operators:
		 * + - Addition
		 * - - Subtraction
		 * * - Multiplication
		 * / - Division
		 * () - Parens for making statements evaluate independently
		 * % - Modulo - returns the remainder of some integer division, e.g. 10 % 3 = 1 because 10 / 3 = 3, and 10 - (3*3) = 1
		 * NOTE: we do NOT have ^, this initiates a bit-shifting operation. To do exponential math, you'll need an official Math library
		 */
		
		int x = 5 + 5 * 10 - 3 / 2;
		System.out.println(x);
		
		int y = 5 * (2 + 2) / 5 - 2;
		System.out.println(y);
		
		int z = 10 % 3;
		System.out.println(z);
		
		// All arithmetic operators require two operands, that is if using +, there should be a number on both sides
	}
}
