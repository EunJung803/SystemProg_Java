package programming_cse2016;

/*
 * 한 도시를 나타내는 City 클래스를 작성하라.
 * 
 * 도시는 이름, 인구와 인구증가율을 가진다.
 * 
 * 도시는 주어진 연도 후의 도시의 예상 인구를 계산하여 반환하는 메소드를 가진다.
 * 
 * City.java 의 주석문을 참조하여 City 클래스의 정의를 완성하라.
 * 
 * 힌트: growthRate 의 단위가 % 인 것에 주의.
 * 
 * Math.pow 함수 사용 (예: Math.pow (3, 2) 은 3^2 인 9 반환).
 * 
 */


public class City { 
	  // 도시 이름
	  private String cityName;
	  // 도시 인구
	  private int population;
	  // 도시의 인구 증가율 (%)
	  private double growthRate;
	  

	  public City(int populationIn, double growthRateIn, String cityNameIn) {
	    population = populationIn;
	    growthRate = growthRateIn; 
	    cityName = cityNameIn;
	  }
	  
	  
	  // 주어진 연도 후의 예상 인구를 계산한다
	  public int computeFuturePopulation(int years) {
	    // 예상 인구
	    double populationAmount = population;
	    // 연도
	    int count = years;
	    // 주어진 연도 후의 예상 인구를 계산한다 
	    /*
	    for(int i = 0; i < count; i++) {
	      population += population*(growthRate/100);
	    }
	    populationAmount = population;*/

	    populationAmount = populationAmount* Math.pow((growthRate/100)+1, count);

	    // 예상 인구를 반환한다
	    return (int)populationAmount;
	      
	  }
	  // 도시 이름을 주어진 값으로 변경한다 
	  public void setName(String newName) {
	      cityName = newName;
	  }
	  // 도시 인구를 주어진 값으로 변경 
	  public void setPopulation(int newPopulation) {
	      population = newPopulation;
	  }
	  // 도시 인구 증가율을 주어진 값으로 변경 
	  public void setGrowthRate(int newGrowthRate) {
	      growthRate = newGrowthRate;
	  }
	  // 도시 이름을 반환한다 
	  public String getName() {
	    return cityName;
	  }
	  // 도시 인구를 반환한다
	  public int getPopulation() {
	    return population;
	  }
	  // 도시 인구 증가율을 반환한다 
	  public double getGrowthRate() {
	    return growthRate;
	  }
	  
}


class Main {
	  
	  public static void main(String[] args) {
	    // 도시 인구, 도시의 인구 증가율 (%), 도시 이름
	    City aCity = new City(500000, 1.5, "Ansan");
	    int newPopulation;
	    int years = 10;
	    newPopulation = aCity.computeFuturePopulation(years);
	    System.out.println(newPopulation);
	  }
	  
}
