package javabook_ch01;

public class Test {
	public static double power(int n, double x) {
		double n2 = 1;
		double x2 = 0;
		while(x2 < x) {
			n2 = n2 * n;
			x2++;
		}
		return n2;
	}
	
	public static void main(String[] args) {
		System.out.println(power(3, 2));
		double pi = 3.14159;
		double x = (int) pi * 20.0;
		System.out.println(x);
	}
	
}
