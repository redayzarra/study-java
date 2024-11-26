import java.text.NumberFormat;

public class Numbers {
	public static void main(String[] args) {
		// Call the NumberFormat factory to format a number as currency
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String res = currency.format(123445.439);
		System.out.println(res);

		// Formatting numbers as percent
		NumberFormat percent = NumberFormat.getPercentInstance();
		String result = percent.format(0.376);
		System.out.println(result);
	}
}
