import java.util.Calendar;
import java.util.GregorianCalendar;


public class Euler_019 {

	public static void main(String[] args) {
		
		GregorianCalendar start = new GregorianCalendar();
		int sundays = 0;		
		start.set(1901, 0, 1);
		
		while(start.get(Calendar.YEAR) <= 2000) {
			start.add(Calendar.MONTH, 1);
			if(start.get(Calendar.DAY_OF_WEEK) == 1) sundays++; 
		}		 
		System.out.println("Liczba miesiêcy zaczynaj¹cych siê od niedzieli \nw okresie od "
				+ "1 stycznia 1901 do 31 grudnia 2000 roku wynosi " + sundays);
		
	}

}

