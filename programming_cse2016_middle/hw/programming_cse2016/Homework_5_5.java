package programming_cse2016;

/*
 * ����ڷ� ���� 0���� ū ���� n�� �Է� �޾� 
 * ������ ���� ������ �����ϴ� 1�� n���̿� �ִ� 
 * �������� ��(i,j)�� ����ϴ� ���α׷��� �ۼ��϶�.
 * 
 * 1) i�� j�� ������ �������� �Ѵ�.
 * 2) i != j
 * 3) (n,m) �� ��, n > m �̾�� �Ѵ�.
 * 
 * ��� ����
 * 6 �Է� -> (2,1) (3,1) (4,1) (4,2) (5,1) (6,1) (6,2) (6,3)
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