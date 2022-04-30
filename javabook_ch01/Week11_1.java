package javabook_ch01;

public class Week11_1 {
	
	private String str;
	private int count;
	
	public void setStr(String str) {
		this.str = str;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getCount() {
		return this.count;
	}
	
	public void counting() {
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == '(') {
				count++;
			} else if (c == ')') {
				count--;
			}
		}
	}
}

