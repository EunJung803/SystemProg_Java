package programming_cse2016;


/*
 * 구의 반지름(r)을 입력 받으면 구의 부피를 계산하여 소수 두번째 자리까지 출력하는 프로그램을 작성하라. 구의 부피를 구하는 공식은 다음과 같다.
 * 구의 부피 = \frac{4}{3} \pi r^3
 * (원주율 PI = 3.14 로 계산한다.)
 * java.text 의 DecimalFormat 을 사용하면 소수 두번째 자리까지 출력 할 수 있다.
 * 
 */


import java.util.*;
import java.text.*;

class Homework_1_3 {
  public static void main(String[] args) {
    final double PI = 3.14; // 원주율
    double r; // 구의 반지름
    double v; // 구의 부피
    
    // 코드를 작성하세요.
    Scanner scan = new Scanner (System.in);
    r = scan.nextDouble();
    v = 4*PI*(Math.pow(r,3))/3;
    DecimalFormat ans = new DecimalFormat("############.##"); System.out.println(ans.format(v));

  }
}