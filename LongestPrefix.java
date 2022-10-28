package hw.day8;

public class LongestPrefix {
	// Find the minimum string length in the string array
	private static int findMinLength(String[] strs) {
		int min = strs[0].length();
		
		for (int i = 1; i < strs.length; i++) {
			if (strs[i].length() < min) {
				min = strs[i].length();
			}
		}
		return min;
	}
	

	public static String findLongestPrefix(String[] strs) {
		if (strs.length == 0) return "";
		if (strs.length == 1) return strs[0];
		
		int minLength = findMinLength(strs);
		String prefix = "";
		char currentChar;
		
		for (int i = 0; i < minLength; i++) {
			currentChar = strs[0].charAt(i);
			for (int j = 1; j < strs.length; j++) {
				if (strs[j].charAt(i) != currentChar) {
					return prefix;
				}
			}
			prefix += currentChar;
		}
		return prefix; 
	} // O(n^2)

	public static void main(String[] args) {
		String[] strs1 = {"flower", "flow", "flight"};
		String[] strs2 = {"dog", "racecar", "car"};
		System.out.println("Longest Common Prefix: " + findLongestPrefix(strs1));
		System.out.println("Longest Common Prefix: " + findLongestPrefix(strs2));
	}

}
