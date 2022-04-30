package programming_cse2016;

/*
 * 우리나라에서 개인들은 건물이나 토지의 면적 단위로 평을 많이 사용하고 있다.
 * 그러나 정부에서 공식적으로는 제곱미터(m^2)를 사용하고 있다. 
 * 1평은 3.305785 m^2이다. 
 * 사용자로부터 평으로 표시된 면적을 입력 받아 제곱미터로 된 면적으로 변환하여 출력하는 프로그램을 작성하라.
 * 
 * 입출력 예시:
 * 면적 (평):  30
 * 99.17355
 */


import java.util.*;

class Homework_1_4 {
  public static void main(String[] args) {
    double py;  // 평 면적 
    double sqmt; // 제곱 미터 면적 
    
    // 코드를 작성하세요. 
    Scanner scan = new Scanner(System.in);
    py = scan.nextDouble();
    sqmt = 3.305785 * py;
    System.out.println(sqmt);
  }
}