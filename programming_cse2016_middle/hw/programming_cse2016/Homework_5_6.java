package programming_cse2016;

/*
 * ����ڷκ��� ��ȣ�� �Է¹޾ƾ� �Ѵ�. �´� ��ȣ�� �ԷµǸ� "ȯ���մϴ�" ��� �޽����� ����ϰ� ���α׷��� �����ؾ��Ѵ�. 
 * Ʋ�� ��ȣ�� �ԷµǸ� "��ȣ�� Ʋ���ϴ�" ��� �޽����� ����ؾ� �Ѵ�. 
 * �׸��� �ٽ� ��ȣ�� �Է� �޾ƾ� �Ѵ�. 
 * ����ڰ� ��ȣ�� 3�� �߸� �Է��ϸ� "������ �ź��մϴ�" ��� �޽����� ����ϰ� ���α׷��� �����Ѵ�. 
 * �´� ��ȣ�� "hyin" �̴�.
 */

import java.util.*;

class Homework_5_6 {
  public static void main(String[] args) {
    String correct_pw = "hyin";
    String input_pw;
    
    Scanner scan = new Scanner(System.in);
    
    int n = 0;
    while(n < 3) {
      System.out.println("��ȣ�� �Է��ϼ���.");
      input_pw = scan.nextLine();
      if(input_pw.equals(correct_pw)) {
        break;
      }
      else {
        System.out.println("��ȣ�� Ʋ���ϴ�.");
        n++;
      }
    }
    if(n == 3) {
      System.out.println("������ �ź��մϴ�.");
    }
    
  }
}