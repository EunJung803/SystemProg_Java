package programming_cse2016;



import java.util.Scanner;
class Homework_4_3 {
  public static void main(String[] args) {
  		double grade; // ����
  		
  		// ���� ������ �����ϴ� ������ �����Ѵ�
  		int TOEICscore;
  		
  		// Scanner ��ü�� �����ϰ� scan�� ����Ű�� �Ѵ�
  		Scanner scan = new Scanner(System.in);
  		
  		//������ �Է� �޴´�
	    System.out.print("grade:");
  		grade = scan.nextDouble();
  		
  		// ���� ������ �Է� �޴´�
  		System.out.print("TOEIC score:");
  		TOEICscore = scan.nextInt();
  		
  		// ������ ���� ������ ���� ������ �޽����� ����Ѵ�
  		if(grade >= 4.0 && TOEICscore >= 700){
        System.out.println('A');
      }
      else if(grade >= 3.5 && TOEICscore >= 700){
        System.out.println('B');
      }
      else if(grade >= 3.0 && TOEICscore >= 700){
        System.out.println('C');
      }
      else if(grade < 3.0 || TOEICscore < 700){
        System.out.println('D');
      }
  }
}