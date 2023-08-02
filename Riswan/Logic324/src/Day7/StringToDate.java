package Day7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class StringToDate {
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        int detik = 1000;
        int menit = 60 * detik;
        int jam = 60 * menit;
        int hari = 24 * jam;

        //Class/Object untuk menentukan bahasa
        Locale locale = new Locale("id","ID");

        //Class/Object untuk date ke String atau sebaliknya
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy",locale);
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd MM yyyy",locale);

        //diketahui ada tanggal 25 februari 2023
        //Tampilkan tanggal 10 hari kedepan
        String tanggalSebelum = input.nextLine();
        //String tanggalSebelum = "25 Februari 2023";
        System.out.println(tanggalSebelum);

        //convert String ke Date
        Date date = sdf.parse(tanggalSebelum);//tanggal yang sudah ditentukan
        //Date date = new Date();//Hari sekarang

        //lihat millis
        long millis = date.getTime();
        System.out.println(millis);

        //ubah millis ke 10 hari setelahnya
        millis = millis +(hari *10);
        date.setTime(millis);

        //convert data ke String
        String tanggalSesudah = sdf.format(date);
        String tanggalSesudah1 = sdf2.format(date);
        System.out.println(tanggalSesudah);
        System.out.println(tanggalSesudah1);
    }
}
