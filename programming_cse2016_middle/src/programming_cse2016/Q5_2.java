package programming_cse2016;

/*
 * Question 5 (Ŭ���� ����, 10��). 
 * [���� ����] �Ʒ��� ��ȭ, ��ȭ, �޷� �� ���� ��ȭ�� �Աݸ� ������ ���� ���� ���� ���α׷��� ���� �ڵ��̴�. 
 * ��ȭ�� �ǹ��ϴ� Currency Ŭ������ ���� ���¸� �ǹ��ϴ� BankAccount Ŭ������ �ִ�. 
 * ������ Currency Ŭ���� ��ǥ�̴�. 
 * 
 * �Ʒ� �����ڵ��� Currency Ŭ���� ���Ǹ� �ϼ��ϰ�, Currency Ŭ������ ����ϴ� BankAccount Ŭ���� ���� �ϼ��϶�. �����, 
 * 1 �޷� = 1000�� 
 * 100�� = 1000�� 
 * �� ȯ���� �����Ѵ�. 
 */

class Currency {
	private double dollars;
	private double won;
 	private double yen;
	
	public Currency(double initial_amount) {
		// initial_amount is given in won 
		// fill here! 
		if(initial_amount < 0) {
			dollars = 0;
			won = 0;
			yen = 0;
		}
		
		this.dollars = initial_amount / 1000;
		this.yen = initial_amount / 10;
		this.won = initial_amount;
	}
	public Currency add(Currency other) {
		Currency newcurr = new Currency(0);
		newcurr.dollars = this.dollars + other.dollars;
		newcurr.won = this.won + other.won;
		newcurr.yen = this.yen + other.yen;
		return newcurr;
	}
	public double getDollars() {
		return this.dollars;
	}
	public double getWon() {
		return this.won;
	}
	public double getYen() {
		return this.yen;
	}
}

class BankAccount {
    private Currency balance;

    public BankAccount(Currency initial_amount) {
    	balance = initial_amount;
    }

    public Currency getBalance() {
    	return this.balance;
    }

    public boolean deposit(Currency money) {
    	boolean result = false;
    	if(money.getWon() < 0) {
    		System.out.println("invalid deposit amount");
    	}
    	else {
    		balance = money.add(balance);
    		result = true;
    	}
    	return true;
    }
}

public class Q5_2 {
  public static void main(String[] args) {
    Currency money = new Currency(100); 
    BankAccount account = new BankAccount(money);
    account.deposit(money);
    System.out.println("balance = " + account.getBalance().getDollars()); // balance = 0.2
  }
}
