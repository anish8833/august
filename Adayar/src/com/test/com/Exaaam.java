package com.test.com;

import java.util.Scanner;

public class Exaaam {
	public static void main(String[] args) {
		int a,n,  j = 0, i = 0;
Scanner sc = new Scanner(System.in);
System.out.println("enter your desired number");
n = sc.nextInt();
		
		a=n;
		while (a > 0) {
			i = a % 10;
			j = (j + (i * i * i));
			a = a / 10;
			

		}
if (n==j) {
	System.out.println("the number is amstrong");
	
} else {
	System.out.println("the given number is not amstrong");

}
	}

}
