package programming_cse2016;

/*
 * �� ���л��� �̹� �б⿡ �����ϴ� ������� ���۹�, ���α׷���, �̻�����̴�.�� �л��� �� ���� ������ ������ ����.
	���۹�: 88�� 
	���α׷���: 92��
	�̻����: 79�� 
�� �л��� ��� ������ ��� �� ����϶�.
 */

class Homework_1_0 {
	  public static void main(String[] args) {
	    // ���۹��� ���α׷���, �̻���� ������ �������� �����ϴ� 
	    // �������� �����Ѵ�
	    double compgrade, proggrade, mathgrade;
	    // ���� �������� ����� �����ϴ� ������ �����Ѵ� 
	    double average; 
	    
	    // ���۹� ������ ������ 88�� �Ѵ�. 
	    compgrade = 88; 
	    // ���α׷��� ������ ������ 92������ �Ѵ�
	    proggrade = 92;
	    // �̻���� ������ ������ 79������ �Ѵ�
	    mathgrade = 79;
	    // ���� �������� ����� ����Ѵ�
	      // ���⿡ �ڵ带 �����ϼ��� 
	      average = (compgrade + proggrade + mathgrade)/3;
	    // ��������� ����Ѵ� 
	    System.out.println(average);
	  }
}
