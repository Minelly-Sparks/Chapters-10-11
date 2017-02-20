package Ejercicios;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class NextMonth {
    public static void main(String[] args) {
        int currentDay;
        GregorianCalendar today = new GregorianCalendar();
        currentDay = today.get(Calendar.DAY_OF_MONTH);
        System.out.println("Today is the " + currentDay + " day of the month.");
        System.out.println("There is " + ((today.get(Calendar.DAY_OF_MONTH) + 1)-(today.getActualMaximum(Calendar.MONTH))) + " days left in the month.");
    }
}
