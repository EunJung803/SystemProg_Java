package programming_cse2016;

//Television.java
//텔레비전 객체를 표현
public class Television {
	private String BrandName;  // 브랜드명 
	private boolean Powered = false;  // 켜져있는가? 
	private int Channel = 1;  // 현재 채널 
	int Volume = 0;  // 현재 볼륨 
	
	// 생성자 
	public Television() {
	 // 아무것도 안함. 
	}
	
	public String toString() {
	 String str = "Brandname: " + BrandName + "\n";
	 str = str + "IsPowered: " + Powered + "\n";
	 str = str + "Channel: " + Channel + "\n";
	 str = str + "Volume: " + Volume;
	 return str;
	}
	
	// 다음 함수들을 정의하세요. 
	// getChannel : 현재 채널을 반환한다. 
	// getBrandName : 브랜드명을 반환한다. 
	// getVolume : 현재 볼륨을 반환한다. 
	// getPower : 현재 전원 상태를 반환한다.
	
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
	
	// TV 의 전원을 주어진 값으로 변경. 
	public void setPowered(boolean NewPowered) {
	 Powered = NewPowered; 
	}
	
	// 다음 함수들을 정의하세요. 
	// setChannel : TV의 채널 번호를 주어진 값으로 변경. 
	public int setChannel(int new_channel) {
	 Channel = new_channel;
	 return Channel;
	}
	// setBrandName : TV의 브랜드명을 주어진 값으로 변경. 
	public String setBrandName(String new_brand) {
	 BrandName = new_brand;
	 return BrandName;
	}
	// setVolume : TV의 볼륨을 주어진 값으로 변경. 
	public int setVolume(int new_volume) {
	 Volume = new_volume;
	 return Volume;
	}
	// incrementChannel : TV의 채널을 1만큼 증가시킨다. 
	public int incrementChannel() {
	 Channel = getChannel();
	 Channel += 1;
	 return Channel;
	}
	// decrementChannel : TV의 채널을 1만큼 감소시킨다. 
	public int decrementChannel() {
	 Channel = getChannel();
	 Channel -= 1;
	 return Channel;
	}
	// incrementVolume : TV의 볼륨을 1만큼 증가시킨다. 
	public int incrementVolume() {
	 Volume = getVolume();
	 Volume += 1;
	 return Volume;
	}
	// decrementVolume : TV의 볼륨을 1만큼 감소시킨다. 
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
