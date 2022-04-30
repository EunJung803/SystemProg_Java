package javabook_ch01;

import java.math.BigInteger;

public class Biginteger {
	
	public static void main(String[] args) {
		int i = 0;
		factorial(i);
	}
	
	public static void factorial(int n) {
		int fac = 1;
		BigInteger fact = BigInteger.valueOf(fac);
		
		for(n = 0; n <= 30; n++) {
			BigInteger big = BigInteger.valueOf(n);
			fact = fact.multiply(big);
			if (big  == BigInteger.ZERO) {
				fact = BigInteger.ONE;
			}
			System.out.println(fact);
		}
	}
}
