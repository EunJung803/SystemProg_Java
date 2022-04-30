package programming_cse2016;

public class Q4 {
	public static String removeDuplicateLetters(String s) {
		String output = "";
		
		boolean notsame;
		for(int i = s.length()-1; i >= 0; i--) {
			notsame = true;
			
			for(int j = i-1; j >= 0; j--) {
				if(s.charAt(i) == s.charAt(j)) {
					notsame = false;
					break;
				}
			}
			if(notsame) {
				output = s.charAt(i) + output;
			}
		}
		
		return output;
	}

	public static void main(String[] args) {
		System.out.println(removeDuplicateLetters("butterflies")); // buterflis
		System.out.println(removeDuplicateLetters("aaabbbcc")); // abc
		System.out.println(removeDuplicateLetters("I will be back.")); // I wilbeack.
	}
}
