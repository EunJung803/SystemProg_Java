package programming_cse2016;

class Mortgage {
	
	private double monthly_payment;
	private double remaining_principal;
	private double interest; 
	
	public Mortgage(double p, double i, int y) {

		if(p < 0) {
			this.remaining_principal = 0;
		}
		else {
			this.remaining_principal = p;
		}
		
		if(i > 1) {
			this.interest = 1;
		}
		else {
			this.interest = i;
		}
		
		if(y < 1) {
			y = 1;
		}
		
		this.monthly_payment = (Math.pow((1+i), y)*p*i) / (Math.pow((1+i), y)-1) / 12;
		
	}
	
	public void makeMonthlyPayment() {
		this.remaining_principal = (1 + this.interest/12) * this.remaining_principal - this.monthly_payment;
	}
	
	public double getRemainingPrincipal() {
		return this.remaining_principal;
	}
}

public class Q5 {

	public static void main(String[] args) {
		Mortgage loan = new Mortgage(10000, 0.05, 10); 
		loan.makeMonthlyPayment();
		loan.makeMonthlyPayment();
		System.out.println(loan.getRemainingPrincipal()); // 9867.21631750561

	}
}

