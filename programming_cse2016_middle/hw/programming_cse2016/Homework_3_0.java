package programming_cse2016;

/*
 * ��ݰ� �Ա��� ������ ���¸� ��Ÿ���� Account Ŭ������ �ۼ��϶�.
 * 
 * ���´� ������, �ܾ��� ������.
 * 
 * ���´� �Աݰ� ��� ����� ������.
 * 
 * Account.java �� �ּ����� �����Ͽ� Account Ŭ������ �ϼ��϶�.
 * 
 */


//Account.java
//���� 
public class Account {
	
	// ������
	private String owner;
	// �ܾ�
	private int balance;

	// ���ο� Account ��ü�� �����ϴ� ������
	// �ܾ��� 0���� �ʱ�ȭ�Ѵ�.
	public Account(String ownerIn) {
		 owner = ownerIn;
		 balance = 0;
	}

	// ������ �޼ҵ� - ������ �̸��� �����Ѵ�.
	public void setOwner(String newOwner) {
		 // �ڵ带 �ۼ��ϼ���.
		 owner = newOwner;
	}
	// ������ �޼ҵ� - ������ �̸��� ��ȯ�Ѵ�.
	public String getOwner() {
		 // �ڵ带 �ۼ��ϼ���.
		 return owner;
	}
	// ������ �޼ҵ� - �ܾ��� ��ȯ�Ѵ�.
	public int getBalance() {
		 // �ڵ带 �ۼ��ϼ���.
		 return balance;
	}
	// �Ա�: �ܾ��� �ݾ׸�ŭ ������Ű�� �ܾ��� ��ȯ�Ѵ�.
	public int deposit(int amount) {
		 // �ڵ带 �ۼ��ϼ���.
		 balance += amount;
		 return balance;
	}
	// ���: �ܾ��� �ݾ׸�ŭ ���ҽ�Ű�� �ܾ��� ��ȯ�Ѵ�.
	public int withdraw(int amount) {
		 // �ڵ带 �ۼ��ϼ���.
		 balance -= amount;
		 return balance;
	}
	// Account ��ü ������ ���� ���ڿ��� ��ȯ�Ѵ�.
	public String toString() {
		return "������: " + owner + "\n" + "�ܾ�(��): " + balance; 
	}
}

//Main.java
class Main {
	public static void main(String[] args) {
		 Account acc1 = new Account("Lee");
		 acc1.deposit(20000);
		 acc1.withdraw(7000);
		 System.out.println(acc1);
	}
}
