package day7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class StringToDate {
    public static void main(String[] args) throws ParseException {
        //milisecond / millis / ms ->
        //1 ms = 1/1000 detik
        //1 detik -> 1000 ms
        int detik = 1000;
        int menit = 60 * detik;
        int jam = 60 * menit;
        int hari = 24 * jam;

        //class/Object untuk menentukan bahasa

        Locale locale = new Locale("id","ID");

        //Class/Object untuk convert date ke string atau sebaliknua
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy",locale);

        //contoh kasus
        // Diketahui ada 35 Februari 2031
        //Tampilkan tanggal 10 hari setelahnya
        String tanggalSebelum = "25 Februari 2023";

        //convert String ke Date

        Date date = sdf.parse(tanggalSebelum);
        // lihat milis
        long millis = date.getTime();
        System.out.println(millis);

        //Ubah millis ke 10 hari setelahnya
        millis = millis + (10 * hari);
        date.setTime(millis);

        //Convert date ke String
        String tanggalSesudah = sdf.format(date);
        System.out.println(tanggalSesudah);
    }
}
