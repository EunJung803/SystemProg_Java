package programming_cse2016;

/*
 * Question 5 (Ŭ���� ����, 10��). 
 * [���� ����] �Ʒ��� ����, ����, ����, ��� �������� �Աݸ� ������ ���� ���� ���� ���α׷��� ���� �ڵ��̴�. 
 * ������ �ǹ��ϴ� Coins Ŭ������ ���� ���¸� �ǹ��ϴ� BankAccount Ŭ������ �ִ�. ������ Coins Ŭ���� ��ǥ�̴�. 
 * 
 * �Ʒ� �����ڵ��� Coins Ŭ���� ���Ǹ� �ϼ��ϰ�, Coins Ŭ������ ����ϴ� BankAccount Ŭ���� ���� �ϼ��϶�. 
 */


class Coins {
	private int quaters; // 25 cents
	private int dimes; // 10 cents
 	private int nickels; // 5 cents
	private int pennies; // 1 cent
	public Coins(int initial_amount) {
		// initial_amount is given in cents 
		// fill here!
		if(initial_amount < 0) {
			quaters = 0;
			dimes = 0;
			nickels = 0;
			pennies = 0;
		}
		
		this.quaters = initial_amount / 25;
		this.dimes = (initial_amount % 25) / 10;
		this.nickels = ((initial_amount % 25) % 10) / 5;
		this.pennies = (((initial_amount % 25) % 10) % 5);
		

	}
	public Coins add(Coins other) {
		//�ٸ� Coins��ü�� �޾Ƽ� ���ϱ⸦ ������ �� ���ο� Coins��ü ��ȯ
		Coins newcoin = new Coins(0);
		newcoin.quaters = this.quaters + other.quaters;
		newcoin.dimes = this.dimes + other.dimes;
		newcoin.nickels = this.nickels + other.nickels;
		newcoin.pennies = this.pennies + other.pennies;
		return newcoin;
	}
	public int tocents() {
		//��Ʈ������ �ݾ� (����) ��ȯ
		return (quaters*25 + dimes*10 + nickels*5 + pennies);
	}
}

class BankAccount {
    private Coins balance;

    public BankAccount(Coins initial_amount) {
    	balance = initial_amount;
    }
    public Coins getBalance() {
    	return this.balance;
    }
    public boolean deposit(Coins coins) {
    	boolean result = false;
    	if(coins.tocents() < 0) {
    		System.out.println("invalid deposit amount");
    	}
    	else {
    		balance = coins.add(balance);
    		result = true;
    	}
    	return true;
    }
}

public class Q5_1 {
  public static void main(String[] args) {
    Coins coins = new Coins(100); 
    BankAccount account = new BankAccount(coins);
    account.deposit(coins);
    System.out.println("balance = " + account.getBalance().tocents()); // balance = 200
  }
}

