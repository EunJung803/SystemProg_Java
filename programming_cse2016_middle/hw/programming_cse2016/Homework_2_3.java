package programming_cse2016;

/* String Ŭ������ replace �Լ�
 * ���������� �����ϴ� ������ ������ �Է¹��� �� �� ���峻�� ���������� ���������� �ٲپ� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * 
 * ����� ����: �Է�: ���� ������ �����մϴ�.
 * --> ���� ���� �����մϴ�. 
 */


import java.util.Scanner; 

class Homework_2_3 {
  public static void main(String[] args) {
    String inputStr; // �Է� ���ڿ� 
    String outputStr = ""; // ��� ���ڿ�
    Scanner scan = new Scanner(System.in); 
    // ���⿡ �ڵ带 �Է��ϼ��� 
    // ��Ʈ: String Ŭ������ replace �Լ� ��� 
    inputStr = scan.nextLine();
    outputStr = inputStr.replace("����", "��");
    System.out.println(outputStr); 
  }
}