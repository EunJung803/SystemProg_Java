package programming_cse2016;

/*
 * Question 3 (�˻�, 5��).  ������ ������ ���� ���� x�� ���ϰ� �ʹٰ� ����. 
 * 
 * x �� 5���� ���������� �������� 3�̴�. 
 * x �� 7���� ���������� �������� 4�̴�. 
 *
 * �� ������ �����ϴ� 35 (= 5*7) ���� ���� ��� x�� �� �Ѱ��� �����Ѵ�. 18�� �� ������ Ȯ���� �� �ִ�. 
 *
 * �̸� �Ϲ�ȭ�� �߱����� ������ ������ ������ ����. �Ҽ� p1, p2, 
 * �׸��� ������ x�� ���� p1, p2 �� ������������ ������ r1, r2 �� �־����� ��, 
 * p1*p2 ���� ���� �׷���  x�� �� �Ѱ��� �����Ѵ�. 
 *
 * ���� p1, p2, r1, r2�� �־����� �� 
 *
 * p1���� ���������� �������� r1
 * p2���� ���������� �������� r2
 *
 * �� �Ǵ�, p1*p2 ���� ���� ������ x�� ���ϴ� �Լ� 
 * int getCRT(int p1, int p2, int r1, int r2) 
 * �� �ۼ��϶�. 
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
