public class IfStatement {
	public static void main(String[] args) {
		// You can create a if-statement with (condition) {action}
		int temp = 32;
		if (temp > 30) {
			System.out.println("It's a hot day!");
			System.out.println("Drink water");
		} else if (temp > 20 && temp <= 30) {
			System.out.println("Beautiful day!");
		} else {
			System.out.println("It's a cold day!");
		}

		// Learning to write one-liner simplified if-statements
		int income = 120_000;
		boolean hasHighIncome = (income > 100_000);

		// Learning the ternary operator
		String className = (income > 100_000) ? "First" : "Economy";
	}
}
