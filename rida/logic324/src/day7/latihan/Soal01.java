package day7.latihan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Soal01 {
    public static void main(String[] args) throws ParseException {
        int detik =1000;
        int menit = 60* detik;
        int jam= 60* menit;
        int hari= 24*jam;
        int kpk=0, kecil=0;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Masukkan nilai x: ");
        Integer x= scanner.nextInt();
        System.out.println();
        System.out.print("masukkan nilai y: ");
        Integer y= scanner.nextInt();
        scanner.nextLine();
        System.out.println("masukkan dd MMMM yyyy");
        String tanggal= scanner.nextLine();
        if (x>=y) {
            kpk = kpk + y;
            kecil= kecil+y;
        }else {
            kpk =kpk+ x;
            kecil= kecil+x;
        }
        while (kpk%x!=0 || kpk%y!=0){
            kpk=kpk+kecil;
        }
        Locale locale= new Locale("id","ID");
        SimpleDateFormat sdf= new SimpleDateFormat("dd MMMM yyyy",locale);
        String tangggalSebelum =tanggal;
        Date date= sdf.parse(tangggalSebelum);
        long millis= date.getTime();
        millis = millis+ (kpk* hari);
        date.setTime(millis);
        String tanggalSesudah= sdf.format(date);
        System.out.println("tanggal buka bersama selanjutnya " +tanggalSesudah);



    }
}
