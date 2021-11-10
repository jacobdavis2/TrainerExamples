package Driver;

import java.util.Arrays;

import Questions.Q1;
import Questions.Q13;
import Questions.Q14;
import Questions.Q15;
import Questions.Q16;
import Questions.Q17;
import Questions.Q18_Subclass;
import Questions.Q19;
import Questions.Q20;
import Questions.Q3;
import Questions.Q5;
import Questions.Q7;
import Questions.Q8;

public class Driver {

	// Ellipsis is called var-args, and allows zero, one, or many of the same type of argument
	public static void main(String... args)
	{
		// Array initialization syntax (filled array)
		/*int[] myArray = { 19, 20, 1, 16, 7, 9 };
		
		// Array declaration syntax (empty array)
		int[] myOtherArray = new int[10];
		myOtherArray[0] = 19;
		myOtherArray[1] = 20;
		// myOtherArray[2] = ...
		
		int[] sortedArray = Q1.BubbleSort(myArray);
		System.out.println(Arrays.toString(sortedArray));
		
		//Q1.BubbleSort(array);
		
		Q3.TestReverse();
		
		Q5.TestSubstring(4);
		
		Q7 q7 = new Q7();
		q7.Compare();
		
		Q8 q8 = new Q8();
		q8.Palindrome();
		
		Q13.PrintTriangle(4);
		
		Q14.SwitchCases(1);
		Q14.SwitchCases(2);
		Q14.SwitchCases(3);
		
		Q15 q15 = new Q15();
		q15.Interfaces();
		
		//Q16.Count(args[0]);
		if (args.length > 0)
			System.out.println(args[0].length());
		
		Q17 q17 = new Q17();
		q17.CalculateInterest();*/
		
		/*Q18_Subclass q18 = new Q18_Subclass();
		System.out.println(q18.hasUppercaseLetter("Jacob"));
		System.out.println(q18.hasUppercaseLetter("zebra"));
		System.out.println(q18.hasUppercaseLetter("the quick brown fox jumps over the lazy dog"));
		System.out.println(q18.hasUppercaseLetter("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));
		
		System.out.println(q18.toUpperCase("the quick brown fox jumps over the lazy dog"));
		
		System.out.println(q18.stringToInt("Jacob"));*/
		
		Q19 q19 = new Q19();
		q19.arrayListPrimes();
		
		Q20 q20 = new Q20();
		q20.loadData();
	}
}
