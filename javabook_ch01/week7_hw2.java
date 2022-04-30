package javabook_ch01;

public class week7_hw2 {
	
	public static void beer(int n) {
		if (n == 0) {
			System.out.println("No bottles of beer on the wall");
			System.out.println("no bottles of beer");
			System.out.println("ya¡¯ can¡¯t take one down, ya¡¯ can¡¯t pass it around,");
			System.out.println("¡¯cause there are no more bottles of beer on the wall!");
		}
		else {
			System.out.println(n + " bottles of beer on the wall,");
			System.out.println(n + " bottles of beer,");
			System.out.println("ya' take one down, ya' pass it around");
			System.out.println(n-1 + " bottles of beer on the wall.\n");
			beer(n - 1);
		}
	}
	
	public static void main(String[] args) {
		beer(3);
	}
}
