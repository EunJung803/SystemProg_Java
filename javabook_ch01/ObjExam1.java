package javabook_ch01;

public class ObjExam1 {
	
	String name;
	
	public void prtName() {
		System.out.println("�̸� : " + name);
	}
	
	/*
	public class Extra4_4 extends ObjExam1 {
		public void prtName {
			System.out.println("Name : " + name + "�Դϴ�.");
		}		
	}
	*/
	
	public static void main(String[] args) {
		ObjExam1 obj1 = new ObjExam1();
		obj1.name = "ȫ�浿";
		obj1.prtName();
	}
}