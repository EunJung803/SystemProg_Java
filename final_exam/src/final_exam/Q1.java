

interface Key {  String to_string (); }

class IntegerKey implements Key {
	private int key;
	public IntegerKey (int k) { key = k; }
	public String to_string() { 
		return Integer.toString(key); 
	}
}

public class Q1 {
	public static void main(String[] args) {
		Key k1 = new IntegerKey(1);
		System.out.println(k1.to_string()); // "1"  
	}
}

