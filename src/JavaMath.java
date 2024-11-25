public class JavaMath {
	public static void main(String[] args) {
		// Rounds the number to the nearest whole number
		int res = Math.round(1.49F);
		System.out.println(res);

		// Rounds the number up to the whole number
		int num = (int)Math.ceil(1.01F);
		System.out.println(num);

		// Rounds the number down to the whole number
		int number = (int)Math.floor(1.98F);
		System.out.println(number);

		// We can also calculate the min and max of different numbers
		System.out.println(Math.max(10, 3));
		System.out.println(Math.min(10, 3));

		// We can also generate a random value between 0 and 100
		int result = (int)Math.round(Math.random() * 100);
		System.out.println(result);
		// Or like this
		int x = (int)(Math.random() * 100);
		System.out.println(x);
	}
}
