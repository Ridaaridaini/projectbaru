package day7.latihan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class soal02Pembahasan {
    public static void main(String[] args) throws ParseException {

        //dalam milisecond
        int detik =1000;
        int menit = 60*detik;//60*detik
        int jam = 60 *menit;
        int hari = 24*jam;


        //inputan
        Scanner scanner = new Scanner(System.in);
        System.out.print("x: ");
        int x = scanner.nextInt()+1;

        System.out.print("y: ");
        int y = scanner.nextInt()+1;

        scanner.nextLine();
        System.out.print("masukan tanggal awal: ");
        String z = scanner.nextLine();

        int kpk = x;
        while (kpk%y !=0){
            kpk=kpk+x;
        }

        Locale locale = new Locale("id", "ID");

        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy", locale);

        Date date = sdf.parse(z);
        long millis = date.getTime();

        millis = millis + (kpk*hari);
        date.setTime(millis);

        String tanggalLiburBersamaLagi = sdf.format(millis);
        System.out.println(tanggalLiburBersamaLagi);




    }

}
