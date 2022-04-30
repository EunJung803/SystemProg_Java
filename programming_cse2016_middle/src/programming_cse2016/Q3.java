package programming_cse2016;

public class Q3 {
	public static int powerOfTwo(int n) {
		for(int i=0; i<n; i++) {
			if(Math.pow(2, i) == n) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		System.out.println(powerOfTwo(32)); // 5
		System.out.println(powerOfTwo(1024)); // 10
		System.out.println(powerOfTwo(3)); // -1
		System.out.println(powerOfTwo(1000)); // -1
	}

}
