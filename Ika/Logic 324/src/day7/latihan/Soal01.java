package day7.latihan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Soal01 {
    public static void main(String[] args) throws ParseException {
        //"Toko A buka setiap x hari sekali, sedangkan toko B buka setiap y hari sekali. Jika mereka terakhir buka di hari yang sama
        //pada tanggal z, kapan tanggal terdekat mereka akan buka bersama kembali?
        //Input: int x, y; date/varchar z
        //Output: tanggal buka bersama selanjutnya
        //Contoh: x=3, y=2, z=20 April 2023
        //Output: 26 April 2023"

        //dalam milisecond
        int detik =1000;
        int menit = 60*detik;//60*detik
        int jam = 60 *menit;
        int hari = 24*jam;

        Scanner scanner = new Scanner(System.in);
        Locale locale = new Locale("id", "ID");
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy", locale);

        System.out.print("toko A buka setiap: ");
        int x = scanner.nextInt();
        System.out.print("toko B buka setiap: ");
        int y = scanner.nextInt();
        scanner.nextLine();
        System.out.print("tanggal buka bersama: ");
        String z= scanner.nextLine();

        long kpk= x;
        for (int i = 0; i < y; i++) {
            if(kpk % y != 0 ){//4%3
                kpk=kpk+x;
//                System.out.println(kpk);
            }
        }
        System.out.println(kpk);

        Date date = sdf.parse(z);
        long millis = date.getTime();
//        System.out.println(millis);

        //ubah milis kedalam kpk hari yang di mau
        millis =millis + (kpk*hari);
//        System.out.println(millis);
        date.setTime(millis);

        String tanggalBukaBersama = sdf.format(date);
        System.out.println("tanggal buka selanjutnya "+tanggalBukaBersama);



//        long kpk = 1;
//         x= 3
//         y= 2
//        for (int i = 1; i <= x && i<= y; i++) {
//            if (x %i==0 && y%i==0)
//                kpk=i;//1
//        }
//        int hasilKpk = (x*y)/kpk;
//        System.out.println(hasilKpk);



    }
}
