package contest;

public class IncomeTax {
	public static void main(String[] args) {
		IncomeTax it = new IncomeTax();
		int[][] brackets = {{2,50}};
		int income = 0;
		System.out.println(it.calculateTax(brackets, income));
	}

	public double calculateTax(int[][] brackets, int income) {
		int moneyLeft = income;
		double totalTax = 0;

		for (int i = 0; i < brackets.length; i++) {
			if (income > brackets[i][0] && i > 0) {
				totalTax += (brackets[i][0] - brackets[i - 1][0]) * ((double) brackets[i][1] / 100);
				moneyLeft = income - brackets[i][0];
			} else if (income > brackets[i][0] && i == 0) {
				totalTax += brackets[i][0] * ((double) brackets[i][1] / 100);
				moneyLeft = income - brackets[i][0];
			} else {
				totalTax += moneyLeft * ((double) brackets[i][1] / 100);
				break;
			}
		}

		return totalTax;
	}
}
