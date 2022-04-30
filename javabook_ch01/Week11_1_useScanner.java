package javabook_ch01;

import java.util.Scanner;

public class Week11_1_useScanner {

	public static void main(String[] args) {
		Week11_1 using = new Week11_1();

		Scanner string = new Scanner(System.in);
		System.out.println("input the string : ");
		String input = string.nextLine();
		
		using.setStr(input);
		using.setCount(0);
		
		using.counting();
		
		System.out.println("=> " + using.getCount());
	} 
}