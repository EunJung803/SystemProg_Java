package programming_cse2016;

/*
 * �־��� ���� ���� �ִ� ���ڵ��� ���� ����ϴ� ���α׷��� �ۼ��϶�.
 * 
 * �Է� ���� ���� ���� ��ħǥ(.), ����ǥ(?), ��ǥ(,)�� ����ǥ(!)�� ���� �������� ���ٰ� �����Ѵ�.
 * 
 * ���� ���� �ִ� ���ڵ��� ���� �� ĭ, �� ��,�� (tab)�� ���� ��� �������ڴ� ���Ե��� �ʴ´�.
 * 
 * ������ ��� ����̴�.
 * 
 * Please enter a sentence:i like	fall
 * 
 * 9
 * 
 */

import java.util.Scanner;
class Homework_5_2 {
	  public static void main(String[] args) {
	  System.out.print("Please enter a sentence:");
	  Scanner scan = new Scanner(System.in);
	  
	  String sentence = scan.nextLine();
	
	  sentence = sentence.replaceAll(" ", "");
	  //������ �����ش�
	
	  String array[] = sentence.split("");
	  //sentence�� �ѱ��ھ� array��� �迭�� �߶� �����Ѵ�
	
	  System.out.println(array.length);
	  //�迭�� ���̸� ���ϸ� �� ���ڿ��� ���ڼ��� �ȴ� 
	  }
}