package javabook_ch01;

public class SingleDigit {
	public static boolean SingleDigit(int x) {
		if(x>-5 && x<10) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		System.out.println(SingleDigit(3));
	}
}
