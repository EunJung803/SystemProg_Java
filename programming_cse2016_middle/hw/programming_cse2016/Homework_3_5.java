package programming_cse2016;

/*
 * 고양이의 행복도를 계산하는 CatHappy 클래스를 작성하라.
 * 
 * CatHappy는 고양이 이름과 예민함, 행복도를 가진다.
 * 
 * 예민함은 고양이의 변하지 않는 특성이다.
 * 
 * 고양이는 행동을 하면 행복도가 변한다.
 * 
 * 고양이의 예민함이 높으면 변하는 행복도가 더 크다.
 * 
 * CatHappy 의 주석문을 참조하여 CatHappy 클래스를 완성하라.
 */

public class CatHappy {
	  // 고양이 이름
	  private String name;
	  // 고양이의 예민한 정도. 1~5 사이의 값을 가진다.
	  private int sensitive;
	  // 고양이의 행복도. 높을수록 행복함을 나타낸다.
	  private double happiness;
	  
	  public CatHappy(String nameIn, int sensitiveIn) {
	    name = nameIn;
	    sensitive = sensitiveIn;
	    // 기본 행복도는 50으로 한다.
	    happiness = 50;
	  }
	  public String toString() {
	    return name + "'s happiness: " + happiness;
	  }
	  
	  // 고양이 이름을 변경한다.
	  public void setName(String newName) {
	    name = newName;
	  }
	  
	  // 고양이 이름을 반환한다.
	  public String getName() {
	    return name;
	  }
	  
	  // 고양이의 감수성을 반환한다.
	  public int getSensitive() {
	    return sensitive;
	  }
	  
	  // 고양이의 행복도를 반환한다.
	  public double getHappiness() {
	    return happiness;
	  }
	  
	  
	  // 행동 함수들 
	  // 놀기: 행복도를 감수성의 반 만큼 증가시킨다.
	  public void play() {
	    happiness += sensitive/2;
	  }
	  
	  
	  // 잠자기: 행복도를 3 증가시키고,감수성의 30% 만큼 더 증가시킨다. 
	  public void sleep() {
	    happiness = happiness + 3 + sensitive*(30/100);
	  }
	  
	  
	  // 지루함: 행복도를 감수성의 4배 만큼 감소시킨다.
	  public void boring() {
	    happiness -= sensitive * 4;
	  }
	  
	  
	  // 그루밍: 행복도를 1 증가시킨다.
	  public void grooming() {
	    happiness++;
	  }
	  
	  
	  // 아무것도 안함: 행복도를 2 감소시킨다.
	  public void nothing() {
	    happiness -= 2;
	  }
}

//Main.java
class Main {
	public static void main(String[] args) {
		 CatHappy cat1 = new CatHappy("Ruby", 3);
		 cat1.play();
		 cat1.boring();
		 cat1.sleep();
		 cat1.grooming();
		 System.out.println(cat1);
	}
}