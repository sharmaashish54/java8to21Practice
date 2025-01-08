package com.test.java;

public class Recurssion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sumOfIntegers(4));

		System.out.print(sumOfIntegersRecurrsion(5));
	}

	public static int sumOfIntegers(int n) {

		if (n == 0 || n == 1) {
			return n;
		}
		int sum = 0;
		while (n > 0) {
			sum += n;
			n--;
		}

		return sum;

	}
	
	public static int sumOfIntegersRecurrsion(int n) {
		if (n <= 0) {
            return 0;
        }
		return n + sumOfIntegersRecurrsion(n - 1);
	}
	

}
