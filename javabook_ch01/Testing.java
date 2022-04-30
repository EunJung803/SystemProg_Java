package javabook_ch01;

import java.math.BigInteger;

public class Testing {
	public static void main(String[] args) {
		BigInteger small = BigInteger.valueOf(17);
		BigInteger big = BigInteger.valueOf(1700000000);
		
		BigInteger total1 = small.add(big);
		BigInteger total2 = small.subtract(big);
		BigInteger total3 = small.multiply(big);
		BigInteger total4 = small.divide(big);
		
		System.out.println(total1);
		System.out.println(total2);
		System.out.println(total3);
		System.out.println(total4);
	}
}
