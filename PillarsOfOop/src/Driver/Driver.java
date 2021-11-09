package Driver;

import Abstraction.MyConcreteClass;
import Inheritance.Child;
import Inheritance.Methods;
import Inheritance.Parent;
import Polymorphism.FoodMethods;

public class Driver {

	public static void main(String[] args) {
		
		Child c = new Child();
		Parent p = new Parent();
		
		// Here the child is upcasted implicitly to its parent
		Methods.Speak(c);
		
		FoodMethods.testCalculateFood();
		
		MyConcreteClass.testSelf();
	}
}
