package hw.day8;

public class TheFeast {
	public static int theFeast (int n, int c, int m) {
		int bars = n / c;
		int wrappers = bars;
		
		while (wrappers >= m) {
			int wrappersForExchange = wrappers / m;
			int spareWrappers = wrappers % m;
			bars += wrappersForExchange;
			wrappers = wrappersForExchange + spareWrappers;
		}
		return bars;
	}

	public static void main(String[] args) {
		int bars = theFeast(15, 3, 2);
		System.out.println("Total bars: " + bars);
	}
}