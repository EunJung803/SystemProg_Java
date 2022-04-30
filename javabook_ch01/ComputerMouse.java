package javabook_ch01;

/**
 * Mouse 추상 클래스와 IRF 인터페이스를 이용해 RFMouse 클래스를 구현하라.
 * ① Mouse 추상 클래스를 생성하고 move( ), scroll( ) 추상 메소드를 선언한다.
 * ② IRF 인터페이스를 생성하고 wconnect( ), wdisconnect( ) 추상 메소드를 선언한다.
 * ③ Mouse 추상 클래스와 IRF 인터페이스를 구현하는 RFMouse 클래스를 생성한다.
 * ④ 추상 메소드를 실제로 구현한다(System.out.println( )을 이용해 간단한 메시지를 출력한다).
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
		System.out.println("무선 방식 : 블루투스");
	}
	public void move() {
		System.out.println("마우스 움직임");
	}
	public void scroll() {
		System.out.println("마우스 스크롤 동작");
	}
	public void wconnect() {
		System.out.println("마우스 무선 연결됨");
	}
	public void wdisconnect() {
		System.out.println("마우스 무선 연결 끊김");
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