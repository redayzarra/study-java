public class Logical {
	public static void main(String[] args) {
		// We can create logical expression with "and" using &&
		int temparature = 22;
		boolean isWarm = temparature > 20 && temparature < 30;
		System.out.println(isWarm);

		// We can create logical expresison with "or" using ||
		boolean highIncome = true;
		boolean hasGoodCredit = true;
		boolean isEligible = highIncome || hasGoodCredit;
		System.out.println(isEligible);
	}
}
