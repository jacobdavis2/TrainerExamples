package MyPackage;

public class Driver {
	
	public static void main(String[] args) {
		System.out.print("Hello world");
		
		// Object INSTANTIATION:
		MyThing mt = new MyThing();
		
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
}
