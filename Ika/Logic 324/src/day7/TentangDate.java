package day7;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TentangDate {
    public static void main(String[] args) {
        //millisecond//millis/ ms--> 1/1000 detik
        // 1 detik --> 1ms

        //dalam milisecond
        int detik =1000;
        int menit = 60*detik;//60*detik
        int jam = 60 *menit;
        int hari = 24*jam;

        //date pattern
        //dd/MM/yyyy --> day/month/years --> 02/08/2023
        //dd MMM yyyy --> 02 Aug 2023
        //dd MMMM yyyy --> 02 August 2023
        // dd MMMM yyyy HH:mm:ss --> 02 August 2023 16:05:10 (HH besar untuk format yang 24 jam)
        //dd MMMM yyyy hh:mm:ssa --> 02 August 2023 04:05:10AM (12 jam)
        // EEEEE dd MM yyyy --> wednesday 02 08 2023 --> EEEEE digunakan untuk menampilkan hari


        //class/object untuk menentukan bahasa
        Locale locale = new Locale("id","ID"); //untuk menentukan ikut local date di negara id untuk bahasa ID untuk negara



        //class/object untuk convert date ke string atau sebaliknya
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy"); //hanya memperhatikan pattern saja
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd MMMM yyyy", locale);//melihat pattern dan bahasa dari local yang dimasukan

        //Class/object date
        //tipe data nonprimitif //ambil date java.util
        Date date = new Date();//menyimpan waktu saat object dibuat

        //melihat millis
       long milis= date.getTime();
        System.out.println(milis);

        //replace millis dan date
        date.setTime(1690940192845l);

















    }
}
