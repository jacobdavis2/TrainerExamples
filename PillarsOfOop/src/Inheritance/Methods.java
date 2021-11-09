package Inheritance;

public class Methods {
	
	public static void Speak() {
		Child c = new Child();
		c.PrintSelf();
	}

	public static void Speak(Parent p) {
		p.PrintSelf();
	}
}
