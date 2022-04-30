package programming_cse2016;

/*
 * 전화번호를 생성하여 출력하는 프로그램을 작성하라. 
 * 전화번호는 0XY-ZZZ-ZZZZ 의 형태를 취해야하고 다음과 같은 제약사항을 가진다.
 * 1. 두번째 숫자 X는 2이상 6미만의 정수여야 한다.
 * 2. 세번째 숫자 Y는 1이상 7미만의 정수여야 한다. 
 * 3. Z로 표시된 나머지 숫자들은 0이상 9 이하의 정수여야 한다.
 * 
 * 실행 시 모범 출력 예시:
 * 046-097-9856
 */

import java.util.Random; 

class Homework_2_5 {
  public static void main(String[] args) {

    // Random 객체 생성 
    Random rand = new Random();

    // 전화번호 첫 번째 숫자를 0으로 만든다. 
    String pnumber = "0";
    // 전화번호 두번째 숫자는 2이상 6미만의 정수로 만든다. 
    pnumber += rand.nextInt(4) + 2;
    pnumber += rand.nextInt(6) + 1;
    pnumber += "-";

    pnumber += rand.nextInt(9);
    pnumber += rand.nextInt(9);
    pnumber += rand.nextInt(9);
    pnumber += "-";
    
    pnumber += rand.nextInt(9);
    pnumber += rand.nextInt(9);
    pnumber += rand.nextInt(9);
    pnumber += rand.nextInt(9);

    System.out.println(pnumber);
  }
}