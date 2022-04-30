package javabook_ch01;
import java.io.*;

public class SwitchExam {
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int iFirstOperand = 0, iSecondOperand = 0, iRetValue = 0;
		char cOperator = 0;
		
		System.out.println("ù��° ���� �Է��ϼ���.");
		iFirstOperand = Integer.parseInt(in.readLine());
		
		System.out.println("�����ڸ� �Է��ϼ���. [+, -, *, /]");
		cOperator = (char)System.in.read();
		System.in.read();
		System.in.read();
		
		System.out.println("�ι�° ���� �Է��ϼ���.");
		iSecondOperand = Integer.parseInt(in.readLine());
		
		switch(cOperator)
		{
			case '+' :
				iRetValue = iFirstOperand + iSecondOperand;
				break;
			case '-' :
				iRetValue = iFirstOperand - iSecondOperand;
				break;
			case '*' :
				iRetValue = iFirstOperand * iSecondOperand;
				break;
			case '/' :
				iRetValue = iFirstOperand / iSecondOperand;
				break;
			default:
				System.out.println("������ ���� �ʽ��ϴ�.");
				System.exit(0);
		}
		System.out.printf("������� %d�Դϴ�.", iRetValue);
		System.exit(0);
	}
}
