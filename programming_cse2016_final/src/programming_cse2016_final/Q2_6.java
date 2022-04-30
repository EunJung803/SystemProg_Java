package programming_cse2016_final;

class BankAccount {
	private int balance;
	public BankAccount(int m) {
		if (m >= 0) balance = m;
		else balance = 0;
	}
	public int getBalance() { return balance; }
	public boolean withdraw(int amount) {
		if (amount < 0) return false;
		else if (amount > balance) return false;
		else { balance -= amount; return true; }
	}
}

class BankManager {
	private BankAccount[] accounts;
	public BankManager(int initial_size) {
	// fill here!
		accounts = new BankAccount[initial_size];
	}
	
	public void addAccount(BankAccount account) {
	// fill here!
		int i;
		for(i=0; i<accounts.length; i++) {	
			if(accounts[i] == null) {	//빈공간에
				accounts[i] = account;	//집어넣기
				break;
			}
		}
		if(i == accounts.length) { //자리가 없다면, 크기확장
			BankAccount[] accounts_new = new BankAccount[accounts.length * 2];
			for (i = 0; i < accounts.length; i++)
			accounts_new[i] = accounts[i];
			accounts_new[i] = account;
			accounts = accounts_new;
		}
	}
	
	public void takeMaintenanceFee() {
	// fill here!
		for(int i=0; i<accounts.length; i++) {
			if(accounts[i] != null) {	//계좌가 존재함
				boolean result = accounts[i].withdraw(1000);	//수수료 1000원 차감
				if(result == false) {	//1000원보다 적은 금액을 가지고 있는 계좌의 결과 --> false
					accounts[i] = null;	//삭제
				}
			}
		}
	}
	
	public int countAccounts() {
	// fill here!
		int count = 0;
		for(int i=0; i<accounts.length; i++) {
			if(accounts[i] != null) {	//존재하는 계좌 수 세기
				count++;
			}
		}
		return count;
	}
}

public class Q2_6 {
	public static void main(String[] args) {
		BankManager bm = new BankManager(10);
		BankAccount b1 = new BankAccount(100);
		BankAccount b2 = new BankAccount(1100);
		BankAccount b3 = new BankAccount(3000);
		BankAccount b4 = new BankAccount(4000);
		bm.addAccount(b1); bm.addAccount(b2);
		bm.addAccount(b3); bm.addAccount(b4);
		bm.takeMaintenanceFee();
		System.out.println(bm.countAccounts()); // 3
		bm.takeMaintenanceFee();
		System.out.println(bm.countAccounts()); // 2
	}
}