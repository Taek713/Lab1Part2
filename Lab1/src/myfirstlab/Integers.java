// Lab 1 By Tae Kim
package myfirstlab;

import java.util.Scanner;

public class Integers {
	private static Integers lnd_Sum_dig;

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userNum;
		int userNumTwo;
		System.out.println("Please enter any positive integer: ");
		userNum = scnr.nextInt();
		System.out.println("another prompt");
		userNumTwo = scnr.nextInt();

		int length = lenDig(userNum);
		System.out.println(length);
// ToDo: get the length of the other userNum and then compare it to the first

		boolean isTrue = isSumDigSame(userNum, userNumTwo);
		System.out.println(isTrue);
	
	}
	// Step 1: Find the length of the number and return it
	public static int lenDig(int n) {

		int len = 0;
		int digit;

		while (n != 0) {
			digit = n % 10;
			n = n / 10;
			len++;
		}
		return len;
	}
	
// Step 2: Use the function to check the digits of same place are same 

	public static boolean isSumDigSame(int x, int y) {

		int t1 = x;
		int t2 = y;
		int l1 = lnd_Sum_dig.lenDig(t1);
		int l2 = lnd_Sum_dig.lenDig(t2);
		int i = 0;
		int d1 = 0, d2 = 0;

		int sum = 0;

		if (l1 == l2) {

			while (l1 != 0) {
				d1 = t1 % 10;
				d2 = t2 % 10;
				
			}
			if (sum != (d1 + d2) && i != 0) {
				System.out.println("Sum is not same");
			}
			t1 = t1 / 10;
			t2 = t2 / 10;
			l1--;
			i++;
		
		}
		
		if (l1 == 0) {
			boolean flag = true;
		} else {
			System.out.println("Digits are not same");
		}
		return false;
	}
	
}