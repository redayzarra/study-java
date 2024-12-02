public class ForLoop {
	public static void main(String[] args) {
		// We initialize index, the condition, and increment
		for (int index = 0; index < 5; index++) {
			System.out.println("Hello world");
		}

		// Going in reverse
		for (int index = 5; index > 0; index--) {
			System.out.println("Bye world: " + index);
		}

		// Using a manual for-loop to iterate over items in an array
		String[] fruits = {"Apple", "Mango", "Orange"};
		for (int index = 0; index < fruits.length; index++) {
			System.out.println(fruits[index]);
		}

		// Using a for-each loop to iterate over items
		for (String fruit: fruits) {
			// We cannot iterate in reverse
			System.out.println(fruit);
		}
	}
}
