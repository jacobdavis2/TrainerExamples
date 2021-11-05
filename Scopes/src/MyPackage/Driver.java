package MyPackage;

public class Driver {
	
	/*
	 * Class Scope (static, available anywhere by simply addressing the class; instances of the class are not required)
	 * Object/Instance Scope (belong only to a particular object)
	 * Method Scope (belong only to a particular method while its running)
	 * Block Scope (anything between two curly braces is within that block's scope)
	 * 
	 * Loop Scope (like anytime I use i in a for loop)
	 * Static Method Scope
	 */

	public static void main(String[] args) {
		// moreData belongs to CLASS scope, and does not require an instance
		System.out.println(MyObject.moreData);
		
		// Because myData is instance scope, we need an instance to use it. The following line produces an error
		//System.out.println(MyObject.myData);
		
		// Instances are made with the new keyword
		MyObject obj = new MyObject();
		// This particular object now carries data that can be referenced by the name myData
		System.out.println(obj.myData);
		obj.myData = 16;
		
		// This object's myData would still be 1 because it is instance scope, so each instance has its own copy
		MyObject otherObj = new MyObject();
	}
}
