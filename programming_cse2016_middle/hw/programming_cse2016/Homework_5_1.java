package programming_cse2016;

/*
 * ����ڷκ��� �� ���ڿ��� �о� ���� �� �� ���ڿ� �ȿ� �ִ�
 * �� ����(a, e, i, o, u)�� ���� �������� ���� �˾� ���� ����ϴ� ���α׷��� �ۼ��϶�.
 * �� ������ ���� ������ ����⸦ ����ض�.
 * 
 * (���� ���ĺ� �̿��� ����, Ư������ ���� �Է��� ���ٰ� �����Ѵ�)
 * 
 * ��� ����
 * 
 * Please enter a sentence:I love Java programming very much
 * 
 * a:3
 * e:2
 * i:2
 * o:2
 * u:1
 * consonant:18
 */

import java.util.Scanner;
class Homework_5_1 {
  public static void main(String[] args) {
		System.out.print("Please enter a sentence:");
		int a=0;
		int e=0;
		int i=0;
		int o=0;
		int u=0;
		int consonant=0;
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		
		// ���� ����
		sentence = sentence.replaceAll(" ", "");
		// �ҹ��� ��ȯ
		sentence = sentence.toLowerCase();

		for(int j=0; j<sentence.length(); j++) {
	      if(sentence.charAt(j)=='a') {
	        a++;
	      }
	      else if(sentence.charAt(j)=='e') {
	        e++;
	      }
	      else if(sentence.charAt(j)=='i') {
	        i++;
	      }
	      else if(sentence.charAt(j)=='o') {
	        o++;
	      }
	      else if(sentence.charAt(j)=='u') {
	        u++;
	      }
	      else {
	        consonant++;
	      }
    }
		
		System.out.println("a:"+a);
		System.out.println("e:"+e);
		System.out.println("i:"+i);
		System.out.println("o:"+o);
		System.out.println("u:"+u);
		System.out.println("consonant:"+consonant);
  }
}