package programming_cse2016;

/*
 * Question 4 (���, 5��). �Ǻ���ġ ���� �䳢 ��ü ���� ������ �𵨸��� ���̾���. �䳢�� ���� ������ ������ ���Ҵ�.
 * 1 ù�޿��� ���� �¾ �䳢 �ѽָ� ����
 * 2 �� �� �̻�� �䳢�� ���� ����
 * 3 ���� ������ �䳢 �ѽ��� �Ŵ� ���� �ѽ��� ����
 * 4 �䳢�� ���� ����. 
 * 
 * ���⼭ ���� 2�� �ٲپ� 
 * �� �� �̻�� �䳢�� ���� ���� 
 * ��� ���� ��, n��° �޿� �����ϴ� �䳢 ���� ���� ��ȯ�ϴ� 
 * 
 * int newfibonacci(int n) 
 * 
 * �� �ۼ��϶�. ����� ���� �Ǻ���ġ ������ 10��° ���� 55�� �ݸ�, ���ο� �Ǻ���ġ ���������� 19�̴�.
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
