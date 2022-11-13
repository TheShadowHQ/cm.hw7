package hw.day8;

import java.util.ArrayList;

public class SquareInteger {
	public static ArrayList<Integer> squares(int a, int b) {
		ArrayList<Integer> squaresArr = new ArrayList<Integer>();
		for (int i = a; i <= b; i++) {
			double squareRoot = Math.sqrt(i); // 0(1)
			long sqrtInLong = (long)(squareRoot + 0.5);
			if (sqrtInLong * sqrtInLong == i) {
				squaresArr.add(i);
			}
		}
		return squaresArr;
	} // O(n)
	
	public static void main(String[] args) {
		ArrayList<Integer> squaresArr = squares(0, 1000);
		System.out.print("Squares: ");
		for (int square : squaresArr) {
			System.out.print(square + " ");
		}
	}
}
