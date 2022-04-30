package programming_cse2016;

/*
 * Question 3 (�˻�, 5��).  ���ڿ� s �� �κй��ڿ� sub �� �޾Ƽ� ���ڿ� s���� sub�� �����ϴ� Ƚ���� ��ȯ�ϴ� �Լ� 
 * 
 * int getOccurrence (String s, String sub) 
 * �� �ۼ��϶�. ���� ���, getOccurrence(��abcd ab��, ��ab��) �� 2�� ��ȯ�ؾ� �Ѵ�.
 * 
 * ����� �κй��ڿ��� �����ϴ� �������� ���� ��ĥ �� �ִ�. 
 * ���� ���, getOccurrence(��bbbb��, ��bb��) �� 3�� ��ȯ�ؾ� �Ѵ� 
 * (s�� ù��°, �ι�°, ����° �ε������� bb�� �����ϱ� ����)
 */

public class Q3_1 {
	public static int getOccurrence (String s, String sub) {
		int count = 0; 
		for (int i = 0; i <= s.length() - sub.length(); i++) {
		// fill here!
		// ������ ���: s.substring(i1,i2): ���� i1 ~  i2-1�� �ش��ϴ� s�� �κй��ڿ� ��ȯ
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

