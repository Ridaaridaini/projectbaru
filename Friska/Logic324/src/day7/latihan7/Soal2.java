package day7.latihan7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) throws ParseException {
        //milisecond / millis / ms ->
        //1 ms = 1/1000 detik
        //1 detik -> 1000 ms
        int detik = 1000;
        int menit = 60 * detik;
        int jam = 60 * menit;
        int hari = 24 * jam;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai x ");
        int x = input.nextInt()+1;
        System.out.println("Masukkan nilai y ");
        int y = input.nextInt()+1;

        input.nextLine();
        int kpk = x;
        while(kpk % x != 0 || kpk % y != 0){
            kpk = kpk*2;

        }
        System.out.println("Masukkan tanggal: ");
        String tanggal = input.nextLine();

        Locale locale = new Locale("id","ID");
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy",locale);

        Date date = sdf.parse(tanggal);
        long millis = date.getTime();

        millis = millis + ( kpk * hari);
        date.setTime(millis);

        String samaLibur = sdf.format(date);
        System.out.println(samaLibur);


    }
}
