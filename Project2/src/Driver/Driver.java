package Driver;

import java.util.Arrays;

import Questions.Q1;
import Questions.Q3;
import Questions.Q5;

public class Driver {

	// Ellipsis is called var-args, and allows zero, one, or many of the same type of argument
	public static void main(String... args)
	{
		// Array initialization syntax (filled array)
		int[] myArray = { 19, 20, 1, 16, 7, 9 };
		
		// Array declaration syntax (empty array)
		int[] myOtherArray = new int[10];
		myOtherArray[0] = 19;
		myOtherArray[1] = 20;
		// myOtherArray[2] = ...
		
		int[] sortedArray = Q1.BubbleSort(myArray);
		System.out.println(Arrays.toString(sortedArray));
		
		Q1.BubbleSort(array)
		
		Q3.TestReverse();
		
		Q5.TestSubstring(4);
	}
}
