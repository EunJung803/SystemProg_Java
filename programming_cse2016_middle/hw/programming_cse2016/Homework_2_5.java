package programming_cse2016;

/*
 * ��ȭ��ȣ�� �����Ͽ� ����ϴ� ���α׷��� �ۼ��϶�. 
 * ��ȭ��ȣ�� 0XY-ZZZ-ZZZZ �� ���¸� ���ؾ��ϰ� ������ ���� ��������� ������.
 * 1. �ι�° ���� X�� 2�̻� 6�̸��� �������� �Ѵ�.
 * 2. ����° ���� Y�� 1�̻� 7�̸��� �������� �Ѵ�. 
 * 3. Z�� ǥ�õ� ������ ���ڵ��� 0�̻� 9 ������ �������� �Ѵ�.
 * 
 * ���� �� ��� ��� ����:
 * 046-097-9856
 */

import java.util.Random; 

class Homework_2_5 {
  public static void main(String[] args) {

    // Random ��ü ���� 
    Random rand = new Random();

    // ��ȭ��ȣ ù ��° ���ڸ� 0���� �����. 
    String pnumber = "0";
    // ��ȭ��ȣ �ι�° ���ڴ� 2�̻� 6�̸��� ������ �����. 
    pnumber += rand.nextInt(4) + 2;
    pnumber += rand.nextInt(6) + 1;
    pnumber += "-";

    pnumber += rand.nextInt(9);
    pnumber += rand.nextInt(9);
    pnumber += rand.nextInt(9);
    pnumber += "-";
    
    pnumber += rand.nextInt(9);
    pnumber += rand.nextInt(9);
    pnumber += rand.nextInt(9);
    pnumber += rand.nextInt(9);

    System.out.println(pnumber);
  }
}