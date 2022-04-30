package programming_cse2016;



import java.util.Scanner;
class Homework_4_1 {
  public static void main(String[] args) {
		// 한 과목의 평가 요소들의 점수들을 저장하는 변수들을 선언한다
		int attendScore;
		int assignmentScore;
		int quizScore;
		int midtermexamScore;
		int finalexamScore;
		
		// 총점을 저장하는 변수를 선언한다
			// 여기에 코드를 삽입하세요
		double totalScore;

		//학점을 저장하는 변수를 선언한다
			//여기에 코드를 삽입하세요
		char grade;
		
		// 키보드로부터 입력하는 데이터를 읽기 위한 Scanner 객체를 만든다.
		Scanner scan = new Scanner(System.in);
		
		// 사용자로부터 각 평가 요소의 점수를 한 번에 하나씩 입력하라고 요청한다.
		// 그리고 입력된 점수를 읽는다.
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
				
		// 총점을 계산한다
		totalScore = (attendScore*0.1) + (assignmentScore*0.4) + (quizScore*0.1) + (midtermexamScore*0.2) + (finalexamScore*0.2);
		
		// 학점을 결정한다
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
		
		// 총점과 학점을 출력한다
		System.out.println("total score:" + totalScore);
		System.out.println("grade:" + grade);
  }
}