package programming_cse2016;

/*
 * ������ ���ǿ� ǥ������ ����ϴ� ���α׷��� �ۼ��ϼ���. 
 * ���� ���� ���� ������(r)�� ������ ����(h)�� ����ڷκ��� �Է� �޾ƾ� �մϴ�.
 * ������ ����(volume)�� ǥ����(area)�� ����ϴ� ������ ������ �����ϴ�.
 * 
 */

import java.util.Scanner; 
class Homework_2_2 {
  public static void main(String[] args) {
    double r, h, volume = 0, area = 0; 
    Scanner scan = new Scanner(System.in); 
    
    // ���⿡ �ڵ带 �Է��ϼ���. 
    
    // ����ڷκ��� r �Է¹ޱ�
    r = scan.nextDouble(); 
    // ����ڷκ��� h �Է¹ޱ� 
    h = scan.nextDouble();
    
    // ��Ʈ: Math.PI, Math.sqrt ��� 
    volume = (Math.PI * r * r * h) / 3;
    area = Math.PI * r * Math.sqrt(r*r + h*h) + Math.PI*r*r;
    
    System.out.println(volume); 
    System.out.println(area); 
  }
}