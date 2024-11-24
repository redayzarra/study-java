public class Arithmetic {
	public static void main(String[] args) {
		// Similar to Python but with greater type safety
		int res = 10 + 3;
		res -= 13;
		System.out.println(res);

		// Since num is an integer => it will not have decimals
		int num = 10 / 3;
		System.out.println(num);

		// To get decimals we will convert all nums to double
		double real = (double)10 / (double)3;
		System.out.println(real);

		// We are copying the value of x to y then incrementing x
		int x = 1;
		int y = x++;
		System.out.println(y + ", " + x); // Y doesn't increment with X

		
	}
}
