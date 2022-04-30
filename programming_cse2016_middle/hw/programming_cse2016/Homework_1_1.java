package programming_cse2016;


/*다음과 같이 직각 삼각형 모양을 출력하는 프로그램을 작성하세요.
 * 	*
 * 	**
 * 	***
 * 	****
 */

class Homework_1_1 {
	  public static void main(String[] args) {
	    for(int i = 1; i <= 4; i++){
	      for(int j = 1; j <= i; j++){
	        System.out.print("*");
	      }
	      System.out.println("");
	    }
	  }
}