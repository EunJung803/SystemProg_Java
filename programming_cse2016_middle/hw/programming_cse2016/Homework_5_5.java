package programming_cse2016;

/*
 * 사용자로 부터 0보다 큰 정수 n을 입력 받아 
 * 다음과 같은 조건을 만족하는 1과 n사이에 있는 
 * 정수들의 쌍(i,j)을 출력하는 프로그램을 작성하라.
 * 
 * 1) i는 j로 나누어 떨어져야 한다.
 * 2) i != j
 * 3) (n,m) 일 때, n > m 이어야 한다.
 * 
 * 출력 예시
 * 6 입력 -> (2,1) (3,1) (4,1) (4,2) (5,1) (6,1) (6,2) (6,3)
 */

import java.util.Scanner;


class Homework_5_5 {
  public static void main(String[] args) {
		int n;

		System.out.print("Please enter an integer:");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j < i; j++) {
				if(i % j == 0) {
					System.out.println("(" + i + "," + j + ")");
				}
			}
		}
		
  }
}