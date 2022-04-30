package javabook_ch01;

public class Method {
	
	public static void zool(int number, String pet, String street) {
		System.out.println(number);
		System.out.println(pet);
		System.out.println(street);
	}
	
	public static void main(String[] args) {
		int a = 11;
		String b = "행복이";
		String c = "경기도 안양시 동안구";
		zool(a, b, c);
	}
}
