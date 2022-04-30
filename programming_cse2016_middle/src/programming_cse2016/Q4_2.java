package programming_cse2016;

/*
 * Question 4 (재귀, 5점). 양수 n과 k를 받아, n을 k진수로 표현한 문자열을 반환하는 함수 
 * 
 * String toKary(int n, int k)
 * 
 * 를 작성하라. 참고로 n을 k진수 형태로 표현하는 방법은 다음과 같다. 
 * n이 k보다 작으면 n을 문자열로 표현
 * n이 k보다 크면 n / k 를 k진수로 표현한 결과 뒤에 n을 k로 나눈 나머지를 붙여 표현
 *
 */

public class Q4_2 {
	public static String toKary(int n, int k) {
		if (n < k) return "" + n; 
		
		else {

			return "" + toKary(n/k, k) + n%k;
		}
	}
	public static void main(String[] args) {
		System.out.println(toKary(15, 2)); // 1111
		System.out.println(toKary(15, 3)); // 120
	}

}
