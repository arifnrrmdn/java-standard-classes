package man2lebak.belajarjava.classes;

import java.util.Calendar;
import java.util.Date;

public class DataApp {
    public static void main(String[] args) {
        // menggunkan date
        Date date = new Date();
        long milisecond = date.getTime();

        System.out.println(date);
        System.out.println(milisecond);

        // menggunakan calender / bisa dimanipulasi
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2000);
        calendar.set(Calendar.MONTH, Calendar.NOVEMBER);
        calendar.set(Calendar.DAY_OF_MONTH, 5);

        Date date2 = calendar.getTime();
        long millisecond2 = date.getTime();

        System.out.println(date2);
        System.out.println(millisecond2);

    }
}
