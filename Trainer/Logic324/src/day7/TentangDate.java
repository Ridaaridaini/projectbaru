package day7;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TentangDate {

    public static void main(String[] args) {
        //millisecond / millis / ms ->
        //1 ms = 1/1000 detik
        //1 detik -> 1000 ms
        int detik = 1000;
        int menit = 60 * detik;
        int jam = 60 * menit;
        int hari = 24 * jam;

        //Date Pattern
        //dd/MM/yyyy -> 02/08/2023
        //dd MMM yyyy ->02 Aug 2023
        //dd MMMM yyyy -> 02 August 2023
        //dd MMMM yyyy HH:mm:ss -> 02 August 2023 16:05:10 (24 Jam)
        //dd MMMM yyyy hh:mm:ssa -> 02 August 2023 04:05:10AM (12 Jam)
        //EEEEE dd MM yyyy -> Wednesday 02 08 2023

        //Class/Object untuk menentukan bahasa
        Locale locale = new Locale("id","ID");

        //Class/Object untuk convert date ke string atau sebaliknya
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd MMMM yyyy",locale);

        //Class/Object Date
        Date date = new Date(); //Menyimpan Waktu saat object dibuat

        //Melihat milis
        long milis = date.getTime();
        System.out.println(milis);

        //replace milis dam date
        date.setTime(1694930193573l);
    }
}
