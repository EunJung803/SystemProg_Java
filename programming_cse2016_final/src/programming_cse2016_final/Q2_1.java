package programming_cse2016_final;

import java.io.*;

public class Q2_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader infile = new BufferedReader(new FileReader("test"));
		while (infile.ready()) {
			System.out.println(infile.readLine());
		}
		infile.close();
	}
}