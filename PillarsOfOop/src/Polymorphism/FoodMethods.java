package Polymorphism;

public class FoodMethods {
	
	public static int calculateCalories(Food[] food) {
		
		int total = 0;
		for (Food f : food) {
			total += f.calories;
		}
		
		return total;
	}
	
	public static void testCalculateFood() {
		
		Food f = new Food(100, "Candy");
		Vegetable v = new Vegetable(45, "Onion", false);
		Potato p = new Potato(240, "Idaho Potato", "Idaho");
		
		Food[] food = new Food[3];
		food[0] = f;
		food[1] = v;
		food[2] = p;
		
		System.out.println("Total calories: " + calculateCalories(food));
	}
}
