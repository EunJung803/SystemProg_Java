package javabook_ch01;


public class Week11_1_notuse {
	
	public static void main(String[] args) {
		String s = "((3 + 7) * 2)";
		System.out.println(s);
		int checked = check(s);
		System.out.println("=> " + checked);
	}
	
	private static int check(String str) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c == '(') {
				count++;
			}
			else if(c == ')') {
				count--;
			}
		}
		return count;
	}
}
