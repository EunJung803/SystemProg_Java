package programming_cse2016;

/*
 * �� ���� �Է¹����� �� ���� ������ ������ ���� ���ʴ�� ����ϴ� ���α׷��� �ۼ��϶�.
 * 
 * �� ���� ����(" ")���� �����Ͽ� ����Ѵ�.
 * 
 * ��� ���� : 
 * input : 3 12
 * 3 4 5 6 7 8 9 10 11 12
 * 
 * input : 53 41
 * 41 42 43 44 45 46 47 48 49 50 51 52 53
 * 
 * input : 20 20
 * 20
 */


//�� �� ������ ��
import java.util.*;

class Homework_5_0 {
	public static void main(String[] args) {
		 int num1, num2, i;
		 System.out.println("input :");
		 Scanner scan = new Scanner(System.in);
		 // �Է¹ޱ�
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