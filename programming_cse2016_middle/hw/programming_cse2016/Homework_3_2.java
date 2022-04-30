package programming_cse2016;

/*
 * �� ���ø� ��Ÿ���� City Ŭ������ �ۼ��϶�.
 * 
 * ���ô� �̸�, �α��� �α��������� ������.
 * 
 * ���ô� �־��� ���� ���� ������ ���� �α��� ����Ͽ� ��ȯ�ϴ� �޼ҵ带 ������.
 * 
 * City.java �� �ּ����� �����Ͽ� City Ŭ������ ���Ǹ� �ϼ��϶�.
 * 
 * ��Ʈ: growthRate �� ������ % �� �Ϳ� ����.
 * 
 * Math.pow �Լ� ��� (��: Math.pow (3, 2) �� 3^2 �� 9 ��ȯ).
 * 
 */


public class City { 
	  // ���� �̸�
	  private String cityName;
	  // ���� �α�
	  private int population;
	  // ������ �α� ������ (%)
	  private double growthRate;
	  

	  public City(int populationIn, double growthRateIn, String cityNameIn) {
	    population = populationIn;
	    growthRate = growthRateIn; 
	    cityName = cityNameIn;
	  }
	  
	  
	  // �־��� ���� ���� ���� �α��� ����Ѵ�
	  public int computeFuturePopulation(int years) {
	    // ���� �α�
	    double populationAmount = population;
	    // ����
	    int count = years;
	    // �־��� ���� ���� ���� �α��� ����Ѵ� 
	    /*
	    for(int i = 0; i < count; i++) {
	      population += population*(growthRate/100);
	    }
	    populationAmount = population;*/

	    populationAmount = populationAmount* Math.pow((growthRate/100)+1, count);

	    // ���� �α��� ��ȯ�Ѵ�
	    return (int)populationAmount;
	      
	  }
	  // ���� �̸��� �־��� ������ �����Ѵ� 
	  public void setName(String newName) {
	      cityName = newName;
	  }
	  // ���� �α��� �־��� ������ ���� 
	  public void setPopulation(int newPopulation) {
	      population = newPopulation;
	  }
	  // ���� �α� �������� �־��� ������ ���� 
	  public void setGrowthRate(int newGrowthRate) {
	      growthRate = newGrowthRate;
	  }
	  // ���� �̸��� ��ȯ�Ѵ� 
	  public String getName() {
	    return cityName;
	  }
	  // ���� �α��� ��ȯ�Ѵ�
	  public int getPopulation() {
	    return population;
	  }
	  // ���� �α� �������� ��ȯ�Ѵ� 
	  public double getGrowthRate() {
	    return growthRate;
	  }
	  
}


class Main {
	  
	  public static void main(String[] args) {
	    // ���� �α�, ������ �α� ������ (%), ���� �̸�
	    City aCity = new City(500000, 1.5, "Ansan");
	    int newPopulation;
	    int years = 10;
	    newPopulation = aCity.computeFuturePopulation(years);
	    System.out.println(newPopulation);
	  }
	  
}
