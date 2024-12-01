
import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		try (// Using the Scanner class to read data
		Scanner scanner = new Scanner(System.in)) {
			System.out.print("Age: ");
			float age = scanner.nextFloat();
			System.out.println("You are " + age);

			System.out.print("Enter your name: ");
			String name = scanner.nextLine().trim();
			System.out.println(name);
		}
	}
}
