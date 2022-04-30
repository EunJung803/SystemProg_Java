package javabook_ch01;

/**
 * 예제 설명
 * ① 슈퍼 클래스로 사용할 Shape 클래스를 생성하고, calcArea( ) 메소드를 만들되 내용은 구현하지 않고‘Shape:calcArea( ) 실행’메시지만 출력하도록 구현한다.
 * double d1, d2를 선언하고 각각 20, 30을 할당한다.
 * ② Shape 클래스를 상속받는 Rectangle과 Circle 클래스를 만든다(메인 메소드를 갖도록 구현한다).
 * ③ calcArea 메소드를 오버라이딩시켜 각 사각형과 원의 넓이를 구할 수 있도록 메소드를 구현한다. 변수는 d1, d2 를 사용한다. 공식은 다음과 같다.
 * 사각형의 넓이 = 가로(d1) * 세로(d2)
 * 원의 넓이 = 반지름(d1) * 반지름(d1) * 3.14
*/

public class Shape {
	
	double d1 = 20;
	double d2 = 30;
	
	public void calcArea() {
		System.out.println("Shape:clacArea() 실행");
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
		System.out.println("사각형의 넓이 : " + area);
	}
}

class Circle extends Shape{
	
	public void calcArea() {
		double area = d1 * d1 * (3.14);
		double area2 = Math.pow((d1+d2), 2) * (3.14);
		
		System.out.println("== Circle : calcArea() ==");
		System.out.println("원의 넓이 : " + area);
		System.out.println("== Circle : calcArea(double d1) ==");
		System.out.println("원의 넓이 : " + area2);
	}
}