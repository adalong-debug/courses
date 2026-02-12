package assn2;

public class FooCorporation {

	public static void main(String[] args) {
		// totalPay(7.5 , 35);
		System.out.println(totalPay(8.2, 47));
		// totalPay(10.00 , 73);
	}

	public static double totalPay(double base, int hours) {
	    // 1. Error Case: Base pay too low
	    if (base < 8.0) {
	        System.err.println("Error: base pay is lower than $8.00/hour!");
	        return -1.0;
	    } 
	    
	    // 2. Error Case: Too many hours
	    if (hours > 60) {
	        System.err.println("Error: working hours more than 60!");
	        return -1.0;
	    }

	    // 3. Calculation Case: If we got here, base is >= 8 and hours <= 60
	    if (hours <= 40) {
	        return base * hours;
	    } else {
	        // This 'else' covers everything from 41 to 60 hours
	        return (base * 40) + (1.5 * base * (hours - 40));
	    }
	    // Now there is no "gap" where a return is missing!
	
	}
}
