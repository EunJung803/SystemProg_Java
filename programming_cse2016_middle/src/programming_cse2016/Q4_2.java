package programming_cse2016;

/*
 * Question 4 (���, 5��). ��� n�� k�� �޾�, n�� k������ ǥ���� ���ڿ��� ��ȯ�ϴ� �Լ� 
 * 
 * String toKary(int n, int k)
 * 
 * �� �ۼ��϶�. ����� n�� k���� ���·� ǥ���ϴ� ����� ������ ����. 
 * n�� k���� ������ n�� ���ڿ��� ǥ��
 * n�� k���� ũ�� n / k �� k������ ǥ���� ��� �ڿ� n�� k�� ���� �������� �ٿ� ǥ��
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
