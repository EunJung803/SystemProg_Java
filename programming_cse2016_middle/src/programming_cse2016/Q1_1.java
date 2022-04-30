package programming_cse2016;

/*
 * Question 1 (컴파일 오류 수정, 5점). 다음 코드에는 오류들이 있다. 
 * 오류를 수정하여 프로그램이 “a + b = 12”을 출력하도록 하라. 
 */


public class Q1_1 {
	public static void main(String[] args) {
		int a = 4, b, sum;
		a = a + 1;
		b = 7;
		sum = a + b;
		System.out.println("a + b = " + sum);
	}
}
