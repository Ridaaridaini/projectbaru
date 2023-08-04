package day7.latihan7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) throws ParseException {
        //milisecond / millis / ms ->
        //1 ms = 1/1000 detik
        //1 detik -> 1000 ms
        int detik = 1000;
        int menit = 60 * detik;
        int jam = 60 * menit;
        int hari = 24 * jam;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai x :");
        int x = input.nextInt();
        System.out.println("Masukkan nilai y");
        int y = input.nextInt();
        input.nextLine();
        int kpk = 0;
        for (int i = 0; i < y; i++) {
            kpk = kpk+x;
            if (kpk % y == 0){
                break;
            }
        }

        System.out.println("Masukkan tanggal: ");
        String tanggal = input.nextLine();

        Locale locale = new Locale("id","ID");
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy",locale);

        Date date = sdf.parse(tanggal);
        long millis = date.getTime();

        millis = millis + ( kpk * hari);
        date.setTime(millis);

        String samaBuka = sdf.format(date);
        System.out.println(samaBuka);





        }
    }
