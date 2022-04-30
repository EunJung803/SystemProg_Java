package javabook_ch01;

public class Big {

	public static void main(String[] args) {
		int i = 0;
		factorial(i);	
	}
	
	public static void factorial(int n) {
		int fac = 1;
		for(n = 0; n <= 30; n++) {
			fac = fac * n;
			if(n == 0) {
				fac = 1;
			}
			System.out.println(fac);
		}
	}
}
