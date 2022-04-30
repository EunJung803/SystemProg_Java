

public class Q2 {
	public static int getSum(Object[] arr) {
		int sum = 0;
		int a_int = 0;
		// fill here!
		for(int i=0; i<arr.length; i++) {
			try {
				a_int = Integer.parseInt((String) arr[i]);
				sum += a_int;
			}
			catch(RuntimeException e){
			}
		}

		return sum;
	}
	public static void main(String[] args) {
		Object[] a = new Object[5];
		a[0] = 10;
		a[1] = "a";
		a[2] = 1.1;
		a[3] = 2; 
		a[4] = "b";
		System.out.println(getSum(a)); // 12
	}
}
