package javabook_ch01;

public class Date {

	public static void main(String[] args) { 
		String day = "Wednesday";
		int date = 9;
		String month = "April";
		int year = 2020;
		
		System.out.print("American format:\n");
		System.out.print(day);
		System.out.print(", ");
		System.out.print(month);
		System.out.print(" ");
		System.out.print(date);
		System.out.print(", ");
		System.out.print(year);
		
		System.out.print("\nEuropean format:\n");
		System.out.print(day);
		System.out.print(" ");
		System.out.print(date);
		System.out.print(" ");
		System.out.print(month);
		System.out.print(" ");
		System.out.println(year);
	}

}
