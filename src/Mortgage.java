
import java.util.Scanner;

public class Mortgage {
	public static void main(String[] args) {
		// Declaring constants
		final byte MONTHS = 12;
		final byte PERCENT = 100;

		// Ask the user to input the principal amount
		Scanner scanner = new Scanner(System.in);
		System.out.print("Principal: ");
		int principal = scanner.nextInt();

		// Ask the user to input the interest rate
		System.out.print("Annual Interest Rate: ");
		float annualInterest = scanner.nextFloat();

		// Calculate the monthly interest
		float monthlyInterest = annualInterest / PERCENT / MONTHS;
	}
}
