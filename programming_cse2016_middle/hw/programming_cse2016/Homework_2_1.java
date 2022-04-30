package programming_cse2016;

/*
 * ��(seconds) ������ �ð��� �Է¹޾Ƽ�, 
 * �̸� ��(days), �ð�(hours), ��(minutes), ��(seconds) �� ��ȯ�ϴ� ���α׷��� �ۼ��ϼ���. 
 * 
 * ����� ����:
 * 289932 �� �Է��Ұ��,
 * 
 * Total(seconds): 
 * 3Days 8Hours 32Minutes 12Seconds 
 */


import java.util.Scanner;
class Homework_2_1 {
  public static void main(String[] args) {
    int total;  // �� �ð� (��) 
    int days = 0, hours = 0, minutes = 0, seconds = 0; // ��,�ð�,��,��  
    
    Scanner scan = new Scanner(System.in); 
    total = scan.nextInt(); 
    
    // ���⿡ �ڵ带 �Է��ϼ���. 

    days = total / (60*60*24);
    hours = total / (60*60) - (days*24);
    minutes = (total / 60) - (hours*60) - (days*24*60);
    seconds = total % 60;
    
    System.out.println("Total(seconds):");
    System.out.println(days + "Days " + hours + "Hours " + minutes + "Minutes " + seconds + "Seconds");
  }
}