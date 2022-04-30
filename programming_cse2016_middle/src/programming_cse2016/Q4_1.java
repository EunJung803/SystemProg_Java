package programming_cse2016;

/*
 * Question 4 (재귀, 5점). 피보나치 수는 토끼 개체 수의 증가를 모델링한 것이었다. 토끼에 대한 조건은 다음과 같았다.
 * 1 첫달에는 새로 태어난 토끼 한쌍만 존재
 * 2 두 달 이상된 토끼는 번식 가능
 * 3 번식 가능한 토끼 한쌍은 매달 새끼 한쌍을 낳음
 * 4 토끼는 죽지 않음. 
 * 
 * 여기서 조건 2를 바꾸어 
 * 세 달 이상된 토끼는 번식 가능 
 * 라고 했을 때, n번째 달에 존재하는 토끼 쌍의 수를 반환하는 
 * 
 * int newfibonacci(int n) 
 * 
 * 을 작성하라. 참고로 기존 피보나치 수열은 10번째 수가 55인 반면, 새로운 피보나치 수열에서는 19이다.
 */

public class Q4_1 {

	public static int newfibonacci(int n) {
		if(n == 1) return 1;
		else if(n == 2) return 1;
		else if(n == 3) return 1;
		else {
			return newfibonacci(n-3) + newfibonacci(n-1);
		}
	}
	public static void main(String[] args) {
		System.out.println(newfibonacci(10)); // 19
	}
}
