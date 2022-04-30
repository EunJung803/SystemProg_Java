package javabook_ch01;

/**
 * ���� ����
 * �� ���� Ŭ������ ����� Shape Ŭ������ �����ϰ�, calcArea( ) �޼ҵ带 ����� ������ �������� �ʰ�Shape:calcArea( ) ���࡯�޽����� ����ϵ��� �����Ѵ�.
 * double d1, d2�� �����ϰ� ���� 20, 30�� �Ҵ��Ѵ�.
 * �� Shape Ŭ������ ��ӹ޴� Rectangle�� Circle Ŭ������ �����(���� �޼ҵ带 ������ �����Ѵ�).
 * �� calcArea �޼ҵ带 �������̵����� �� �簢���� ���� ���̸� ���� �� �ֵ��� �޼ҵ带 �����Ѵ�. ������ d1, d2 �� ����Ѵ�. ������ ������ ����.
 * �簢���� ���� = ����(d1) * ����(d2)
 * ���� ���� = ������(d1) * ������(d1) * 3.14
*/

public class Shape {
	
	double d1 = 20;
	double d2 = 30;
	
	public void calcArea() {
		System.out.println("Shape:clacArea() ����");
	}
	
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		Circle circle = new Circle();
		
		rectangle.calcArea();
		circle.calcArea();
	}
}

class Rectangle extends Shape{

	public void calcArea() {
		double area = d1 * d2;
		
		System.out.println("== Rectangle : calcArea() ==");
		System.out.println("�簢���� ���� : " + area);
	}
}

class Circle extends Shape{
	
	public void calcArea() {
		double area = d1 * d1 * (3.14);
		double area2 = Math.pow((d1+d2), 2) * (3.14);
		
		System.out.println("== Circle : calcArea() ==");
		System.out.println("���� ���� : " + area);
		System.out.println("== Circle : calcArea(double d1) ==");
		System.out.println("���� ���� : " + area2);
	}
}