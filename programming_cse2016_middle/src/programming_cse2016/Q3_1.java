package programming_cse2016;

/*
 * Question 3 (검색, 5점).  문자열 s 와 부분문자열 sub 를 받아서 문자열 s에서 sub가 등장하는 횟수를 반환하는 함수 
 * 
 * int getOccurrence (String s, String sub) 
 * 를 작성하라. 예를 들어, getOccurrence(“abcd ab”, “ab”) 는 2를 반환해야 한다.
 * 
 * 참고로 부분문자열이 등장하는 구간들은 서로 겹칠 수 있다. 
 * 예를 들어, getOccurrence(“bbbb”, “bb”) 는 3을 반환해야 한다 
 * (s의 첫번째, 두번째, 세번째 인덱스에서 bb가 등장하기 때문)
 */

public class Q3_1 {
	public static int getOccurrence (String s, String sub) {
		int count = 0; 
		for (int i = 0; i <= s.length() - sub.length(); i++) {
		// fill here!
		// 다음을 사용: s.substring(i1,i2): 구간 i1 ~  i2-1에 해당하는 s의 부분문자열 반환
			if( sub.equals(s.substring(i, i+(sub.length()))) ) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(getOccurrence("abcd ab", "ab")); // 2
		System.out.println(getOccurrence("bbbb", "bb")); // 3
	}
}

