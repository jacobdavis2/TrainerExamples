package MyPackage;

public class MyObject {

	// A variable that belongs to instances of the class
	public int myData = 1;
	
	// A variable that belongs to the class MyObject
	public static int moreData = 5;
	
	// The myData in this method belongs to METHOD scope, and SHADOWS the instance-level myData
	// Shadowing is when a variable of some name in a more specific scope is used instead of a variable by the same name but of a higher-level scope
	// That is, because it is the more specific scope, the below value of myData will be used by default
	// rather than the instance-level myData
	public void myMethod() {
		int myData = 2;
		
		// In order to reach the instance-level myData we need to use 'this'
		// this.myData;
		
		// In block scope, which is defined as anything between { }, variables live only as long as the block does
		{
			int myOtherData = 17;
			
			System.out.println(myOtherData);
		}
		// Which means we can reuse variable names in other blocks
		{
			int myOtherData = 17;
			
			System.out.println(myOtherData);
		}
		
		// Final scope is loop scope, referring to variables declared as part of a loop
		for (int i = 0; i < 10; ++i) {
			// i only exists as long as this loop is running, and is then discarded
			System.out.println(i);
		}
		
		// The following call to i would produce an error
		// System.out.println(i);
	}
}
