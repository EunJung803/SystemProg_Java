package programming_cse2016;


/*
 * �츮�� ��¥�� yyyy/mm/dd �������� ǥ���Ѵ�. 
 * �׷��� ��� ���󿡼��� ������ �������� ���� mm/dd/yyyy ������ ����Ѵ�. 
 * yyyy/mm/dd ������ ��¥�� �Է� �޾��� �� mm/dd/yyyy �������� �ٲپ� ����ϴ� ���α׷��� �ۼ��϶�.
 * 
 * ��� ����:
 * 
 * �Է� : 2020/09/01
 * 09/01/2020
 * 
 */

import java.util.*;

class Homework_2_6 {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    // �ڵ带 �ۼ��ϼ���.
    String birthdate;
    String year, month, day;
    String rest;
    int index;

    birthdate = scan.next();

    index = birthdate.indexOf("/");

    year = birthdate.substring(0, index);

    rest = birthdate.substring(index + 1);

    index = rest.indexOf("/");

    month = rest. substring(0, index);

    day = rest.substring(index + 1);

    System.out.println(month + "/" + day + "/" + year);
    
  }
}