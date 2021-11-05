package MyPackage;

public class MyObject {

	// Public allows data or methods to be accessed from anywhere and from any package so long as the class is imported
	// MOST permissible
	public int myData = 1;
	
	// Private is on the other end of the spectrum: only the class in which the variable or method is defined may use that variable or method
	private int privateData = 5;
	
	// Protected data and methods are specifically marked as being passed down to children and can be accessed similarly to public members
	protected int protectedData = 6;
	
	// No access modifier means 'default' access: free to any class that is in the package, but class in other packages cannot access those data or methods
	int defaultData = 2;
}
