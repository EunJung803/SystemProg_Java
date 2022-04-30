

import java.util.*;

public class Q4 {

	public static String changeDateFormat(String s) {
		// fill here!
		String year, month, day;
		int i_year, i_month, i_day;
		String ans = "";
		
		try {
			StringTokenizer t = new StringTokenizer(s, ".");
			
			year = t.nextToken();
			month = t.nextToken();
			day = t.nextToken();
	
			i_year = Integer.parseInt(year);
			i_month = Integer.parseInt(month);
			i_day = Integer.parseInt(day);

			if(i_month < 1 || i_month > 12) {
				throw new NoSuchElementException();
			}
			else if(i_day < 1 || i_day > 31) {
				throw new NoSuchElementException();
			}
			
			ans = month + "/" + day + "/" + year;
			

		}
		
		catch(NumberFormatException e) {
			System.out.print("invalid format");
		}
		catch(NoSuchElementException e) {
			System.out.print("invalid range");
		}
		
		return ans;
		
	}
	public static void main(String[] args) {
		System.out.println(changeDateFormat("2021.12.31")); // 12/31/2021
		System.out.println(changeDateFormat("qwer")); // invalid format
		System.out.println(changeDateFormat("asdf.19.86")); // invalid format
		System.out.println(changeDateFormat("2024.19.86")); // invalid range
		
	}
}
