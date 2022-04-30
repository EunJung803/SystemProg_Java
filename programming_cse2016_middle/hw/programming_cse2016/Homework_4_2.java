package programming_cse2016;

import java.util.Scanner;
class Homework_4_2 {
  public static void main(String[] args) {
		int totalcreditearned; // 총 이수학점
		// 토익 점수를 저장하는 변수를 선언한다
		int TOEICscore;
		
		// Scanner 객체를 생성하고 scan이 가리키게 한다
		Scanner scan = new Scanner(System.in);
		
		System.out.print("total credit:");
		totalcreditearned = scan.nextInt();
		System.out.print("TOEIC score:");
		TOEICscore = scan.nextInt();
		
		// 총 이수학점과 TOEIC 점수에 따라 졸업/수료/졸업불가 여부를 출력한다
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