package programming_cse2016;

/*
 * Question 1 (������ ���� ����, 5��). ���� �ڵ忡�� �������� �ִ�. ������ �����Ͽ� ���α׷��� ���������� ����ǵ��� ���Ķ�.
 * 
 * ���� �� kim�� 10�� ���ʷ� �Է��� ��� ������ ���:
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

