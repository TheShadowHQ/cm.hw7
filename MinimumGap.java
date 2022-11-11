package hw.day8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimumGap {
	public static int minimumGap(List<Integer> a) {  // O(n^2)
		int minGap = a.size();
		int gap = 0;
		
		for (int i = 0; i < a.size() - 1; i++) {
			for (int j = i + 1; j < a.size(); j++) {
				if (a.get(i) == a.get(j)) {
					gap = j - i;
					minGap = Math.min(minGap, gap);
				}
			}
		}
		return Math.min(minGap, gap);
	}

//	public static int minimumGap(List<Integer> list) { // O(n)
//		int maxValue = Collections.max(list); 
//		int[] gapArr = new int[maxValue + 1];
//		int curMin = 0;
//		int newMin = 0;
//		for (int i = 0; i < list.size(); i++) { 
//			if (gapArr[list.get(i)] != 0) {
//				newMin = i - gapArr[list.get(i)];
//				curMin = (newMin < curMin || curMin == 0) ? newMin : curMin;
//			}
//			gapArr[list.get(i)] = i;
//		}
//		return curMin;
//	}

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(7, 1, 1, 5, 6, 3);
		System.out.println("Minimum gap is " + minimumGap(a));
	}
}
