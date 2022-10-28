package hw.day8;

public class RomanToInt {
	private static int romanValue(char r) {
		switch (r) {
		case ('I'):
			return 1;
		case ('V'):
			return 5;
		case ('X'):
			return 10;
		case ('L'):
			return 50;
		case ('C'):
			return 100;
		case ('D'):
			return 500;
		case ('M'):
			return 1000;
		default:
			return -1;
		}
	}

	public static int romanToInt(String r) {
		int total = 0;
		for (int i = 0; i < r.length(); i++) {
			int roman1 = romanValue(r.charAt(i));
			if (i + 1 < r.length()) {
				int roman2 = romanValue(r.charAt(i + 1));
				total = (roman1 >= roman2) ? (total + roman1) : (total - roman1);
			} else {
				total += roman1;
			}
		}
		return total;
	} // O(n)

	public static void main(String[] args) {
		String[] testCases = { "III", "IV", "IX", "LVIII", "MCMXCIV" };
		for (String roman : testCases) {
			System.out.println("Convert " + roman + " to " + romanToInt(roman));
		}
	}
}
