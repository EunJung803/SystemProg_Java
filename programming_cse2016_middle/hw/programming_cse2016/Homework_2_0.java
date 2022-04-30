package programming_cse2016;

/*
 * 6개의 복권 번호를 생성해 출력하는 프로그램을 작성하라. 
 * 복권의 각 번호는 1부터 45사이의 정수여야 한다. 
 * 출력시 각 번호는 " "(공백)으로 구분한다.
 * 
 * 40 31 15 16 43 10
 */

import java.util.*;

class Homework_2_0 {
  public static void main(String[] args) {
    
    // 코드를 작성하세요.
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