package programming_cse2016;

/*
 * 두 수를 입력받으면 두 수를 포함한 사이의 수를 차례대로 출력하는 프로그램을 작성하라.
 * 
 * 각 수는 공백(" ")으로 구분하여 출력한다.
 * 
 * 출력 예시 : 
 * input : 3 12
 * 3 4 5 6 7 8 9 10 11 12
 * 
 * input : 53 41
 * 41 42 43 44 45 46 47 48 49 50 51 52 53
 * 
 * input : 20 20
 * 20
 */


//두 수 사이의 수
import java.util.*;

class Homework_5_0 {
	public static void main(String[] args) {
		 int num1, num2, i;
		 System.out.println("input :");
		 Scanner scan = new Scanner(System.in);
		 // 입력받기
		 num1 = scan.nextInt();
		 num2 = scan.nextInt();
		 
		 if(num1 > num2) {
			   i = num1;
			   num1 = num2;
			   num2 = i;
		 }
		
		 for(i=0; i<num2*2; i++) {
			   System.out.print(num1+" ");
			   num1++;
			   if(num1 > num2) {
			     break;
			   }
		 }
	 
	}
}