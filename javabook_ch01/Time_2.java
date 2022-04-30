package javabook_ch01;

public class Time_2 {
	
	public static void printAmerican(int date, int year, String day, String month) {
		System.out.print(day);
		System.out.print(", ");
		System.out.print(month);
		System.out.print(" ");
		System.out.print(date);
		System.out.print(", ");
		System.out.println(year);
	}
	
	public static void printEuropean(int date, int year, String day, String month) {
		System.out.print(day);
		System.out.print(", ");
		System.out.print(date);
		System.out.print(" ");
		System.out.print(month);
		System.out.print(", ");
		System.out.println(year);
	}
	
	public static void main(String[] args) {
		String day = "Thursday";
		String month = "April";
		int date = 23;
		int year = 2020;
		printAmerican(date, year, day, month);
		printEuropean(date, year, day, month);
	}
}
