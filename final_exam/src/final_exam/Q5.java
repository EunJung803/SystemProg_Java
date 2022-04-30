

abstract class BankAccount {
	protected int balance; 
	
	public BankAccount(int initial_amount) {
		if (initial_amount < 0) initial_amount = 0; 
		balance = initial_amount; 
	}
	
	public int getBalance() { return balance; }
	
	public boolean deposit(int amount) {
		if (amount < 0) return false; 
		else {
			balance += amount; 
			return true;
		}
	}
	public abstract boolean withdraw (int amount); 
}

class CheckingAccount extends BankAccount {
	private BankAccount[] accounts;
	
	public CheckingAccount(int amount) {
		super(amount);
	}
	
	public int getBalance() { return balance; }
	
	public boolean deposit(int amount) {
		if (amount < 0) return false; 
		else {
			balance += amount; 
			return true;
		}
	}
	public boolean withdraw(int amount) {
			if (amount < 0) return false;
			else if (amount > balance) return false;
			else { balance -= amount; return true; }
	}
}

class PensionAccount extends BankAccount {
	// fill here!
	private BankAccount[] accounts;
	
	public PensionAccount(int amount) {
		super(amount);
	}
	
	public int getBalance() { return balance; }
	
	public boolean deposit(int amount) {
		if (amount < 0) return false; 
		else {
			balance += amount; 
			return true;
		}
	}
	public boolean withdraw(int amount) {
		if (amount < 0) 
			return false;
		else if (amount > balance) 
			balance = 0;
			return true;
	}
}

class MinusAccount extends BankAccount {
	// fill here!
	private BankAccount[] accounts;
	
	public MinusAccount(int amount) {
		super(amount);
	}
	
	public int getBalance() { return balance; }
	
	public boolean deposit(int amount) {
		if (amount < 0) return false; 
		else {
			balance += amount; 
			return true;
		}
	}
	public boolean withdraw(int amount) {
		if (amount < 0) 
			return false;
		else if (amount > balance) 
			balance -= amount;
			return true;
	}
}

public class Q5 {

	public static void main(String[] args) {
		BankAccount[] accounts = new BankAccount[3]; 
		accounts[0] = new CheckingAccount(100);
		accounts[1] = new PensionAccount(100);
		accounts[2] = new MinusAccount(100);
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].withdraw(200);
			System.out.println("account " + i + ": " + accounts[i].getBalance());
			// account 0: 100
			// account 1: 0
			// account 2: -100
		}
	}
}
