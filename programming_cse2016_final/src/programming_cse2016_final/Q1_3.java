package programming_cse2016_final;

public class Q1_3 {
	public static double string2double(String s) {
		// fill here!
		try {
			double d_s = Double.parseDouble(s);
			return d_s;
		}
		catch(NumberFormatException e) {
			return -2;
		}
		catch(NullPointerException e) {
			return -1;
		}
	}
	public static void main(String[] args) {
		System.out.println(string2double(null)); // -1.0
		System.out.println(string2double("abc")); // -2.0
		System.out.println(string2double("3.8")); // 3.8
	}
}
