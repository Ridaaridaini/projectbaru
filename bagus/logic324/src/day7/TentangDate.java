package day7;

import java.util.Date;
import java.util.Locale;

public class TentangDate {
    public static void main(String[] args) {
        //1 milisecond = 1/1000 detik
        //1 detik = 1000 milisecond

        int detik = 1000;
        int menit = 60*detik;
        int jam = 60*menit;
        int hari = 24*jam;

        //date patern
        // dd/MM/yyyy -> 02/08/2023
        // dd MMM yyyy -> 02 Aug 2023
        // dd MMMM yyyy -> 02 August 2023
        //format 24 jam = HH:mm:ss
        //format 12 jam = hh:mm:ssa -> a nya buat am atau pm
        //untuk nampilin hari : EEE

        //Class/object buat nentuin bahasa





        //lihat milis
        Date date = new Date();
        long milis = date.getTime();
        System.out.println(milis);

        //replace milis dan date
        date.setTime(1690940348767l);
    }
}
