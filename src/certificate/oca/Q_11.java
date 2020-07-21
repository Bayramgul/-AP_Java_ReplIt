package certificate.oca;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q_11 {


	public static void main(String[] args) {

		LocalDate date1=LocalDate.of(2014,6,20);//obtains the current time from the system clock in the default time-zone
		LocalDate date2=LocalDate.of(2014, 6, 20);// we pass date in parameters with commas in Of() method but it will print with slashes:2014-06-20
		//changes the String format into date format
		LocalDate date3=LocalDate.parse("2014-04-20", DateTimeFormatter.ISO_DATE);//Parsing is to read the value of one object to convert it to another type
		System.out.println("date1= "+ date1);						// ISO_DATE_TIME olunca saati de veriyor. eger TIME yoksa 
		System.out.println("date2= "+ date2);						//	soruda saat olsa bile sonucta olmaz.
		System.out.println("date3= "+ date3);
		//Assume that the system date is June 20, 2014. What is the result?
	}

}
