package day7.latihan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Soal02 {

    public static void main(String[] args) throws ParseException {

        int detik = 1000;
        int menit = 60 * detik;
        int jam = 60 * menit;
        int hari = 24 * jam;

        int x, y;
        String z;

        Scanner scanner = new Scanner(System.in);

        System.out.print("x: ");//2
        x = scanner.nextInt();
        System.out.print("y: ");//3
        y = scanner.nextInt();

        scanner.nextLine();
        System.out.print("z: ");
        z= scanner.nextLine();

        x = x+1;
        y = y+1;

        int kpk = x; //x: 2
        // i: 0
        for (int i = 0; i < y; i++) { //y : 3

            if (kpk % y !=0){ //
                kpk = kpk + x;
            }

        }

        System.out.println(kpk);


        Locale locale = new Locale("id", "ID");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy", locale);

        Date tanggal = dateFormat.parse(z);

        long mills = tanggal.getTime();

        mills = mills + ((long) kpk * hari);

        tanggal.setTime(mills);

        String liburBersamaan = dateFormat.format(tanggal);

        System.out.println(liburBersamaan);

    }

}
