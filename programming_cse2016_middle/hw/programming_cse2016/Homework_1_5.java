package programming_cse2016;

/*
 * 두 개의 정수 a와 b를 입력받아 a와 b의 합(+), 차(-), 곱(*)을 계산하여 출력하는 프로그램을 작성하라.
 * 
 * 입출력 예시:
 * 첫번째 정수 a를 입력하세요.
 * 10
 * 두번째 정수 b를 입력하세요.
 * 4
 * 
 * 합: 14
 * 차: 6
 * 곱: 40
 * 
 */

import java.util.*;
//scanner 를 위한 import
class Homework_1_5 {
public static void main(String[] args) {
	 int num_a, num_b; // 입력받는 두 정수
	 int num_sum, num_sub, num_mul; // 두 정수의 합, 차, 곱
	
	 // 코드를 작성하세요.
	 System.out.println("첫번째 정수 a를 입력하세요.");
	 Scanner scan = new Scanner (System.in);
	 num_a = scan.nextInt();
	
	 // 코드를 작성하세요.
	 System.out.println("두번째 정수 b를 입력하세요.");
	 num_b = scan.nextInt();
	
	 // 코드를 작성하세요.
	 num_sum = num_a + num_b;
	 System.out.println("합: " + num_sum);
	
	 num_sub = num_a - num_b;
	 System.out.println("차: " + num_sub);
	 
	 num_mul = num_a * num_b;
	 System.out.println("곱: " + num_mul);
	
	}
}