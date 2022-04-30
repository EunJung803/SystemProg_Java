package programming_cse2016;

/*
 * Question 3 (검색, 5점).  다음의 성질을 갖는 숫자 x를 구하고 싶다고 하자. 
 * 
 * x 는 5으로 나누었을때 나머지가 3이다. 
 * x 는 7으로 나누었을때 나머지가 4이다. 
 *
 * 이 성질을 만족하는 35 (= 5*7) 보다 작은 양수 x는 단 한개가 존재한다. 18이 그 답임을 확인할 수 있다. 
 *
 * 이를 일반화한 중국인의 나머지 정리는 다음과 같다. 소수 p1, p2, 
 * 그리고 미지수 x를 각각 p1, p2 로 나누었을때의 나머지 r1, r2 가 주어졌을 때, 
 * p1*p2 보다 작은 그러한  x는 단 한개가 존재한다. 
 *
 * 정수 p1, p2, r1, r2가 주어졌을 때 
 *
 * p1으로 나누었을때 나머지가 r1
 * p2으로 나누었을때 나머지가 r2
 *
 * 가 되는, p1*p2 보다 작은 미지수 x를 구하는 함수 
 * int getCRT(int p1, int p2, int r1, int r2) 
 * 를 작성하라. 
 */

public class Q3_2 {
	public static int getCRT(int p1, int p2, int r1, int r2) {
		int result = -1;
		for (int i = 0; i < p1 * p2; i++) {
			// fill here!
			if(r1 == result%p1 && r2 == result%p2) {
				break;
			}
			else {
				result++;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(getCRT(5, 7, 3, 4)); // 18
	}

}
