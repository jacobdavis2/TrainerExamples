package Questions;

public class Q18_Subclass extends Q18_Superclass {

	public boolean hasUppercaseLetter(String s) {
		
		char[] characters = s.toCharArray();
		
		for (char c : characters) {
			int numerical = (int) c;
			
			if (numerical >= 65 && numerical <= 90)
				return true;
		}
		
		return false;
	}
	
	public String toUpperCase(String s) {
		
		char[] characters = s.toCharArray();
		
		for (int i = 0; i < characters.length; ++i) {
			if ( (int)characters[i] > 90 )
				characters[i] -= 32;
		}
		
		return new String(characters);
	}
	
	public int stringToInt(String s) {
		
		char[] characters = s.toCharArray();
		int total = 0;
		
		for (char c : characters) {
			total += (int)c;
		}
		
		return total + 10;
	}
}
