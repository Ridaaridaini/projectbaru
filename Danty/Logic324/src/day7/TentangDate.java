package day7;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TentangDate {

    public static void main(String[] args) {

        //millisecond /millis
        //1 ms = 1/1000 detik
        //1 detik -> 1000 ms

        int detik = 1000;
        int menit = 60 * detik;
        int jam = 60 * menit;
        int hari = 24 * jam;


        //Date Pattern
        //dd/MM/yyyy -> 02/08/2023
        //dd MMM yyyy -> 02 Aug 2023
        //dd MMMM yyyy -> 02 August 2023
        //dd MMMM yyyy HH : mm : ss -> 02 August 2023 16:05:10 (Format 24 jam)
        //dd MMMM yyyy hh : mm : ss -> 02 August 2023 04:05:10PM (Format 12 jam)
        //EEEE dd MM yyyy -> Wednesday 02 08 2023


        //Class//object untuk menentukan bahasa
        Locale locale = new Locale("id","ID");

        //Class/object untuk convert date ke string atau sebaliknya
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy"); //hanya memperhatikan pattern
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd MMMM yyyy",locale); //memperhatikan bahasa juga

        //Class/Object Date
        Date date = new Date(); //Menyimpan waktu saat object dibuat (waktu saat ini)

        //Melihat milis
        long milis = date.getTime();
        System.out.println(milis);

        //replace milis ke date
        date.setTime(milis);
    }
}
