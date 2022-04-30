package programming_cse2016;

/*
 * 사용자로부터 암호를 입력받아야 한다. 맞는 암호가 입력되면 "환영합니다" 라는 메시지를 출력하고 프로그램을 종료해야한다. 
 * 틀린 암호가 입력되면 "암호가 틀립니다" 라는 메시지를 출력해야 한다. 
 * 그리고 다시 암호를 입력 받아야 한다. 
 * 사용자가 암호를 3번 잘못 입력하면 "접속을 거부합니다" 라는 메시지를 출력하고 프로그램을 종료한다. 
 * 맞는 암호는 "hyin" 이다.
 */

import java.util.*;

class Homework_5_6 {
  public static void main(String[] args) {
    String correct_pw = "hyin";
    String input_pw;
    
    Scanner scan = new Scanner(System.in);
    
    int n = 0;
    while(n < 3) {
      System.out.println("암호를 입력하세요.");
      input_pw = scan.nextLine();
      if(input_pw.equals(correct_pw)) {
        break;
      }
      else {
        System.out.println("암호가 틀립니다.");
        n++;
      }
    }
    if(n == 3) {
      System.out.println("접속을 거부합니다.");
    }
    
  }
}