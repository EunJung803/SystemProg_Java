package programming_cse2016;

/*
 * ����ڷκ��� ���̰� 3�� ���ڿ��� �Է¹޾� �������� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * 
 * ����� ����:
 * 
 * ���̰� 3�� ���ڿ� �Է�: ������
 * �漳��
 */

import java.util.Scanner; 

class Homework_2_4 {
  public static void main(String[] args) {
    String str = "";  // �Է¹޴� ���ڿ� 
    String outputStr = ""; //��� ���ڿ� 
    Scanner scan = new Scanner(System.in);
    str = scan.next(); // ���ڿ� �Է¹ޱ� 
    // ���⿡ �ڵ带 �Է��ϼ���. 

    for(int i = 2; i >= 0; i--) {
      outputStr = outputStr + str.charAt(i);
    }
    
    System.out.println(outputStr);
  }
}