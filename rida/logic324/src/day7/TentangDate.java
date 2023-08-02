package day7;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TentangDate {
    public static void main(String[] args) {
        //millisecond /millis / ms->1/1000 detik
        // 1 detik = 1000 ms
        int detik =1000;
        int menit = 60* detik;
        int jam= 60* menit;
        int hari= 24*jam;

        //date pattern
        //dd/MM/yyyy ->02/08/2023
        //dd/MMM/yyyy -> 02 aug 2023
        //dd MMMM yyyy ->02 august 2023
        //dd MMMM yyyy HH:mm:ss -> 02 august 2023 16:05:10 (24 jam)
        //dd MMMM yyyy hh:mm:ssa -> 02 august 2023 04:05:10 AM
        //EEEEE dd MM yyyy ->wednesday 02 08 2023

        //Class/object untuk menentukan bahasa
        Locale locale= new Locale("id","ID");

        //Class/object untuk convert date ke string atau sebaliknya
        SimpleDateFormat sdf= new SimpleDateFormat("dd MMMM yyyy");
        SimpleDateFormat sdf2= new SimpleDateFormat("dd MMMM yyyy",locale);

        //Class/object Date
        Date date=new Date();//Menyimpan waktu saat object dibuat

        //Melihat milli
        long millis=  date.getTime();
        System.out.println(millis);

        //replace millis dan date
        //date.setTime(1690940213951);


    }
}
