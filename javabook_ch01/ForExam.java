package javabook_ch01;

import java.io.*;

public class ForExam {
	
	public static void main(String[] args) throws IOException {
		int iLowValue = 1, iHighValue = 100,
			iCount = 0, iRetValue = 0;
		
		while (iCount <= 100) {
			iRetValue += iCount;
			iCount ++;	
		} System.out.println("1에서 100까지 더한 값 " + iRetValue);
		
		//for(iCount = 1; iCount <= 100; iCount++) {
		//	iRetValue += iCount;
		//}
		//System.out.println("1에서 100까지 더한 값 " + iRetValue);
		
		while (iCount < 50) {
			iRetValue += (iLowValue + iHighValue);
			iLowValue++;
			iHighValue--;
		} System.out.println("1에서 100까지 더한 값 " + iRetValue);
		
		//for(iCount = 0, iRetValue = 0; iCount < 50; iCount++) {
		//	iRetValue += (iLowValue + iHighValue);
		//	iLowValue++;
		//	iHighValue--;
		//}
		//System.out.println("1에서 100까지 더한 값 " + iRetValue);
	}
	
}