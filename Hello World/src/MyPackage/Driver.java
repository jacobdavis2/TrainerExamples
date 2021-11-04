package MyPackage;

public class Driver {
	
	public static void main(String[] args) {
		System.out.println("Hello world");
		
		// Object INSTANTIATION:
		MyThing mt = new MyThing(1, 0.5f);
		
		System.out.println("Say hi to my object, it has a value of " + mt.mySmallNumber);
		
		mt.PrintMyValues();
		
		double myDouble = 1; // 0001
		// Can cast from one data type to another, although this could potenially lose some data
		float myFloat = (float) myDouble; // 01
		
		myMethod(myFloat);
		
		// Can also cast a reference to an object to any of its parents
		Object o = (Object) mt; // Object is the parent of classes
	}
	
	public static void myMethod(float myParameter) {
		System.out.println("My parameter is " + myParameter);
	}
	
	// Methods can have the same name and return type so long as the parameters are of different types or number
	// This is called "overloading"
	public static void myMethod(float anotherParameter, int x) {
		
	}
}
