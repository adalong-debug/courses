package assn2;

public class FooCorporation {

	public static void main(String[] args) {
		// totalPay(7.5 , 35);
		System.out.println(totalPay(8.2, 47));
		// totalPay(10.00 , 73);
	}

	public static double totalPay(double base, int hours) {
		if (base >= 8) {
			if (hours <= 40) {
				double Pay = base * hours;
				return Pay;
			} else if (hours > 40 && hours <= 60) {
				double Pay = base * 40 + 1.5 * base * (hours - 40);
				return Pay;
			} else if (hours > 60) {
				System.err.println("Error: working hours more than 60!");
				return -1.0;
			}
		} else if (base < 8) {
			System.err.println("Error: base pay is lower than $8.00/hour!");
			return -1.0;
		}
	}
}
