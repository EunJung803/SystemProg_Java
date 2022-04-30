package programming_cse2016;

/*
 * Question 5 (클래스 조합, 10점). 
 * [국제 은행] 아래는 원화, 엔화, 달러 세 가지 통화로 입금만 가능한 은행 계좌 관리 프로그램의 뼈대 코드이다. 
 * 통화를 의미하는 Currency 클래스와 은행 계좌를 의미하는 BankAccount 클래스가 있다. 
 * 다음은 Currency 클래스 명세표이다. 
 * 
 * 아래 뼈대코드의 Currency 클래스 정의를 완성하고, Currency 클래스를 사용하는 BankAccount 클래스 또한 완성하라. 참고로, 
 * 1 달러 = 1000원 
 * 100엔 = 1000원 
 * 의 환율을 적용한다. 
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
