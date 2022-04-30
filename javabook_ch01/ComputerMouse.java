package javabook_ch01;

/**
 * Mouse �߻� Ŭ������ IRF �������̽��� �̿��� RFMouse Ŭ������ �����϶�.
 * �� Mouse �߻� Ŭ������ �����ϰ� move( ), scroll( ) �߻� �޼ҵ带 �����Ѵ�.
 * �� IRF �������̽��� �����ϰ� wconnect( ), wdisconnect( ) �߻� �޼ҵ带 �����Ѵ�.
 * �� Mouse �߻� Ŭ������ IRF �������̽��� �����ϴ� RFMouse Ŭ������ �����Ѵ�.
 * �� �߻� �޼ҵ带 ������ �����Ѵ�(System.out.println( )�� �̿��� ������ �޽����� ����Ѵ�).
*/

abstract class Mouse {
	public abstract void move();
	public abstract void scroll();
}

interface IRF {
	public void wconnect();
	public void wdisconnect();
}

class RFMouse extends Mouse implements IRF {
	
	public void RFMouse() {
		System.out.println("���� ��� : �������");
	}
	public void move() {
		System.out.println("���콺 ������");
	}
	public void scroll() {
		System.out.println("���콺 ��ũ�� ����");
	}
	public void wconnect() {
		System.out.println("���콺 ���� �����");
	}
	public void wdisconnect() {
		System.out.println("���콺 ���� ���� ����");
	}
}

public class ComputerMouse {
	
	public static void main(String[] args) {
		RFMouse mouse = new RFMouse();
		
		mouse.RFMouse();
		mouse.wconnect();
		mouse.move();
		mouse.scroll();
		mouse.wdisconnect();
	}
}