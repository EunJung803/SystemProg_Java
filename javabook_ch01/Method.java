package javabook_ch01;

public class Method {
	
	public static void zool(int number, String pet, String street) {
		System.out.println(number);
		System.out.println(pet);
		System.out.println(street);
	}
	
	public static void main(String[] args) {
		int a = 11;
		String b = "�ູ��";
		String c = "��⵵ �Ⱦ�� ���ȱ�";
		zool(a, b, c);
	}
}
