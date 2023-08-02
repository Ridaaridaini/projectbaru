package Day7.latihan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Soal01 {
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        int detik = 1000;
        int menit = 60 * detik;
        int jam = 60 * menit;
        int hari = 24 * jam;
        Locale locale = new Locale("id","ID");
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy",locale);

        System.out.print("Toko A Buka Setiap : ");
        int tokoA = input.nextInt();
        System.out.print("Toko B Buka Setiap : ");
        int tokoB = input.nextInt();
        input.nextLine();
        System.out.print("Hari buka bersama : ");
        String terakhirBuka = input.nextLine();

        int kpk = tokoA;
        while (kpk %tokoB !=0){
            kpk = kpk +tokoA;
        }

        //int kpk = hitungKPK(tokoA,tokoB);
        System.out.println("nilai KPK: " + kpk);

        Date date = sdf.parse(terakhirBuka);
        long millis = date.getTime();
        millis = millis + ((long) kpk * hari);
        System.out.println(millis);
        date.setTime(millis);

        String tanggalSesudah = sdf.format(date);
        System.out.println("Buka selanjutnya : " + tanggalSesudah);
    }
    public static int hitungFPB(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Fungsi untuk menghitung KPK dari dua bilangan
    public static int hitungKPK(int a, int b) {
        int fpb = hitungFPB(a, b);
        return (a * b) / fpb;
    }
}
