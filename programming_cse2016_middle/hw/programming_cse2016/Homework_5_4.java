package programming_cse2016;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
BankAccount Ŭ������ �̹� ���ǵǾ��ִ� deposit, withdraw �޼ҵ带 �̿��Ͽ� ������ �ذ��Ͻ� �� �ֽ��ϴ�.

�ڵ带 ���ø� main �޼ҵ尡 �ִ� Main Ŭ������ public ���� �������ְ� �ְ� 
������ Ŭ������ public ���� �����ϰ� �ִٴ� ���� �ƽ� �� �ֽ��ϴ�. 

�̷��� �������� Ŭ������ ���� �ϳ��� �����ϴ� �͵� �����մϴ�.
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
                // 'T �ݾ�', Ȱ�� ���¿��� ��Ȱ�� ���·� �ݾ׸�ŭ ��ü
            	{
	            	int amount = reader.readAmount();
	                //���� Ȱ��ȭ �� ���¿��� ��Ȱ�� ���·� ��ü
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
                // 'I ����', Ȱ�� ������ �ݾ��� ������ŭ ����
            	/*
            	 * "I ����" �� ��ɾ�� �Է¹޾Ƽ�, ���� Ȱ��ȭ �� ������ �ݾ��� ����(interest)��ŭ ����
            	 * - ������ 0~1 ������ �Ǽ��̴�.
            	 * - ������ �Ҽ��� ���ڸ������� �����Ѵ�. ��, 0.055 => 0.05
            	 * - ������ŭ �����Ѵٴ� ���� (�ݾ� * ����) ��ŭ ������Ų�ٴ� ���̴�.
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
        // ��� ������ ������ ����մϴ�.
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

