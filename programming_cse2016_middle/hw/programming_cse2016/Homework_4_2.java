package programming_cse2016;

import java.util.Scanner;
class Homework_4_2 {
  public static void main(String[] args) {
		int totalcreditearned; // �� �̼�����
		// ���� ������ �����ϴ� ������ �����Ѵ�
		int TOEICscore;
		
		// Scanner ��ü�� �����ϰ� scan�� ����Ű�� �Ѵ�
		Scanner scan = new Scanner(System.in);
		
		System.out.print("total credit:");
		totalcreditearned = scan.nextInt();
		System.out.print("TOEIC score:");
		TOEICscore = scan.nextInt();
		
		// �� �̼������� TOEIC ������ ���� ����/����/�����Ұ� ���θ� ����Ѵ�
		if(totalcreditearned >= 140 && TOEICscore >= 700) {
      System.out.println("graduation");
    }
    else if(totalcreditearned >= 140 && TOEICscore < 700) {
      System.out.println("completion");
    }
    else if(totalcreditearned < 140) {
      System.out.println("failure");
    }
  }
}