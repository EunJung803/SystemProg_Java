package javabook_ch01;

//Using recursion, write inverse function which displays a positive integer to the reverse order

import java.util.Scanner;

public class Recursive {
	
	public static void reverse(int n) {
		int result = 0;

		if(n == 0) {
			return ;
		}
		else {
			System.out.print(n % 10);
			reverse(n / 10);
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Type a positive integer : ");
		int integer = in.nextInt();
		System.out.print("Reverse of this integer is ");
		reverse(integer);
	}
}