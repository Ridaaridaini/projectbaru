package day7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class StringToDate {
    public static void main(String[] args) throws ParseException {
        
        int detik = 1000;
        int menit = 60*detik;
        int jam = 60*menit;
        int hari = 24*jam;
        
        Locale locale = new Locale("id", "ID");
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy", locale);
        String tanggalSebelum = "25 Februari 2023";

        Date date = sdf.parse(tanggalSebelum);

        long milis = date.getTime();

        long milisSesudah = milis + (10 * hari);
        date.setTime(milisSesudah);

        String dateSesudah = sdf.format(date);
        System.out.println(dateSesudah);
    }
}
