package programming_cse2016;

/*
 * ������� �ູ���� ����ϴ� CatHappy Ŭ������ �ۼ��϶�.
 * 
 * CatHappy�� ����� �̸��� ������, �ູ���� ������.
 * 
 * �������� ������� ������ �ʴ� Ư���̴�.
 * 
 * ����̴� �ൿ�� �ϸ� �ູ���� ���Ѵ�.
 * 
 * ������� �������� ������ ���ϴ� �ູ���� �� ũ��.
 * 
 * CatHappy �� �ּ����� �����Ͽ� CatHappy Ŭ������ �ϼ��϶�.
 */

public class CatHappy {
	  // ����� �̸�
	  private String name;
	  // ������� ������ ����. 1~5 ������ ���� ������.
	  private int sensitive;
	  // ������� �ູ��. �������� �ູ���� ��Ÿ����.
	  private double happiness;
	  
	  public CatHappy(String nameIn, int sensitiveIn) {
	    name = nameIn;
	    sensitive = sensitiveIn;
	    // �⺻ �ູ���� 50���� �Ѵ�.
	    happiness = 50;
	  }
	  public String toString() {
	    return name + "'s happiness: " + happiness;
	  }
	  
	  // ����� �̸��� �����Ѵ�.
	  public void setName(String newName) {
	    name = newName;
	  }
	  
	  // ����� �̸��� ��ȯ�Ѵ�.
	  public String getName() {
	    return name;
	  }
	  
	  // ������� �������� ��ȯ�Ѵ�.
	  public int getSensitive() {
	    return sensitive;
	  }
	  
	  // ������� �ູ���� ��ȯ�Ѵ�.
	  public double getHappiness() {
	    return happiness;
	  }
	  
	  
	  // �ൿ �Լ��� 
	  // ���: �ູ���� �������� �� ��ŭ ������Ų��.
	  public void play() {
	    happiness += sensitive/2;
	  }
	  
	  
	  // ���ڱ�: �ູ���� 3 ������Ű��,�������� 30% ��ŭ �� ������Ų��. 
	  public void sleep() {
	    happiness = happiness + 3 + sensitive*(30/100);
	  }
	  
	  
	  // ������: �ູ���� �������� 4�� ��ŭ ���ҽ�Ų��.
	  public void boring() {
	    happiness -= sensitive * 4;
	  }
	  
	  
	  // �׷��: �ູ���� 1 ������Ų��.
	  public void grooming() {
	    happiness++;
	  }
	  
	  
	  // �ƹ��͵� ����: �ູ���� 2 ���ҽ�Ų��.
	  public void nothing() {
	    happiness -= 2;
	  }
}

//Main.java
class Main {
	public static void main(String[] args) {
		 CatHappy cat1 = new CatHappy("Ruby", 3);
		 cat1.play();
		 cat1.boring();
		 cat1.sleep();
		 cat1.grooming();
		 System.out.println(cat1);
	}
}