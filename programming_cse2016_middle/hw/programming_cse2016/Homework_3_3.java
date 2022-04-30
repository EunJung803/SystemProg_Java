package programming_cse2016;

//Television.java
//�ڷ����� ��ü�� ǥ��
public class Television {
	private String BrandName;  // �귣��� 
	private boolean Powered = false;  // �����ִ°�? 
	private int Channel = 1;  // ���� ä�� 
	int Volume = 0;  // ���� ���� 
	
	// ������ 
	public Television() {
	 // �ƹ��͵� ����. 
	}
	
	public String toString() {
	 String str = "Brandname: " + BrandName + "\n";
	 str = str + "IsPowered: " + Powered + "\n";
	 str = str + "Channel: " + Channel + "\n";
	 str = str + "Volume: " + Volume;
	 return str;
	}
	
	// ���� �Լ����� �����ϼ���. 
	// getChannel : ���� ä���� ��ȯ�Ѵ�. 
	// getBrandName : �귣����� ��ȯ�Ѵ�. 
	// getVolume : ���� ������ ��ȯ�Ѵ�. 
	// getPower : ���� ���� ���¸� ��ȯ�Ѵ�.
	
	public int getChannel() {
	 return Channel;
	}
	
	public String getBrandName() {
	 return BrandName;
	}
	
	public int getVolume() {
	 return Volume;
	}
	
	public boolean getPower() {
	 return Powered;
	}
	
	// TV �� ������ �־��� ������ ����. 
	public void setPowered(boolean NewPowered) {
	 Powered = NewPowered; 
	}
	
	// ���� �Լ����� �����ϼ���. 
	// setChannel : TV�� ä�� ��ȣ�� �־��� ������ ����. 
	public int setChannel(int new_channel) {
	 Channel = new_channel;
	 return Channel;
	}
	// setBrandName : TV�� �귣����� �־��� ������ ����. 
	public String setBrandName(String new_brand) {
	 BrandName = new_brand;
	 return BrandName;
	}
	// setVolume : TV�� ������ �־��� ������ ����. 
	public int setVolume(int new_volume) {
	 Volume = new_volume;
	 return Volume;
	}
	// incrementChannel : TV�� ä���� 1��ŭ ������Ų��. 
	public int incrementChannel() {
	 Channel = getChannel();
	 Channel += 1;
	 return Channel;
	}
	// decrementChannel : TV�� ä���� 1��ŭ ���ҽ�Ų��. 
	public int decrementChannel() {
	 Channel = getChannel();
	 Channel -= 1;
	 return Channel;
	}
	// incrementVolume : TV�� ������ 1��ŭ ������Ų��. 
	public int incrementVolume() {
	 Volume = getVolume();
	 Volume += 1;
	 return Volume;
	}
	// decrementVolume : TV�� ������ 1��ŭ ���ҽ�Ų��. 
	public int decrementVolume() {
	 Volume = getVolume();
	 Volume -= 1;
	 return Volume;
	}
}

class Main {
	  public static void main(String[] args) {
	    Television tv1 = new Television(); 
	    tv1.setBrandName("samsung");
	    tv1.setPowered(true);
	    tv1.setVolume(10);
	    tv1.setChannel(11);
	    System.out.println(tv1);
	  }
}
