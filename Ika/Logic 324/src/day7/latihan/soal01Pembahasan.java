package day7.latihan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class soal01Pembahasan {
    public static void main(String[] args) throws ParseException {
        //inputan
        Scanner scanner = new Scanner(System.in);
        System.out.print("x: ");
        int x = scanner.nextInt();

        System.out.print("y: ");
        int y = scanner.nextInt();

        scanner.nextLine();
        System.out.print("masukan tanggal awal: ");
        String z = scanner.nextLine();


        int kpk = x;
        //perulangan 1
        while (kpk % y != 0){
            kpk= kpk+x;
        }

        //dalam milisecond
        int detik =1000;
        int menit = 60*detik;//60*detik
        int jam = 60 *menit;
        int hari = 24*jam;

       //untuk mengkonvert ke local
        Locale locale = new Locale("id", "ID");

        //untuk format tanggalnya
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy", locale);

        Date date = sdf.parse(z);
        long millis = date.getTime();

        //ubah millis kedalam hari yang dimau
        millis= millis + (kpk*hari);
        System.out.println(millis);
        date.setTime(millis);

        String tanggalSaatBukaBersama = sdf.format(date);
        System.out.println(tanggalSaatBukaBersama);






    }
}
