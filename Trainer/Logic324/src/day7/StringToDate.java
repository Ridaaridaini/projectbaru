package day7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class StringToDate {

    public static void main(String[] args) throws ParseException {
        //millisecond / millis / ms ->
        //1 ms = 1/1000 detik
        //1 detik -> 1000 ms
        int detik = 1000;
        int menit = 60 * 1000;
        int jam = 60 * 60 * 1000;
        int hari = 24 * 60 * 60 * 1000;

        //Class/Object untuk menentukan bahasa
        Locale locale = new Locale("id","ID");

        //Class/Object untuk convert date ke string atau sebaliknya
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy",locale);
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy",locale);

        Scanner scanner = new Scanner(System.in);

        //Contoh kasus
        //Diketahui ada tanggal 25 Februari 2023.
        //Tampilkan tanggal 10 hari setelahnya.
        //Diminta ditampilkan dd/MM/yyyy
        System.out.print("tanggal : ");
//        String tanggalSebelum = "25 Februari 2023";
        String tanggalSebelum = scanner.nextLine();

        //Convert String ke Date
        Date date = sdf.parse(tanggalSebelum); //hari yang sudah ditentukan
        //Date date = new Date(); //hari sekarang

        //Lihat milis
        long millis = date.getTime();
        System.out.println(millis);

        //Ubah millis ke 10 hari setelahnya
        millis = millis + (10 * hari);
        date.setTime(millis);

        //Convert date ke String
        String tanggalSesudah = sdf2.format(date);

        System.out.println(tanggalSesudah);

    }
}
