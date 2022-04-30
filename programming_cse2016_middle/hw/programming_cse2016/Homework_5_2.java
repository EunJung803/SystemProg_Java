package programming_cse2016;

/*
 * 주어진 문장 내에 있는 글자들의 수를 출력하는 프로그램을 작성하라.
 * 
 * 입력 받은 문장 내에 마침표(.), 물음표(?), 쉽표(,)와 느낌표(!)와 같은 구두점은 없다고 가정한다.
 * 
 * 문장 내에 있는 글자들의 수에 빈 칸, 빈 줄,탭 (tab)과 같은 흰색 공간문자는 포함되지 않는다.
 * 
 * 다음은 모범 출력이다.
 * 
 * Please enter a sentence:i like	fall
 * 
 * 9
 * 
 */

import java.util.Scanner;
class Homework_5_2 {
	  public static void main(String[] args) {
	  System.out.print("Please enter a sentence:");
	  Scanner scan = new Scanner(System.in);
	  
	  String sentence = scan.nextLine();
	
	  sentence = sentence.replaceAll(" ", "");
	  //공백을 없애준다
	
	  String array[] = sentence.split("");
	  //sentence의 한글자씩 array라는 배열에 잘라서 저장한다
	
	  System.out.println(array.length);
	  //배열의 길이를 구하면 곧 문자열의 글자수가 된다 
	  }
}