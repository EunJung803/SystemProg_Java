package programming_cse2016;

/*
 * �� ���� ���� a�� b�� �Է¹޾� a�� b�� ��(+), ��(-), ��(*)�� ����Ͽ� ����ϴ� ���α׷��� �ۼ��϶�.
 * 
 * ����� ����:
 * ù��° ���� a�� �Է��ϼ���.
 * 10
 * �ι�° ���� b�� �Է��ϼ���.
 * 4
 * 
 * ��: 14
 * ��: 6
 * ��: 40
 * 
 */

import java.util.*;
//scanner �� ���� import
class Homework_1_5 {
public static void main(String[] args) {
	 int num_a, num_b; // �Է¹޴� �� ����
	 int num_sum, num_sub, num_mul; // �� ������ ��, ��, ��
	
	 // �ڵ带 �ۼ��ϼ���.
	 System.out.println("ù��° ���� a�� �Է��ϼ���.");
	 Scanner scan = new Scanner (System.in);
	 num_a = scan.nextInt();
	
	 // �ڵ带 �ۼ��ϼ���.
	 System.out.println("�ι�° ���� b�� �Է��ϼ���.");
	 num_b = scan.nextInt();
	
	 // �ڵ带 �ۼ��ϼ���.
	 num_sum = num_a + num_b;
	 System.out.println("��: " + num_sum);
	
	 num_sub = num_a - num_b;
	 System.out.println("��: " + num_sub);
	 
	 num_mul = num_a * num_b;
	 System.out.println("��: " + num_mul);
	
	}
}