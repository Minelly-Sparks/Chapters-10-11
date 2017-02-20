package Ejercicios;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class YearEnd {
    public static void main(String[] args) {
        int currentDay,daysInYear;
        GregorianCalendar today = new GregorianCalendar();
	currentDay = (today.get(Calendar.DAY_OF_YEAR) + 1);
        System.out.println("Today is the " + currentDay + "th day of the year.");
	daysInYear = today.getMaximum(Calendar.DAY_OF_YEAR);
	System.out.println("There is " + (daysInYear - currentDay) + " days left in the year.");
    }
} 
