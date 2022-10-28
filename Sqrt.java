package hw.day8;

public class Sqrt {
	
	private static double round(double num) {
		return Math.round(num * 100.0) / 100.0;
	}

	public static double sqrt(double num) {
		double left = 0;
		double right = num;
		double root = 0.0;

		while (left <= right) {
			double middle = (left + right) / 2.0;
			double square = middle * middle;
			if (square == num) {
				root = middle;
				break;
			} else if (square < num) {
				left = middle + 0.1;
				root = middle;
			} else {
				right = middle - 0.1;
			}
		}
		return round(root);
	} // O(n)

	public static void main(String[] args) {
		int[] testCases = { 4, 9, 15, 30, 131 };
		for (int squared : testCases) {
			System.out.printf("Square root of %d is %.2f\n", squared, sqrt(squared));
		}
	}

}
