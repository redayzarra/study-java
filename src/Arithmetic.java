public class Arithmetic {
	public static void main(String[] args) {
		// Similar to Python but with greater type safety
		int res = 10 + 3;
		res -= 13;
		res += 5;
		res *= 6;
		res /= 3;
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
		System.out.println(x + ", " + y); // Y doesn't increment with X

		// Now we are incrementing x then copying the value to y
		x = 1;
		y = ++x;
		System.out.println(x + ", " + y); // Y also increments with X
	}
}
