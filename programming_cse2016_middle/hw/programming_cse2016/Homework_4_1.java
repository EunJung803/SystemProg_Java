package programming_cse2016;



import java.util.Scanner;
class Homework_4_1 {
  public static void main(String[] args) {
		// �� ������ �� ��ҵ��� �������� �����ϴ� �������� �����Ѵ�
		int attendScore;
		int assignmentScore;
		int quizScore;
		int midtermexamScore;
		int finalexamScore;
		
		// ������ �����ϴ� ������ �����Ѵ�
			// ���⿡ �ڵ带 �����ϼ���
		double totalScore;

		//������ �����ϴ� ������ �����Ѵ�
			//���⿡ �ڵ带 �����ϼ���
		char grade;
		
		// Ű����κ��� �Է��ϴ� �����͸� �б� ���� Scanner ��ü�� �����.
		Scanner scan = new Scanner(System.in);
		
		// ����ڷκ��� �� �� ����� ������ �� ���� �ϳ��� �Է��϶�� ��û�Ѵ�.
		// �׸��� �Էµ� ������ �д´�.
	  System.out.print("attendance score:");
		attendScore = scan.nextInt();
		System.out.print("assignment score:");
		assignmentScore = scan.nextInt();
		System.out.print("quiz score:");
		quizScore = scan.nextInt();
		System.out.print("midterm exam score:");
		midtermexamScore = scan.nextInt();
		System.out.print("final exam score:");
		finalexamScore = scan.nextInt();
				
		// ������ ����Ѵ�
		totalScore = (attendScore*0.1) + (assignmentScore*0.4) + (quizScore*0.1) + (midtermexamScore*0.2) + (finalexamScore*0.2);
		
		// ������ �����Ѵ�
		if(totalScore >= 90){
	      grade = 'A';
	    }
	    else if(totalScore >= 80) {
	      grade = 'B';
	    }
	    else if(totalScore >= 70) {
	      grade = 'C';
	    }
	    else if(totalScore >= 60) {
	      grade = 'D';
	    }
	    else{
	      grade = 'F';
	    }
		
		// ������ ������ ����Ѵ�
		System.out.println("total score:" + totalScore);
		System.out.println("grade:" + grade);
  }
}