package programming_cse2016;


/*
 * 우리는 날짜를 yyyy/mm/dd 형식으로 표기한다. 
 * 그러나 어느 나라에서는 연도가 마지막에 오는 mm/dd/yyyy 형식을 사용한다. 
 * yyyy/mm/dd 형식의 날짜를 입력 받았을 때 mm/dd/yyyy 형식으로 바꾸어 출력하는 프로그램을 작성하라.
 * 
 * 출력 예시:
 * 
 * 입력 : 2020/09/01
 * 09/01/2020
 * 
 */

import java.util.*;

class Homework_2_6 {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    // 코드를 작성하세요.
    String birthdate;
    String year, month, day;
    String rest;
    int index;

    birthdate = scan.next();

    index = birthdate.indexOf("/");

    year = birthdate.substring(0, index);

    rest = birthdate.substring(index + 1);

    index = rest.indexOf("/");

    month = rest. substring(0, index);

    day = rest.substring(index + 1);

    System.out.println(month + "/" + day + "/" + year);
    
  }
}