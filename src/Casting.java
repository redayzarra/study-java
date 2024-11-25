public class Casting {
	public static void main(String[] args) {
		// Implicit Casting - Automatic conversion:
		// byte => short => int => long => float => double

		short x = 1; // Short stores two bytes
		int y = x + 2; // Int stores four bytes
		
		System.out.println(y); // Any value in short can be converted 

		double a = 1.1;
		double b = a + 2; // Integers are less precise so becomes double
		System.out.println(b);

		// Explicit casting
		double num = 1.1;
		int res = (int)num + 3; // Manually define "num" to be an int
		System.out.println(res);
	}
}
