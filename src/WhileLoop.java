import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		// The variable that the while loop depends on
		int index = 5;
		while (index > 0) {
			System.out.println("Hello world: " + index);
			index--;
		}

		// Define the variable that we are depending on
		String input = "";
		Scanner scanner = new Scanner(System.in);
		while (!input.equals("quit")) {
			// Ask for the input, and return it
			System.out.print("Input: ");
			input = scanner.next().toLowerCase();
			System.out.println(input);
		}

		// Learning a do-while loop
		do { 
			System.out.print("Password: ");
			input = scanner.next().toLowerCase();
			System.out.println(input);
		} while (!input.equals("quit"));
	}
}
