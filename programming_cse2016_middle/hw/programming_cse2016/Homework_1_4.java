package programming_cse2016;

/*
 * �츮���󿡼� ���ε��� �ǹ��̳� ������ ���� ������ ���� ���� ����ϰ� �ִ�.
 * �׷��� ���ο��� ���������δ� ��������(m^2)�� ����ϰ� �ִ�. 
 * 1���� 3.305785 m^2�̴�. 
 * ����ڷκ��� ������ ǥ�õ� ������ �Է� �޾� �������ͷ� �� �������� ��ȯ�Ͽ� ����ϴ� ���α׷��� �ۼ��϶�.
 * 
 * ����� ����:
 * ���� (��):  30
 * 99.17355
 */


import java.util.*;

class Homework_1_4 {
  public static void main(String[] args) {
    double py;  // �� ���� 
    double sqmt; // ���� ���� ���� 
    
    // �ڵ带 �ۼ��ϼ���. 
    Scanner scan = new Scanner(System.in);
    py = scan.nextDouble();
    sqmt = 3.305785 * py;
    System.out.println(sqmt);
  }
}