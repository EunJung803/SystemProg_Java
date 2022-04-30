package programming_cse2016;

/*
 * ������ �������α׷��� �� ���Ϸ� �����̵Ǿ��ִ�. 
 * Main.java�� Employee.java. 
 * 
 * Main.java �� ���ǵǾ��ִ� Main Ŭ�����ȿ����� 
 * Employee.java �� ���ǵǾ��ִ� Employee Ŭ������ ��ü�� ����� ����Ѵ�. 
 * 
 * Employee.java���� ���б��� ������ ��Ÿ���� Employee Ŭ������ ���밡 �ۼ��Ǿ� �ִ�. 
 * ������ �Ӽ������� �̸�, ��ȣ�� ���̸� ������. 
 * ������ �̸�, ��ȣ�� ���̸� ���� �˷� �ִ� �޼ҵ���� ������ �־���Ѵ�. 
 * ���� ������ �̸�, ��ȣ, ���̸� ���� �־��� ������ ������ �� �ִ� �޼ҵ�� ���� ������ �־�� �Ѵ�. 
 * �̸� ���� Employee.java ������ ���� �޼ҵ���� ������ �ۼ��ϼ���.
 * 
 */

//Employee.java 
//������ ��Ÿ����. 
public class Employee {
	private String name; // �̸� 
	private int number; // ��ȣ 
	private int age; // ���� 
	
	// ���ο� Employee ��ü�� �����Ѵ�  
	public Employee() {
	 //�ƹ��͵� ����
	}
	
	// ������ �޼ҵ� - �̸��� ��ȯ�Ѵ�. 
	public String getName() {
	 return name; 
	}
	
	// ������ �޼ҵ� - ��ȣ�� ��ȯ�Ѵ�. 
	public int getNumber() {
	 return number;
	}
	
	// ������ �޼ҵ� - ���̸� ��ȯ�Ѵ�. 
	public int getAge() {
	 return age;
	}
	
	// �� Employee ��ü�� ������ ���� ���ڿ��� ��ȯ�Ѵ�. 
	public String toString() {
	 return "Name: " + name + "\n" + "Number: " + number + "\n" + "Age: " + age;
	}
	
	// ������ �޼ҵ� - �̸��� �־��� ������ �����Ѵ�. 
	public void setName(String Name) {
	 name = Name;
	}
	
	// ������ �޼ҵ� - ��ȣ�� �־��� ������ �����Ѵ�. 
	public void setNumber(int Number) {
	 number = Number;
	}
	
	// ������ �޼ҵ� - ���̸� �־��� ������ �����Ѵ�. 
	public void setAge(int Age) {
	 age = Age;
	}
}


//Main.java 
//Employee ��ü�� ����� ����Ѵ�.   
public class Main {
	public static void main(String[] args) {
		 Employee emp1 = new Employee();
		 emp1.setName("lee");
		 emp1.setNumber(100);
		 emp1.setAge(25); 
		 System.out.println(emp1); 
	}
}
