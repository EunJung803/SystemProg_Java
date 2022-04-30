package programming_cse2016;

/*
 * Question 1 (컴파일 오류 수정, 5점). 다음 코드에는 오류들이 있다. 오류를 수정하여 프로그램이 정상적으로 실행되도록 고쳐라.
 * 
 * 실행 후 kim과 10을 차례로 입력할 경우 다음이 출력:
 * 
 * Your name: kim
 * Your favorite number: 10
 * kim, the square of your favorite number = 100
 */

import java.util.Scanner; 
public class Q1_2 {
	public static void main(String[] args) {
		String name;
		int number;
		int numsq;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Your name: ");
		name = scan.next(); 
		System.out.print("Your favorite number: ");
		number = scan.nextInt();
		numsq = number * number; 
		System.out.println(name + ", the square of your favorite number = " + numsq);
	}
}

