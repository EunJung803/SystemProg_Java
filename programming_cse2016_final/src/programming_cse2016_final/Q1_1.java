package programming_cse2016_final;

import java.io.*;

public class Q1_1 {
	
	public static void main(String[] args) throws IOException {
		PrintWriter outfile = new PrintWriter(new FileWriter("test"));
		outfile.println("Hello world!");
		outfile.close();
	}	
}
