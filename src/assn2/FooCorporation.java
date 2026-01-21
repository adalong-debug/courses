package assn2;

public class FooCorporation {

	public static void main(String[] args) {
		 totalPay(7.5 , 35);
		 totalPay(8.2 , 47);
		 totalPay(10.00 , 73);
			}

	public static void totalPay(double base, int hours) {
		if (base >= 8) {
			if (hours <= 40) {
				double totalPay = base * hours;
				System.out.println(totalPay);
			}else if(hours > 40 && hours <= 60) {
				double totalPay = base * 40 + 1.5 * base * (hours - 40);
				System.out.println(totalPay);
			}else if(hours > 60) {
				System.err.println("Error: working hours more than 60!");
			}
		}else if(base < 8) {
			System.err.println("Error: base pay is lower than $8.00/hour!");
		}
	}
	}

