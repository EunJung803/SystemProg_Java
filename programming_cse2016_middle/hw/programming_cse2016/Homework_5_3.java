package programming_cse2016;

/*
 * �ڹ� ���α׷��� ������ �����ϴ� �л����� ���� ������ �о� �鿩 �������(60�� �̻�)�� ���� �л����� ���� ���� ����(60�� �̸�)�� ���� �л����� ���� ����Ͽ� ��� �ϴ� ���α׷��� �ۼ��϶�.
 * 
 * �����ϴ� �л����� ���� 1 �̻� �̶�� �����Ѵ�.
 * 
 * ��� ����
 * 
 * Enter the first score(negative to exit):98
 * 
 * Enter the next score(negative to exit):54
 * 
 * Enter the next score(negative to exit):-1
 * 
 * numStudents:2
 * 
 * numPass:1
 * 
 * numFail:1
 */

import java.util.Scanner;
class Homework_5_3 {
  public static void main(String[] args) {
	  	int grade;			// �� �л��� ����
		int numStudents=0;	//�л����� ��
		int numPass=0;	  	// ��� �л����� ��
		int numFail = 0;	// ���� �л����� ��

		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter the first score(negative to exit):");
		grade = scan.nextInt();
		
		// ������ ������ �ƴ� ���� ������ �ݺ��Ѵ�
		while(grade >=0) {
			
			// �л����� ���� 1��ŭ ������Ų��
			numStudents++;
			
			// ������ 60�̻��̸� ��� �л����� ���� 1��ŭ ������Ű��
			// �ƴϸ� ���� �л����� ���� 1��ŭ ������Ų��
			if(grade >= 60) {
		        numPass++;
		    }
		    else{
		        numFail++;
		    }
			
			// ���� ������ �о� ���δ�
			System.out.print("Enter the next score(negative to exit):");
			grade = scan.nextInt();	
		}
		
		// ��� �л����� ���� ���� �л����� ���� ����Ѵ�
	    System.out.println("numStudents:" + numStudents);
		System.out.println("numPass:" + numPass);
	    System.out.println("numFail:" + numFail);
  }
}