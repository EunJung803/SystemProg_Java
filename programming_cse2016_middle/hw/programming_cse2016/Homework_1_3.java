package programming_cse2016;


/*
 * ���� ������(r)�� �Է� ������ ���� ���Ǹ� ����Ͽ� �Ҽ� �ι�° �ڸ����� ����ϴ� ���α׷��� �ۼ��϶�. ���� ���Ǹ� ���ϴ� ������ ������ ����.
 * ���� ���� = \frac{4}{3} \pi r^3
 * (������ PI = 3.14 �� ����Ѵ�.)
 * java.text �� DecimalFormat �� ����ϸ� �Ҽ� �ι�° �ڸ����� ��� �� �� �ִ�.
 * 
 */


import java.util.*;
import java.text.*;

class Homework_1_3 {
  public static void main(String[] args) {
    final double PI = 3.14; // ������
    double r; // ���� ������
    double v; // ���� ����
    
    // �ڵ带 �ۼ��ϼ���.
    Scanner scan = new Scanner (System.in);
    r = scan.nextDouble();
    v = 4*PI*(Math.pow(r,3))/3;
    DecimalFormat ans = new DecimalFormat("############.##"); System.out.println(ans.format(v));

  }
}