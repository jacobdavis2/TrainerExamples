package MyPackage;

import OtherPackage.ExternalObject;

public class Driver {
	
	/*
	 * public - Accessible anywhere
	 * private - Accessible only by the owning class
	 * protected - Carried down through inheritance. Accessible to any class in its own package, or any subclass in any package.
	 * default (no modifier) - Public to fellow classes in the same package, private to all others
	 */

	public static void main(String[] args) {
		
		MyObject o = new MyObject();
		
		MyChildObject c = new MyChildObject();
		
		ExternalObject eo = new ExternalObject();
		
	}
}
