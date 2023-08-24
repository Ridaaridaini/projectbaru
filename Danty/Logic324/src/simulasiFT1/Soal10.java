package simulasiFT1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Soal10 {

    public static void main(String[] args) throws ParseException {


        Locale lokal = new Locale("id","ID");
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy", lokal);

        Scanner input = new Scanner(System.in);

        System.out.print("x = ");
        int x = input.nextInt() + 1;

        System.out.print("y = ");
        int y = input.nextInt() + 1;

        input.nextLine();

        System.out.print("z = ");
        String z = input.nextLine();


        int detik = 1000;
        int menit = 60 * detik;
        int jam = 60 * menit;
        int hari = 24 * jam;


        int kpk = x;

        while(kpk%x != 0 || kpk%y != 0){

            kpk = kpk + x;

        }
        Date date = sdf.parse(z);
        long millis = date.getTime();

        millis = millis + (kpk*hari);
        date.setTime(millis);

        String tanggalSesudah = sdf.format(date);

        System.out.println(tanggalSesudah);

    }
}
