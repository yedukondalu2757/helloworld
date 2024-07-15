package com.corejava;

public class SumUntilSigleDigits {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int sumUntilSigleDigits = SumUntilSigleDigits.sumUntilSigleDigits(123);
		//System.out.println(System.currentTimeMillis()-start);
		System.out.println(sumUntilSigleDigits);
	}

	static int sumUntilSigleDigits(int n) {
		int sum = 0;
		while (n > 0 || sum > 9) {
			if (n == 0) {
				n = sum;
				sum = 0;
			}
			sum = sum + n % 10;
			n = n / 10;
		}
		return sum;
	}
}
