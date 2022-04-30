package programming_cse2016;

/*
 * ������ ������ �ٹ��򰡵���� �޾� �� ������ ����Ͽ� ��ȯ�ϴ� �Լ��� �ۼ��ϼ���.
 *
 * ������ �ٹ��򰡵���� ��� ����� �ҷ� �� �ϳ��Դϴ�.
 * 
 * 1 (���) ����� ���� ������ ������ 6% �λ�
 * 
 * 2 (����) ����� ���� ������ ������ 4% �λ�
 * 
 * 3 (�ҷ�) ����� ���� ������ ������ 2% �λ�
 * 
 * Employee Ŭ���� �ڵ忡�� applyincreaseRate �Լ��� ���빰�� �ۼ��ϼ���.
 * 
 * ���� ��� ����� main �Լ��� �ּ����� �ֽ��ϴ�.
 * 
 */

public class Employee {
	private Double salary;	// ����
	private int evalGrade;	// �ٹ��򰡵��
	
	public Employee(double salary, int evalGrade) {
		this.salary = salary;
		this.evalGrade = evalGrade;
	}
	
	// get �Լ� ����
	public double getSalary() {
		return salary;
	}
	
	public int getEvalGrade() {
		return evalGrade;
	}
	
	// set �Լ� ����
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void setEvalGrade(int evalGrade) {
		this.evalGrade = evalGrade;
	}
	
	public void set(double salary, int evalGrade) {
		this.salary = salary;
		this.evalGrade = evalGrade;
	}
	
	// �ٹ��򰡵�޿� ���� ���� ������ �λ��Ű��, ���� �λ� �ݾ��� ��ȯ�Ѵ�.
	public Double applyIncreaseRate() {
		// ���⿡ �ڵ带 �����ϼ���
    if(getEvalGrade() == 1) {
      setSalary(getSalary() + (getSalary() * 0.06));
    }
    else if(getEvalGrade() == 2) {
      setSalary(getSalary() + (getSalary() * 0.04));
    }
    else{
      setSalary(getSalary() + (getSalary() * 0.02));
    }
		return salary;
	}
}

class Main {
	  public static void main(String[] args) {
			// ���⿡ test code �� �ۼ��ؼ� �׽�Ʈ�غ� �� �ֽ��ϴ�.
			// ��:
			Employee emp = new Employee(2400.0, 3);
			System.out.println(emp.applyIncreaseRate());	// 2544.0 ���
	  }
	}