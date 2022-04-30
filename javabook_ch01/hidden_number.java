package javabook_ch01;

import java.util.Random;
import java.util.Scanner;

public class hidden_number {
	public static void main(String[] args) {
		  Random r = new Random();
		  int random_number = r.nextInt(100); 
		  
		  System.out.println("Find the hidden number (1 ~ 100) ");
		  
		  Scanner input = new Scanner(System.in);
		  
		  while(true){
		   System.out.print("Enter the number : ");
		   int number = input.nextInt();
		   
		   //System.out.println("입력된 숫자는 " + number + "입니다.");
		   
		   if(number == random_number){
		    System.out.println( number + " is correct!");
		    break;
		   }
		   else if(number > random_number){
		    System.out.println(number + " is bigger than the answer.\n");
		   }
		   else{
		    System.out.println(number + " is smaller than the answer.\n");
		   }
		  }	
	}
}