import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		int index = 5;
		while (index > 0) {
			System.out.println("Hello world: " + index);
			index--;
		}

		String input = "";
		Scanner scanner = new Scanner(System.in);
		while (!input.equals("quit")) {
			System.out.print("Input: ");
			input = scanner.next().toLowerCase();
			System.out.println(input);
		}
	}
}
