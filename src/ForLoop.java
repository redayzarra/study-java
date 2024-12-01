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
	}
}
