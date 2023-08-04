package day7;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TentangDate {
    public static void main(String[] args) {

        //milisecond / millis
        // ms-> 1ms = 1/1000 detik
        //1 detik = 1000 ms

        int detik = 1000;
        int menit = 60 * detik ;
        int jam = 60 * menit;
        int hari = 24 * jam;

        // Date pattern
        // dd/MM/yyyy -> 02/08/2023
        // dd MMM yyyy -> 02 Aug 2023
        // dd MMMM yyyy -> 02 august 2023
        // dd MMMM yyyy HH:mm:ss -> 02 august 2023 16.03:10 (24 jam)
        // dd MMMM yyyy hh:mm:ssa -> 02 august 2023 04.03:10AM (12 jam)
        //EEEEE dd MM yyyy -> Wednesday 02 08 2023


        //Class/Object untuk menentukan bahasa
        Locale locale = new Locale("id", "ID");

        // Class / Object untuk convert date ke string atau sebaliknya
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd MMMM yyyy",locale);

        //Class / Object Date

        Date date = new Date(); // Menyimpan waktu saat object dibuat

        //Melihat millis
        long millis = date.getTime();
        //date.getTime();
        System.out.println(millis);

        //replace millis dalam date
        date.setTime(1690940230608l);


    }
}
