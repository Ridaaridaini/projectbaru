package Day7;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TentangDate {
    public static <locale> void main(String[] args) {


        //milisecond / millis / ms ->
        //1 ms = 1/1000 detik
        //1 detik -> 1000 ms
        int detik = 1000;
        int menit = 60 * detik;
        int jam = 60 * menit;
        int hari = 24 * jam;

        //Date Pattern
        //dd/MM/yyyy = 02/08/2023
        //dd MMM yyy -> 02 Aug 2023
        //dd MMMM yyy -> 02 August 2023
        //dd MMMM yyyy  HH:mm:ss -> 02 August 2023 16:05:10 (24 jam)
        //dd MMMM yyyy hh:mm:ssa -> 02  August 2023 04:05:10 AM (12 jam)
        //EEEE dd MM yyyyy -. Wednesday 02 08 2023

        //class/object untuk menentukan bahasa
        Locale locale = new Locale("id","ID");

        //Class/Object/ untuk convert date ke string atau sebaliknya
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd MMMM yyyy",locale);

        //Clas/add/Object Date
        Date date = new Date();

        long milis = date.getTime();
        System.out.println(milis);

        //replace milis and date
        date.setTime(1690940451578l);
    }
}
