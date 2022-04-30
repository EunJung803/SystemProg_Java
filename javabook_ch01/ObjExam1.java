package javabook_ch01;

public class ObjExam1 {
	
	String name;
	
	public void prtName() {
		System.out.println("이름 : " + name);
	}
	
	/*
	public class Extra4_4 extends ObjExam1 {
		public void prtName {
			System.out.println("Name : " + name + "입니다.");
		}		
	}
	*/
	
	public static void main(String[] args) {
		ObjExam1 obj1 = new ObjExam1();
		obj1.name = "홍길동";
		obj1.prtName();
	}
}