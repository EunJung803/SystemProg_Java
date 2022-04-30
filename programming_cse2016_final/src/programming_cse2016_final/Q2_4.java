package programming_cse2016_final;

class TranslateTable {
	private int[] encode; // 코드 -> 암호화된 코드 (encode[0]: 0의 암호화된 코드값)
	private int[] decode; // 암호화된 코드 -> 코드
	public TranslateTable(int seed) {
		encode = new int[10];
		decode = new int[10];
		// fill here!
		
		encode[0] = seed;
		decode[seed] = 0;
		for(int i=1; i<10; i++) {
			int new_code = (encode[i-1]+3)%10;
			encode[i] = new_code;
			decode[new_code] = i;
		}
	}
	
	private int c2i(char c) {
		// fill here!
		// a -> 1, b -> 2, c -> 3, ...
		/*
		if(c == ' ') return 0;
		return c-'a'+1;
		*/
		return c - '0';
	}
	
	private char i2c(int i) {
		// fill here!
		// 1 -> a, 2 -> b, 3 -> c, ...
		/*
		if(i == 0) return 0;
		return (char)(i+'a'-1);
		*/
		return (char)(i+'0');
	}
	
	private char encode(char c) { return i2c(encode[c2i(c)]); }
	private char decode(char c) { return i2c(decode[c2i(c)]); }
	
	public String encode(String s) {
		// fill here!
		String result = "";
		for(int i=0; i<s.length(); i++) {
			result = result + encode(s.charAt(i));
		}
		return result;
	}
	public String decode(String s) {
		// fill here!
		String result = "";
		for(int i=0; i<s.length(); i++) {
			result = result + decode(s.charAt(i));
		}
		return result;
	}
}

public class Q2_4 {
	public static void main(String[] args) {
		TranslateTable m = new TranslateTable(1);
		String original = "0123456789";
		String encoded = m.encode(original);
		String decoded = m.decode(encoded);
		System.out.println("original: " + original); // original: 0123456789
		System.out.println("encoded: " + encoded); // encoded: 1470369258
		System.out.println("decoded: " + decoded); // decoded: 0123456789
	}
}
