package com.test.com;

public class Daybegins {
	public static void main(String[] args) {
		int a, i = 0, j = 0;
		int num = 12343991;
		a = num;
		while (a > 0) {
			i = a % 10;
			j = j * 10 + i;
			a = a / 10;

		}
		if (num == j) {
			System.out.println("the number is palindrome");

		} else {
			System.out.println("the number is not palindrome");

		}
	}

}
