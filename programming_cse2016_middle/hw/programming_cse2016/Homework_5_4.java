package programming_cse2016;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
BankAccount 클래스에 이미 정의되어있는 deposit, withdraw 메소드를 이용하여 문제를 해결하실 수 있습니다.

코드를 보시면 main 메소드가 있는 Main 클래스만 public 으로 정의해주고 있고 
나머지 클래스는 public 없이 정의하고 있다는 것을 아실 수 있습니다. 

이렇게 여러개의 클래스를 파일 하나에 정의하는 것도 가능합니다.
*/


class BankAccount_HW 
{
    private int balance;

    public BankAccount_HW(int initial_amount) {
         if (initial_amount >= 0)
             balance = initial_amount;
         else
             balance = 0;
    }

    public int getBalance() {
        return balance;
    }

    public boolean deposit(int amount) {
        boolean result = false;
        if (amount < 0)
             System.out.println("invalid deposit amount");
         else {
             balance = balance + amount;
             result = true;
         }
         return result;
    }

    public boolean withdraw(int amount) {
        boolean result = false;
        if (amount < 0)
            System.out.println("invalid withdraw amount");
        else if (amount > balance)
            System.out.println("not enough balance");
        else {
            balance = balance - amount;
            result = true;
        }
        return result;
    }
}

class BankReader_HW 
{
    private String input_line = "";
    private Scanner scan;
    public BankReader_HW() {
        scan = new Scanner(System.in);  // Reading from System.in
    } 
    public char readCommand(String message) {
        System.out.print(message);
        input_line = scan.nextLine().toUpperCase();
        return input_line.charAt(0);
    }

    public int readAmount()
    {
        int answer = 0;
        String s = input_line.substring(1, input_line.length());

        if(s.length() > 0) {
            double dollars_cents = Double.valueOf(s);
            answer = (int)(dollars_cents*100);
        } else
            System.out.println("invalid command - input amount: 0");
        return answer;
    }
}

class BankWriter_HW 
{
    private BankAccount_HW bank;
    private String last_transaction = "";

    public BankWriter_HW(BankAccount_HW b) {
        bank = b;
    }

    public String unconvert(int i) {
        return new DecimalFormat("0.00").format(i/100.0);
    }

    public void setTransaction(String message, int amount)
    { 
        last_transaction = message + " " + unconvert(amount);
        System.out.println("transaction: " + last_transaction);
    }

    public void setTransaction(String message)
    { 
        last_transaction = message;
        System.out.println("transaction: " + last_transaction);
    }

}

class AccountController_HW
{
    private BankReader_HW reader; // input view
    private BankAccount_HW primary_account, secondary_account, account;
    private BankWriter_HW primary_writer, secondary_writer, writer;

    public AccountController_HW (BankReader_HW r, BankAccount_HW a1, BankWriter_HW w1, BankAccount_HW a2, BankWriter_HW w2)
    {
        reader = r;
        primary_account = a1;
        primary_writer = w1;
        secondary_account = a2;
        secondary_writer = w2;
        account = primary_account;
        writer = primary_writer;
    }

    public void resetAccount (BankAccount_HW new_account,BankWriter_HW new_writer) {
        account = new_account;
        writer = new_writer;
    }

    public void processTransactions()
    {
        char command = reader.readCommand("Commands (P/S/D/W/T/I/Q): ");
        System.out.println("");
        switch (command) {
            case 'P':
                resetAccount(primary_account, primary_writer);
                break;
            case 'S':
                resetAccount(secondary_account, secondary_writer);
                break;
            case 'Q':
                System.out.println("Quit");
                return;
            case 'D':
                { 
                    int amount = reader.readAmount();
                    if (account.deposit(amount)) writer.setTransaction("deposit $", amount);
                    else writer.setTransaction("deposit error ", amount);
                    break;
                }
            case 'W':
                { 
                    int amount = reader.readAmount();
                    if (account.withdraw(amount)) writer.setTransaction("withdraw $", amount);
                    else writer.setTransaction("withdraw error ", amount);
                    break;
                }
            case 'T':
                // 'T 금액', 활성 계좌에서 비활성 계좌로 금액만큼 이체
            	{
	            	int amount = reader.readAmount();
	                //현재 활성화 된 계좌에서 비활성 계좌로 이체
	                if(account.withdraw(amount)) {
	                    writer.setTransaction("transfer $", amount);
	                    
	                    if(account == primary_account) {
	                        secondary_account.deposit(amount);
	                    }
	                    else primary_account.deposit(amount);
	                    break;
	                }
	                else writer.setTransaction("transfer error");
	                break;
            	}
            case 'I':
                // 'I 이율', 활성 계좌의 금액을 이율만큼 증가
            	/*
            	 * "I 이율" 을 명령어로 입력받아서, 현재 활성화 된 계좌의 금액을 이율(interest)만큼 증가
            	 * - 이율은 0~1 범위의 실수이다.
            	 * - 이율은 소수점 두자리까지만 인정한다. 예, 0.055 => 0.05
            	 * - 이율만큼 증가한다는 것은 (금액 * 이율) 만큼 증가시킨다는 뜻이다.
            	 */
        		{
	            	int amount = reader.readAmount();
	                int interest = amount*account.getBalance()/100;
	
	                if(account.deposit(interest)) {
	                  writer.setTransaction("interest $", interest);
	                }
	                else {
	                  writer.setTransaction("interest error");
	                }
	                break;
	                //if (0 <= amount && amount <= 100) {
	                //    writer.setTransaction("interest $", amount);
	                //    account.deposit((account.getBalance() * amount) / 100);
	                //}
	                //else System.out.println("Interest error");
	            	//break;
            }
            default:
                writer.setTransaction("invalid commpand: " + command);
        }
        // 모든 계좌의 정보를 출력합니다.
        System.out.println("=======================");
        System.out.println("== currently active : " + ((account == primary_account) ? "primary" : "secondary"));
        System.out.println("== primary account : " + primary_writer.unconvert(primary_account.getBalance()));
        System.out.println("== secondary account : " + secondary_writer.unconvert(secondary_account.getBalance()));
        System.out.println("=======================");

        this.processTransactions();
    }
}


public class Homework_5_4 {
  public static void main(String[] args) {
	BankReader_HW reader = new BankReader_HW();
    BankAccount_HW primary_account = new BankAccount_HW(0);
    BankWriter_HW primary_writer = new BankWriter_HW(primary_account);
    BankAccount_HW secondary_account = new BankAccount_HW(0);
    BankWriter_HW secondary_writer = new BankWriter_HW(secondary_account);
    AccountController_HW controller = new AccountController_HW(reader, 
    		primary_account, primary_writer, secondary_account,
            secondary_writer);
    controller.processTransactions();
  }
}

