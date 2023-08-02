package day7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class StringToDate {
    public static void main(String[] args) throws ParseException {

        int detik =1000;
        int menit = 60* detik;
        int jam= 60* menit;
        int hari= 24*jam;

        //Class/object untuk menentukan bahasa
        Locale locale= new Locale("id","ID");

        //Class/object untuk convert date ke string atau sebaliknya
        SimpleDateFormat sdf= new SimpleDateFormat("dd MMMM yyyy",locale);
        SimpleDateFormat sdf2= new SimpleDateFormat("dd/MM/yyyy",locale);


        //Diketahui ada tanggal 25 februari 2023
        //tampikan tanggal 10 hari ke depan
        //Diminta di tampilkan dengan pattern dd/MM/yyyy
        String tangggalSebelum ="25 februari 2023";

        //Convert String ke Date
        Date date= sdf.parse(tangggalSebelum);
        //jika dimulai dari hari sekarang
       // Date date=new Date();

        //lihat millis
        long millis= date.getTime();
        System.out.println(millis);

        //ubah millis ke 10 hari setelahnya
        millis = millis+ (10* hari);
        date.setTime(millis);

        //Convert date to string
        String tanggalSesudah= sdf2.format(date);
        System.out.println(tanggalSesudah);
    }
}
