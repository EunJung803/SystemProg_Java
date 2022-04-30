package programming_cse2016;

/* String 클래스의 replace 함수
 * ‘가을’을 포함하는 한줄의 문장을 입력받은 후 그 문장내의 ‘가을’을 ‘봄’으로 바꾸어 출력하는 프로그램을 작성하세요.
 * 
 * 입출력 예시: 입력: 나는 가을을 좋아합니다.
 * --> 나는 봄을 좋아합니다. 
 */


import java.util.Scanner; 

class Homework_2_3 {
  public static void main(String[] args) {
    String inputStr; // 입력 문자열 
    String outputStr = ""; // 출력 문자열
    Scanner scan = new Scanner(System.in); 
    // 여기에 코드를 입력하세요 
    // 힌트: String 클래스의 replace 함수 사용 
    inputStr = scan.nextLine();
    outputStr = inputStr.replace("가을", "봄");
    System.out.println(outputStr); 
  }
}