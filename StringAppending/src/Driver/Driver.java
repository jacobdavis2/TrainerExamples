package Driver;

public class Driver {

	/*
	 * When we want to dynamically append to a String in-place, we will find that Strings alone are insufficient
	 * because strings are IMMUTABLE - they cant be changed once you make them.
	 */
	
	public static void main(String[] args) {
		String s = "Hello!";
		
		s += " and goodbye!";
		s = s + " and goodbye!";
		
		// This is what actually happens
		String temp = "and goodbye!";
		String finalString = s + temp;
		
		// The 'best practice' for this is to use StringBuilder
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10; ++i) {
			sb.append("a");
		}
		finalString = sb.toString();
		
		// We also have something called StringBuffer
		StringBuffer sbb = new StringBuffer();
		
		// StringBuffer is THREAD-SAFE, that is, it can be used safely and securely in a multithreading environment
		// StringBuilder is also slightly faster than StringBuffer
	}
}
