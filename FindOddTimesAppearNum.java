package hw.day8;

import java.util.ArrayList;
import java.util.HashMap;

public class FindOddTimesAppearNum {
	private static HashMap<Integer, Integer> generateMap(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int num : arr) {
			if (!map.containsKey(num)) {
				map.put(num, 1);
			} else {
				map.put(num, map.get(num) + 1);
			}
		}
		return map;
	}

	public static ArrayList<Integer> findOddTimesAppearNum(int[] arr) {
		HashMap<Integer, Integer> map = generateMap(arr);
		ArrayList<Integer> result = new ArrayList<Integer>();

		map.forEach((num, appearance) -> {
			if (appearance % 2 != 0) {
				result.add(num);
			}
		});
		return result;
	} // O(n)

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 100, 400, 15, 15, 15, 15, 15, 15, 15, 15 };
		ArrayList<Integer> oddTimeAppearArr = findOddTimesAppearNum(arr);
		for (Integer num : oddTimeAppearArr) {
			System.out.print(num + " ");
		}
	}
}
