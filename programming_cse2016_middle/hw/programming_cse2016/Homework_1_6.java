package programming_cse2016;

/*
 * ȭ�� -> ���� �µ� ��ȭ��
 * 	F		C
 */

import java.util.*;

class Homework_1_6 {
  public static void main(String[] args) {
    //  ȭ�� �µ��� �����ϴ� �Ǽ��� ������ �����Ѵ�
    double F; 
    // ���� �µ��� �����ϴ� �Ǽ��� ������ �����Ѵ� 
    double C; 
    // Scanner ��ü�� �����ϰ� ���� scan �� �� ��ü�� ����Ű�� �Ѵ�
    Scanner scan = new Scanner(System.in);
    
    // ȭ�� �µ��� Ű���带 ���� �о� ���δ�
    System.out.print("ȭ�� �µ��� �Է��ϼ���: ");
    
    
    // ȭ�� �µ��� ���� �µ��� �ٲٰ� �� ���� ���� �µ��� ��Ÿ���� ������ �����Ѵ�
    // ����: ȭ�� �µ��� ���� �µ��� ��ȯ�ϴ� ������ C = (5/9)(F - 32) �̴�. 
    F = scan.nextDouble();
    C = ((5.0 / 9.0) * (F - 32.0));

    // ȭ�� �µ��� �����ϴ� ���� �µ��� ����Ѵ�
    System.out.println(C);
  }
}