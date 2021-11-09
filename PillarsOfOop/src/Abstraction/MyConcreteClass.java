package Abstraction;

// Any class that is not abstract (ie can be instantiated) is a concrete class
/* Major abstraction keywords:
 *  abstract - Put before the 'class' keyword to indicate an abstract class
 *  extends - Use to create a child class
 *  implements - Use to flag a class as implementing some interface
 */
public class MyConcreteClass extends MyAsbtractClass implements MyInterface {

	@Override
	public void InterfaceMethod(int a) {
		System.out.println("From MyConcreteClass: " + a);
	}

	public static void testSelf() {
		MyConcreteClass mcc = new MyConcreteClass();
		
		mcc.InterfaceMethod(5);
		mcc.MyAbstractClassMethod(17);
	}
}
