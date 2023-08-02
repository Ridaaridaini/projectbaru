package day7.latihan7;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) throws ParseException {
        int x,y;
        int detik = 1000;
        int menit = 60 * detik ;
        int jam = 60 * menit;
        int hari = 24 * jam;

        Scanner scanner = new Scanner(System.in);
        System.out.print("X = ");
        x = scanner.nextInt() +1 ;

        System.out.print("Y = ");
        y = scanner.nextInt() +1 ;

        scanner.nextLine();             //harus di catat
        System.out.print("Z = ");
        String z = scanner.nextLine();


//         x = x + 1;
//         y = y + 1;

        System.out.println(x);
        System.out.println(y);
         int nilaiKpk = x ;

//        for (int i = 0; i < y; i++) { //

            while (nilaiKpk % y !=0){
                nilaiKpk = nilaiKpk + x;
            }

//        }
        System.out.println(nilaiKpk);

        Locale locale = new Locale("id", "ID");

        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy",locale);

        Date date = sdf.parse(z);

        long millis = date.getTime();

        millis = millis + ((long)nilaiKpk * hari);

        date.setTime(millis);

        String tanggaLibur = sdf.format(date);

        System.out.println(tanggaLibur);
    }
}
