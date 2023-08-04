package day7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class StringToDate {

    public static void main(String[] args) throws ParseException {


        int detik = 1000;
        int menit = 60 * detik;
        int jam = 60 * menit;
        int hari = 24 * jam;


        //Class//object untuk menentukan bahasa
        Locale locale = new Locale("id","ID");

        //Class/object untuk convert date ke string atau sebaliknya
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd MMMM yyyy",locale); //memperhatikan bahasa juga

        //Misal format output yang diminta itu nama bulan hanya angka, maka tambah class simple date
        //nanti waktu convert ke string, gunakan nama simple date class yang baru

        //Contoh
        //Diketahui ada tanggal 25 Februari 2023 (lihat patternnya, lalu samakan dengan class simple date nya)
        //Tampilkan tanggal 10 hari setelahnya

        String tanggalSebelum = "25 Februari 2023";

        //Convert String ke Date
        Date date = sdf2.parse(tanggalSebelum); //pake exception supaya parse gak error
        //Date date = new Date(); -> ini kalua mulainya dari hari sekarang

        //cek milis
        long milis = date.getTime();
        System.out.println(milis);

        //ubah milis ke 10 hari setelahnya
        milis = milis + (10*hari);
        date.setTime(milis);

        //Convert date ke String
        String tanggalSesudah = sdf2.format(date);

        System.out.println(tanggalSesudah);

    }
}
