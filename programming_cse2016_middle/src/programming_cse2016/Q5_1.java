package programming_cse2016;

/*
 * Question 5 (클래스 조합, 10점). 
 * [동전 은행] 아래는 쿼터, 다임, 니켈, 페니 동전으로 입금만 가능한 은행 계좌 관리 프로그램의 뼈대 코드이다. 
 * 동전을 의미하는 Coins 클래스와 은행 계좌를 의미하는 BankAccount 클래스가 있다. 다음은 Coins 클래스 명세표이다. 
 * 
 * 아래 뼈대코드의 Coins 클래스 정의를 완성하고, Coins 클래스를 사용하는 BankAccount 클래스 또한 완성하라. 
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
		//다른 Coins객체를 받아서 더하기를 수행한 후 새로운 Coins객체 반환
		Coins newcoin = new Coins(0);
		newcoin.quaters = this.quaters + other.quaters;
		newcoin.dimes = this.dimes + other.dimes;
		newcoin.nickels = this.nickels + other.nickels;
		newcoin.pennies = this.pennies + other.pennies;
		return newcoin;
	}
	public int tocents() {
		//센트단위로 금액 (정수) 반환
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

