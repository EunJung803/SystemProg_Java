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
		System.out.println("예상되는 숫자를 입력하세요. ");
		iInputNum = Integer.parseInt(in.readLine());
		iNowCnt ++;
		
		if(iInputNum > iNumber) {
			System.out.println("더 작은 수");
		}
		else if(iInputNum < iNumber) {
			System.out.println("더 큰 수");
		}
		
		if(iNowCnt == 10) {
			System.out.println("10회를 넘겼습니다. 실패했습니다.");
			break;
		}
		
		System.out.println((10-iNowCnt) + "번 남았습니다.");
		
			}
	if(iNowCnt < 10)
		System.out.println("축하합니다. 숨겨진 숫자는 " + iNumber + "입니다.");
	}
}
