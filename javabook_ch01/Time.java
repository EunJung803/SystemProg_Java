package javabook_ch01;

public class Time {
	private int hour;
	private int minute;
	private double second;
	
	public Time() {
		this.hour = 0;
		this.minute = 0;
		this.second = 0.0;
	}
	
	public Time(int hour, int minute, double second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public static void main(String[] args) {
		Time time1 = new Time(9, 30, 0.0);
		Time time2 = time1;
		Time time3 = new Time(9, 30, 0.0);
		
		System.out.println(time1.equals(time2));
		System.out.println(time1 == time3);
		System.out.println(time1.equals(time3));
		System.out.println(time1 == time2);
	}
}
