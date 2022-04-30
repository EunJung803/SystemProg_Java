package javabook_ch01;

public class Jegopgeun {
	
	public static double squareRoot(double a){
		double expect = a/2; 
		double x_1 = (expect + (a/expect)) / 2; 
		
		while(Math.abs(expect - x_1) > 0.0001) { 
			double x_2 = (x_1 + (a/x_1)) / 2; 
			expect = x_1;
			x_1 = x_2;
		}
		return x_1;
	}

	public static void main(String[] args) {
		System.out.println(squareRoot(16));
		System.out.println(squareRoot(64));
		System.out.println(squareRoot(9));
	}
}