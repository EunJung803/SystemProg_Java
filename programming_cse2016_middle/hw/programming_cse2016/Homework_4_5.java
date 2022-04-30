package programming_cse2016;

/*
 * 정수 형태의 달(월)을 입력받아 영문 문자열 형태로 바꾸어 출력하는 프로그램을 
 * switch 문을 사용해 작성하라.
 */

import java.util.*;

class Homework_4_5 {
  public static void main(String[] args) {
    int input_month; // 입력받은 정수를 저장하는 변수
    String monthString; // 문자열 형태의 달을 저장하는 변수
    
    Scanner scan = new Scanner(System.in);
    input_month = scan.nextInt();
    
    // 입력받은 정수형태의 달(월)을 Switch 문을 이용해 문자열로 전환
    // 1~12 외의 경우 "Invalid Month" 출력
    switch(input_month) {
      case 1: monthString = "January";
              break;
      case 2: monthString = "February";
              break;
      case 3: monthString = "March";
              break;
      case 4: monthString = "April";
              break;
      case 5: monthString = "May";
              break;
      case 6: monthString = "June";
              break;
      case 7: monthString = "July";
              break;
      case 8: monthString = "August";
              break;
      case 9: monthString = "September";
              break;
      case 10: monthString = "October";
              break;
      case 11: monthString = "November";
              break;
      case 12: monthString = "December";
              break;
      default: monthString = "Invalid Month";
              break;
        }
    
    System.out.println(monthString);
  }
}