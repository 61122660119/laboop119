package proj5;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateAndTime {
    public static void main(String args[]){
        int day, moth, year;
        int second, minute,hour;

        GregorianCalendar date = new  GregorianCalendar();

        day = date.get(Calendar.DAY_OF_MONTH);
        moth = date.get(Calendar.MARCH);
        year = date.get(Calendar.YEAR);

        second = date.get(Calendar.SECOND);
        minute = date.get(Calendar.MINUTE);
        hour = date.get(Calendar.HOUR);

        System.out.println("Date is" + day + "/" + (moth+1) + "/" + year);
        System.out.println("Time is " + hour + ":" + minute + ":" + second);

    }


}
