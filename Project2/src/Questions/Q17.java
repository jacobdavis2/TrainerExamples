package Questions;

import java.util.Scanner;

public class Q17 {

	public float CalculateInterest() {
		float principal, rate;
		int years;
		
		// Get inputs
		while (true) {
			try {
				Scanner scanner = new Scanner(System.in);
				
				System.out.print("Please enter your current pincipal: ");
				principal = scanner.nextFloat();
				
				System.out.print("Please enter your rate (%):");
				rate = scanner.nextFloat();
				
				System.out.print("Please enter the length of your loan in years: ");
				years = scanner.nextInt();
				
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		float interest = principal * rate * years;
		System.out.println("Your interest is " + interest);
		
		return interest;
	}
}
