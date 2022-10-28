package hw.day8;

public class Sort {
	public static int[] sort(int[] numArray) {
		int startIndex = 0;
		int lastIndex = numArray.length - 1;
		int[] sortedArray = new int[numArray.length];

		// insert 0 to the begin indices of array, insert 2 to the end indices of array
		for (int i = 0; i < numArray.length; i++) {
			if (numArray[i] == 0) {
				sortedArray[startIndex] = numArray[i];
				startIndex += 1;
			}

			if (numArray[i] == 2) {
				sortedArray[lastIndex] = numArray[i];
				lastIndex -= 1;
			}
		}

		// insert 1 in the middle indices
		for (int j = startIndex; j <= lastIndex; j++) {
			sortedArray[j] = 1;
		}

		return sortedArray;
	} // O(2n) -> O(n)

	public static void main(String[] args) {
		int[] numArray = {1, 2, 2, 0, 0, 1, 2, 2, 1};
		int[] sorted = sort(numArray);
		for (int num : sorted) {
			System.out.print(num + ", ");
		}
	}
}
