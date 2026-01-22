package assn3;

public class Marathon {

	public static void main(String[] args) {
		String[] names = {
			"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
			"Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
			"Aaron", "Kate"
			};
		int[] times = {
		341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
		343, 317, 265
		};
		int num = best(times);
		int num2 = second(times);
		System.out.println("first one: " + names[num] + ": " + times[num]);
		System.out.println("second one: " + names[num2] + ": " + times[num2]);		
	}
	
	public static int best(int[] times) {
		int bestTime = times[0];
		int num = 0;
		for (int i = 0; i < times.length; i++) {
			if (times[i] < bestTime) {
				bestTime = times[i];
				num = i;
			}
		}
		return num;
	}

	public static int second(int[] times) {
		int bestTime2 = times[0];
		int num2 = 0;
		for (int i = 0; i < times.length; i++) {
			if (times[i] < bestTime2 && times[i] > times[best(times)] ) {
				bestTime2 = times[i];
				num2 = i;
			}
		}
		return num2;
	}
	
}
