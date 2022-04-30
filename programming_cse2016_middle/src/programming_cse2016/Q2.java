package programming_cse2016;

class Converter {
	
	public static double INCHINCM = 2.54;
	public static int FEETININCH = 12;
	public static int MILEINFEET = 5280;
	public static int METERINCM = 100;
	public static int KMINMETER = 1000;
	
	public static double in2cm(double inches) {
		return inches * INCHINCM;
	}
	
	public static double cm2in(double centimeters) {
		return centimeters / INCHINCM;
	}
	
	public static double ft2m(double feet) {
		return feet * FEETININCH * INCHINCM / METERINCM;
	}
	
	public static double m2ft(double meters) {
		return meters * METERINCM / INCHINCM / FEETININCH;
	}
	
	public static double ml2km(double miles) {
		return miles * MILEINFEET * FEETININCH * INCHINCM / METERINCM / KMINMETER;
	}
	
	public static double km2ml(double kilometers) {
		return kilometers * KMINMETER * METERINCM / INCHINCM / FEETININCH / MILEINFEET;
	}
}

public class Q2 {

	public static void main(String[] args) {
		System.out.println(Converter.in2cm(134)); // 340.36
		System.out.println(Converter.cm2in(340.36)); // 134.0
		System.out.println(Converter.ft2m(345)); // 105.156
		System.out.println(Converter.m2ft(105.156)); // 345.0
		System.out.println(Converter.ml2km(229)); // 368.539776
		System.out.println(Converter.km2ml(368.539776)); // 229.0
	}

}