package javabook_ch01;

public class Week11_2 {
	
	public static void isDoubloon(String str) {
		String string = str.toLowerCase();
		
		int count = 0;
		for(int i = 0; i <= string.length(); i++) {
			for(int j = i+1; j < string.length(); j++) {
				if(string.charAt(i) == string.charAt(j)) {
					count++;
				}
			}
		}
		if (count > 0) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
	
	public static void main(String[] args) {
		//doubloon O
		isDoubloon("Abba");
		isDoubloon("murmur");
		isDoubloon("Shanghaiings");
		//doubloon X
		isDoubloon("love");
		isDoubloon("you");
	}
}
