package day7;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TentangDate {

    public static void main(String[] args) {

        // millisecond / millis / ms
        // 1ms = 1/1000 detik
        // 1 detik -> 1000ms

        int detik = 1000;
        int menit = 60 * detik;
        int jam = 60 * menit;
        int hari = 24 * jam;

        // Date Pattern
        // dd/MM/yyyy -> 02/08/2023
        // dd MMM yyyy -> 02 Aug 2023
        // dd MMMM yyyy -> 02 August 2023
        // dd MMMM yyyy HH:mm:ss -> 02 August 2023 16:05:10 (24 jam)
        // dd MMMM yyyy hh:mm:ssa -> 02 August 2023 04:05:10PM (12 jam)
        // EEEEE dd MM yyyy -> Wednesday 02 08 2023

        // Class/Objek untuk convert date ke String atau sebaliknya
        // Locale -> Class/Objek untuk menentukan bahasa

        Locale locale = new Locale("id", "ID");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd MMMM yyyy", locale);

        // Class/Objek Date

        Date date = new Date(); // menyimpan waktu saat objek dibuat

        // Melihat milis
        long tanggal = date.getTime();
        System.out.println(tanggal);

        //replace milis dalam date
        date.setTime(1690940748528L);



    }

}
