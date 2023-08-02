package Day7.latihan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Soal02 {
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        Locale locale = new Locale("id","ID");
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy",locale);
        int detik = 1000;
        int menit = 60 * detik;
        int jam = 60 * menit;
        int hari = 24 * jam;

        System.out.println("Libur Ucup Setiap : ");
        int ucup = input.nextInt();
        System.out.println("Libur Haris Setiap : ");
        int harris = input.nextInt();
        input.nextLine();
        System.out.print("Hari libur bersama : ");
        String terakhirBuka = input.nextLine();

        int kpk = ucup;
        while (kpk %harris !=0){
            kpk = kpk +ucup;
        }
//        int kpk = hitungKPK(ucup+1,harris+1);
        System.out.println("nilai KPK: " + kpk);

        Date date = sdf.parse(terakhirBuka);
        long millis = date.getTime();
        millis = millis +((long)kpk * hari);
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
