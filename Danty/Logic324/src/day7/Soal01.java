package day7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Soal01 {

    public static void main(String[] args) throws ParseException {

        int detik = 1000;
        int menit = 60 * detik; // 60 * 1000
        int jam = 60 * menit; // 60 * 60 * 1000
        int hari = 24 * jam; // 24 * 60 * 60 * 1000

        Locale locale = new Locale("id","ID");

        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy",locale);

        Scanner input = new Scanner(System.in);

        System.out.print("x = ");
        int x = input.nextInt();

        System.out.print("y = ");
        int y = input.nextInt();

        input.nextLine();

        System.out.print("Tanggal Input = ");
        String tanggal = input.nextLine();


        int kpk = x;

        while(kpk%x != 0 || kpk%y !=0){
            kpk = kpk + x;
        }
        Date date = sdf.parse(tanggal);

        long milis = date.getTime();

        milis = milis + (kpk*hari);
        date.setTime(milis);

        String tanggalSesudah = sdf.format(date);

        System.out.println(tanggalSesudah);










    }
}
