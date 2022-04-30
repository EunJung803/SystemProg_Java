package programming_cse2016;

/*
 * 자바 프로그래밍 과목을 수강하는 학생들의 시험 점수를 읽어 들여 통과점수(60점 이상)를 받은 학생들의 수와 낙제 점수(60점 미만)를 받은 학생들의 수를 계산하여 출력 하는 프로그램을 작성하라.
 * 
 * 수강하는 학생들의 수는 1 이상 이라고 가정한다.
 * 
 * 출력 예시
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
	  	int grade;			// 한 학생의 접수
		int numStudents=0;	//학생들의 수
		int numPass=0;	  	// 통과 학생들의 수
		int numFail = 0;	// 낙제 학생들의 수

		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter the first score(negative to exit):");
		grade = scan.nextInt();
		
		// 점수가 음수가 아닌 동안 다음을 반복한다
		while(grade >=0) {
			
			// 학생들의 수를 1만큼 증가시킨다
			numStudents++;
			
			// 점수가 60이상이면 통과 학생들의 수를 1만큼 증가시키고
			// 아니먼 낙제 학생들의 수를 1만큼 증가시킨다
			if(grade >= 60) {
		        numPass++;
		    }
		    else{
		        numFail++;
		    }
			
			// 다음 점수를 읽어 들인다
			System.out.print("Enter the next score(negative to exit):");
			grade = scan.nextInt();	
		}
		
		// 통과 학생들의 수와 낙제 학생들의 수를 출력한다
	    System.out.println("numStudents:" + numStudents);
		System.out.println("numPass:" + numPass);
	    System.out.println("numFail:" + numFail);
  }
}