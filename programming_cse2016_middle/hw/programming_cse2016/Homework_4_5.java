package programming_cse2016;

/*
 * ���� ������ ��(��)�� �Է¹޾� ���� ���ڿ� ���·� �ٲپ� ����ϴ� ���α׷��� 
 * switch ���� ����� �ۼ��϶�.
 */

import java.util.*;

class Homework_4_5 {
  public static void main(String[] args) {
    int input_month; // �Է¹��� ������ �����ϴ� ����
    String monthString; // ���ڿ� ������ ���� �����ϴ� ����
    
    Scanner scan = new Scanner(System.in);
    input_month = scan.nextInt();
    
    // �Է¹��� ���������� ��(��)�� Switch ���� �̿��� ���ڿ��� ��ȯ
    // 1~12 ���� ��� "Invalid Month" ���
    switch(input_month) {
      case 1: monthString = "January";
              break;
      case 2: monthString = "February";
              break;
      case 3: monthString = "March";
              break;
      case 4: monthString = "April";
              break;
      case 5: monthString = "May";
              break;
      case 6: monthString = "June";
              break;
      case 7: monthString = "July";
              break;
      case 8: monthString = "August";
              break;
      case 9: monthString = "September";
              break;
      case 10: monthString = "October";
              break;
      case 11: monthString = "November";
              break;
      case 12: monthString = "December";
              break;
      default: monthString = "Invalid Month";
              break;
        }
    
    System.out.println(monthString);
  }
}