package javabook_ch01;

import java.util.Scanner;

public class Hiroo {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		boolean okay;
		do {
			System.out.print("Enter a number: ");
			if (in.hasNextDouble()) {
				okay = true;
			} else {
				okay = false;
				String word = in.next();
				System.err.println(word + " is not a number");
			}
		}while (!okay);
		double x = in.nextDouble();
	}
}
