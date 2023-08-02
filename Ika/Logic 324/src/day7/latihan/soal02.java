package day7.latihan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class soal02 {
    public static void main(String[] args) throws ParseException {
        //"Ucup mendapatkan libur setiap x hari, sedangkan Harris mendapatkan libur setiap y hari. Jika
        //mereka terakhir mendapatkan libur di hari yang sama pada tanggal z, kapan tanggal terdekat mereka
        //akan libur bersama kembali?
        //Input: int x, y; date/varchar z
        //Output: tanggal libur bersama selanjutnya
        //Contoh: x=3, y=2, z=25 Februari 2020
        //Output: 8 Maret 2020"


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

        long kpk = 1l;
        x = x+1;
        y = y+1;
        for (int i = 1; i<= x && i<= y ; i++) {
            if (x % i==0 && y % i == 0){
                kpk=i;
            }

        }
        long hasilKpk= (x*y)/kpk;

//        long kpk= x+1;
//        x=x+1;
//        y=y+1;
//        for (int i = 0; i < y; i++) {
//            if(kpk % y+1 != 0 ){
//                kpk=kpk+x+1;
//            }
//        }
        System.out.println(hasilKpk);

        Date date = sdf.parse(z);
        long millis = date.getTime();
        System.out.println(millis);

        //ubah milis kedalam kpk hari yang di mau
        millis = millis + (hasilKpk*hari);
        System.out.println(millis);
        date.setTime(millis);

        String tanggalBukaBersama = sdf.format(date);
        System.out.println("tanggal buka selanjutnya "+tanggalBukaBersama);


    }
}
