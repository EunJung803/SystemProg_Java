package programming_cse2016;

/*
 * ���� ��� ��� 
 * 
 */

import java.util.*;

class Homework_4_4 {
  public static void main(String[] args) {
    // �Է¹��� ������ �����ϴ� ����
    int year;
    // �������� �ƴ��� �����ϴ� �Լ�(true �� ����)
    boolean is_leap_year = false;
    System.out.println("������ �Է��ϼ���.");
    Scanner scan = new Scanner(System.in);
    
    year = scan.nextInt();
    
    // �Է¹��� ������ �������� ������� ����� ����Ѵ�.
    if(year%400==0) {
      is_leap_year = true;
    }
    else if(year%4==0 && year%100!=0) {
      is_leap_year = true;
    }
    else {
      is_leap_year = false;
    }
    
    // �����̸� "XXXX���� �����Դϴ�." ���
    // ����̸� "XXXX���� ����Դϴ�." ���
    if(is_leap_year == true) {
      System.out.println(year+"���� �����Դϴ�.");
    }
    else if(is_leap_year == false) {
      System.out.println(year+"���� ����Դϴ�.");
    }
  }
}