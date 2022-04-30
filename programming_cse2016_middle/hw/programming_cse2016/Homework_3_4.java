package programming_cse2016;

/*
 * 오른쪽 뼈대프로그램은 두 파일로 구성이되어있다. 
 * Main.java와 Employee.java. 
 * 
 * Main.java 에 정의되어있는 Main 클래스안에서는 
 * Employee.java 에 정의되어있는 Employee 클래스의 객체를 만들어 사용한다. 
 * 
 * Employee.java에는 대학교의 직원을 나타내는 Employee 클래스의 뼈대가 작성되어 있다. 
 * 직원은 속성값으로 이름, 번호와 나이를 가진다. 
 * 직원은 이름, 번호와 나이를 각각 알려 주는 메소드들을 가지고 있어야한다. 
 * 또한 직원은 이름, 번호, 나이를 각각 주어진 값으로 변경할 수 있는 메소드들 또한 가지고 있어야 한다. 
 * 이를 위해 Employee.java 파일의 다음 메소드들의 내용을 작성하세요.
 * 
 */

//Employee.java 
//직원을 나타낸다. 
public class Employee {
	private String name; // 이름 
	private int number; // 번호 
	private int age; // 나이 
	
	// 새로운 Employee 객체를 생성한다  
	public Employee() {
	 //아무것도 안함
	}
	
	// 접근자 메소드 - 이름을 반환한다. 
	public String getName() {
	 return name; 
	}
	
	// 접근자 메소드 - 번호를 반환한다. 
	public int getNumber() {
	 return number;
	}
	
	// 접근자 메소드 - 나이를 반환한다. 
	public int getAge() {
	 return age;
	}
	
	// 현 Employee 객체의 정보에 대한 문자열을 반환한다. 
	public String toString() {
	 return "Name: " + name + "\n" + "Number: " + number + "\n" + "Age: " + age;
	}
	
	// 변경자 메소드 - 이름을 주어진 값으로 변경한다. 
	public void setName(String Name) {
	 name = Name;
	}
	
	// 변경자 메소드 - 번호를 주어진 값으로 변경한다. 
	public void setNumber(int Number) {
	 number = Number;
	}
	
	// 변경자 메소드 - 나이를 주어진 값으로 변경한다. 
	public void setAge(int Age) {
	 age = Age;
	}
}


//Main.java 
//Employee 객체를 만들어 사용한다.   
public class Main {
	public static void main(String[] args) {
		 Employee emp1 = new Employee();
		 emp1.setName("lee");
		 emp1.setNumber(100);
		 emp1.setAge(25); 
		 System.out.println(emp1); 
	}
}
