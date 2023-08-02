package day7.latihan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Soal01 {

    public static void main(String[] args) throws ParseException {
        //Inputan
        Scanner scanner =  new Scanner(System.in);
        System.out.print("x : ");
        int x = scanner.nextInt(); //4

        System.out.print("y : ");
        int y = scanner.nextInt(); //2
        scanner.nextLine();

        System.out.print("z : ");
        String z = scanner.nextLine();

        //Perhitungan KPK
        int kpk = x; //4
        while (kpk % y != 0){//true
            kpk = kpk + x;
        }

        int detik = 1000;
        int menit = 60 * 1000;
        int jam = 60 * 60 * 1000;
        int hari = 24 * 60 * 60 * 1000;

        //Class/Object untuk menentukan bahasa
        Locale locale = new Locale("id","ID");

        //Class/Object untuk convert date ke string atau sebaliknya
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy",locale);

        //Convert ke Date
        Date date = sdf.parse(z);

        //Ubah Millis
        long millis = date.getTime();
        millis = millis + (kpk * hari);

        date.setTime(millis);

        //Convert ke String
        String hasil = sdf.format(date);
        System.out.println(hasil);


    }
}
