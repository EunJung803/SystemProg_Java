package programming_cse2016;

/*
 * 6���� ���� ��ȣ�� ������ ����ϴ� ���α׷��� �ۼ��϶�. 
 * ������ �� ��ȣ�� 1���� 45������ �������� �Ѵ�. 
 * ��½� �� ��ȣ�� " "(����)���� �����Ѵ�.
 * 
 * 40 31 15 16 43 10
 */

import java.util.*;

class Homework_2_0 {
  public static void main(String[] args) {
    
    // �ڵ带 �ۼ��ϼ���.
    int lotto[] = new int [6];
		
		for(int i=0; i<6; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1;
            
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}

		}
	
	  for(int i=0; i<6; i++) {
		  System.out.print(lotto[i] + " ");
	  }	
	}
}