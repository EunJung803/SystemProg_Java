package programming_cse2016;

/*
 * Question 2 (클래스 정의, 5점). 삼각형을 나타내는 Triangle 이라는 클래스를 작성하라. 
 * 삼각형은 세변의 길이(양수)를 가진다. 다음 클래스 명세표를 참조하라. 
 */


class Triangle {
	private int side1;
	private int side2;
	private int side3;
	
	public Triangle(int v1, int v2, int v3) {
		if(v1 > v2 && v1 > v3) {
			side3 = v1;
			if(v2 > v3) {
				side2 = v2;
				side1 = v3;
			}
			else {
				side2 = v3;
				side1 = v2;
			}
		}
		else if(v2 > v1 && v2 > v3) {
			side3 = v2;
			if(v1 > v3) {
				side2 = v1;
				side1 = v3;
			}
			else {
				side2 = v3;
				side1 = v1;
			}
		}
		else {
			side3 = v3;
			if(v2 > v1) {
				side2 = v2;
				side1 = v1;
			}
			else {
				side2 = v1;
				side1 = v2;
			}
		}
	}
	public boolean isRightAngled() {
		double result = Math.pow(side1, 2) + Math.pow(side2, 2);
		if((int)result == (int)Math.pow(side3, 2)) {
			return true;
		}
		else return false;
	}
	public boolean isTwoEqualSided() {
		if(side1 == side2 || side2 == side3 || side3 == side1) {
			return true;
		}
		else return false;
	}
	
	public boolean isAllEqualSided() {
		if(side1 == side2 && side2 == side3 && side3 == side1) {
			return true;
		}
		else return false;
	}
	
	public boolean isAcute() {
		int result = (int)Math.pow(side1, 2) + (int)Math.pow(side2, 2);
		if(result > Math.pow(side3, 2)) {
			return true;
		}
		else return false;
	}
	public boolean isObtuse() {
		int result = (int)Math.pow(side1, 2) + (int)Math.pow(side2, 2);
		if(result < Math.pow(side3, 2)) {
			return true;
		}
		else return false;
	}
}
public class Q2_1 {
	public static void main(String[] args) {
                        // test code
		Triangle t1 = new Triangle(3,5,4); 
		System.out.println(t1.isRightAngled()); // true
		System.out.println(t1.isObtuse()); // false
		System.out.println(t1.isAllEqualSided()); // false
		Triangle t2 = new Triangle(10,3,4); 
		System.out.println(t2.isRightAngled()); // false
		System.out.println(t2.isObtuse()); // true
		System.out.println(t2.isAllEqualSided()); // false
	}
}

