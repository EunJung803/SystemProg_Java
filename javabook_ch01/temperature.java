package javabook_ch01;

import java.util.Scanner;

public class temperature {
	
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("Enter the Celsius : ");
	double num = in.nextDouble();
	double f = num * 9/5 + 32;
	System.out.println();
	System.out.printf("%.1f C = %.1f F", num, f);
}
}
