package daffa.belajarjava.application;

import java.util.Calendar;
import java.util.Date;

public class DateApp {
    public static void main(String[] args) {

        Date tanggal = new Date(23587200000L);

        System.out.println(tanggal);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2000);
        calendar.set(Calendar.MONTH, Calendar.JANUARY); // -> Januari is 0
        calendar.set(Calendar.HOUR_OF_DAY, 10);
//        calendar.set(Calendar.MINUTE, 10);
//        calendar.set(Calendar.SECOND, 10);
//        calendar.set(Calendar.MILLISECOND, 10);

        Date result = calendar.getTime();
//        long milisecond = result.getTime();
        System.out.println("Date Yang Sekarang : " + result);
//        System.out.println(milisecond);
    }
}
