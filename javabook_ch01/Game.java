package javabook_ch01;

import java.io.*;
import java.util.Scanner;

public class Game {
	public static void main(String[] args) throws
	IOException {
		BufferedReader in = new BufferedReader
				(new InputStreamReader(System.in));
	
	int iNumber = 123;
	int iInputNum = 0;
	int iNowCnt = 0;
	
	while(iInputNum != iNumber) {
		System.out.println("����Ǵ� ���ڸ� �Է��ϼ���. ");
		iInputNum = Integer.parseInt(in.readLine());
		iNowCnt ++;
		
		if(iInputNum > iNumber) {
			System.out.println("�� ���� ��");
		}
		else if(iInputNum < iNumber) {
			System.out.println("�� ū ��");
		}
		
		if(iNowCnt == 10) {
			System.out.println("10ȸ�� �Ѱ���ϴ�. �����߽��ϴ�.");
			break;
		}
		
		System.out.println((10-iNowCnt) + "�� ���ҽ��ϴ�.");
		
			}
	if(iNowCnt < 10)
		System.out.println("�����մϴ�. ������ ���ڴ� " + iNumber + "�Դϴ�.");
	}
}
