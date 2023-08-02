package day7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class StringtoDate {

    public static void main(String[] args) throws ParseException {

        // millisecond / millis / ms
        // 1ms = 1/1000 detik
        // 1 detik -> 1000ms

        int detik = 1000;
        int menit = 60 * detik;
        int jam = 60 * menit;
        int hari = 24 * jam;

        Locale locale = new Locale("id", "ID");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy", locale);
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd/MM/yyyy", locale);

        // Diketahui tanggal 01 Agustus 2023
        //tampilkan tanggal 10 hari setelahnya
        // diminta format dd/MM/yyyyy

        String tanggalSebelum = "25 Februari 2023";

        //Convert String to Date

        Date date = dateFormat.parse(tanggalSebelum);

        Date dateNow = new Date();

        //lihat milis
        Long milis = date.getTime();

        milis = milis + (10 * hari);

        System.out.println(milis);

        date.setTime(milis);

        // Convert date ke string

        String tanggal = dateFormat2.format(date);

        System.out.println(tanggal);
        System.out.println(dateNow);

    }

}
