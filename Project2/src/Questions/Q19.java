package Questions;

import java.util.ArrayList;

public class Q19 {
	
	ArrayList<Integer> integers;

	public void arrayListPrimes() {
		integers = new ArrayList<Integer>();
		for (int i = 1; i <= 10; ++i) {
			integers.add(i);
		}
		
		printArrayList();
		
		System.out.println("Even total: " + addEvenNumbers());
		System.out.println("Odd total: " + addOddNumbers());
		
		trimPrimes();
		
		printArrayList();
		
	}
	
	private void printArrayList() {
		
		System.out.print("The ArrayList's content: [");
		for (Integer i : integers) {
			System.out.print(i + " ");
		}
		System.out.println("]");
	}
	
	private int addEvenNumbers() {
		
		int total = 0;
		for (Integer i : integers) {
			if (i % 2 == 0)
				total += i;
		}
		
		return total;
	}
	
	private int addOddNumbers() {
		int total = 0;
		for (Integer i : integers) {
			if (i % 2 == 1)
				total += i;
		}
		
		return total;
	}
	
	public boolean isPrime(int integer) {
		
		if (integer == 0 || integer == 1)
			return false;
		
		for (int i = 2; i < integer; ++i) {
			if (integer % i == 0)
				return false;
		}
		
		return true;
	}
	
	private void trimPrimes() {
		for (int i = 0; i < integers.size(); ++i) {
			if (isPrime(integers.get(i))) {
				integers.remove(i);
				// Subtract one to account for the removal of a prime
				--i;
			}
		}
	}
}
