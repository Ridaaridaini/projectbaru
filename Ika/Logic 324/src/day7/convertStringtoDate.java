package day7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class convertStringtoDate {
    public static void main(String[] args) throws ParseException {
        //dalam milisecond
        int detik =1000;
        int menit = 60*detik;//60*detik
        int jam = 60 *menit;
        int hari = 24*jam;


        //class/object untuk menentukan bahasa
        Locale locale = new Locale("id","ID"); //untuk menentukan ikut local date di negara id untuk bahasa ID untuk negara

        //class/object untuk convert date ke string atau sebaliknya
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy", locale);//melihat pattern dan bahasa dari local yang dimasukan
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd", locale);//melihat pattern dan bahasa dari local yang dimasukan

        //contoh kasus
        //diketahui ada tanggal 25 februari 2023.
        // tampilkan tanggal 10 hari setelahnya
        //diminta ditampilkan dd//MM/yyyy


        Scanner scanner = new Scanner(System.in);
        System.out.println("masukan tanggal : ");
        String tanggalSebelum = scanner.nextLine();

//        String  tanggalSebelum = "25 Februari 2023";


        //convert String ke date
        Date date = sdf.parse(tanggalSebelum);// hari yang sudah ditentukan
//        Date date = new Date(); //hari sekarang

        //lihat millisnya
        long millis = date.getTime();
        System.out.println(millis);


        //ubah milis ke sepuluh hari setelah
        millis = millis + (10*hari);
        date.setTime(millis);//date nama objeknya--> memasukan millis yang sudah di covert kedalam nama objek yang sudah dibaut

        //convert date ke String
        String tanggalSesudah = sdf.format(date);// date nama objek yang sudah dibuat di class Date
        System.out.println(tanggalSesudah);
        String tanggalSesudah2 = sdf2.format(date);
        System.out.println(tanggalSesudah2);




    }
}
