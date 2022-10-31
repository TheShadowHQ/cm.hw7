package hw.day8;

public class Fibonacci {


//	public static int fibonacci(int num) { //  Standard fibonacci
//		if (num == 0) return 0;
//		if (num == 1) return 1;
//		return fibonacci(num - 2) + fibonacci(num - 1);
//	} // O(2^n)

	
	public static int fibonacci(int num, int[] memo) { // Fibonacci with memoisation
		if (memo[num] != 0) return memo[num];
		if (num == 0) return 0;
		if (num == 1) return 1;
		
		memo[num] = fibonacci(num - 1, memo) + fibonacci(num - 2, memo);
		return memo[num];
	} // O(n)

	public static void main(String[] args) {
		int num = 10;
		int[] fibArr = new int[num + 1];
		
		int fibo = fibonacci(num, fibArr);
		System.out.println("Fibo of " + num + " = " + fibo);
		for (int fib : fibArr) {
			System.out.print(fib + " ");
		}
	}
}
