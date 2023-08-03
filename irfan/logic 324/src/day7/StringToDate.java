package day7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class StringToDate {
    public static void main(String[] args) throws ParseException {

        //milisecond / millis
        // ms-> 1ms = 1/1000 detik
        //1 detik = 1000 ms

        int detik = 1000;
        int menit = 60 * detik ; //  60 * 1000;
        int jam = 60 * menit; // 60 * 60 *1000;
        int hari = 24 * jam;  //  24 * 60 * 60 * 1000;

        //Class/Object untuk menentukan bahasa
        Locale locale = new Locale("id", "ID");

        // Class / Object untuk convert date ke string atau sebaliknya
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd MMMM yyyy",locale);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy",locale);

        Scanner scanner = new Scanner(System.in);

        //contoh kasus
        //Diketahui ada tanggal 25 februari 2023.
        // tampilkan tanggal 10 hari setelahnya

        //System.out.println("masukkan tanggal");
        String TanggalSebelum = "25 februari 2023";
        //String TanggalSebelum = scanner.nextLine();


        //Convert String ke date
        Date date = sdf2.parse(TanggalSebelum);   // hari yang sudah ditentukan // tahapan sebelum (01)
        //Date date = new Date(); // hari sekarang

        //Lihat millis
        long millis = date.getTime();
        System.out.println(millis);

        //Ubah millis ke 10 hari setelahnya
        millis = millis + (10 * hari);
        date.setTime(millis);

        //Convert date ke String
        String tanggalSesudah  = sdf.format(date); // tahapan sesudah (02)
        System.out.println(tanggalSesudah);


    }
}
