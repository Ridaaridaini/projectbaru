package day7.latihan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.Date;

public class Soal1 {
    public static void main(String[] args) throws ParseException{

        int detik = 1000;
        int menit = 60 * detik;
        int jam = 60 * menit;
        int hari = 24 * jam;

        Scanner scanner = new Scanner(System.in);
        Locale locale = new Locale("id", "ID");
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy", locale);

        System.out.print("Masukkan x: ");
        int x = scanner.nextInt();

        System.out.print("Masukkan y: ");
        int y = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Masukkan tanggal: ");
        Date tanggal = sdf.parse(scanner.nextLine());
        long milis = tanggal.getTime();

        int nilai = x;

        while (nilai % y != 0) {
            nilai += x;
        }

        milis += (nilai*hari);
        tanggal.setTime(milis);

        
        String dateSesudah = sdf.format(milis);
        System.out.println("Tanggal buka selanjutnya adalah " + dateSesudah);
        System.out.println("Nilai: " + nilai);


    }
}

// boolean kpkKetemu = true;
// while (kpkKetemu) {
// nilai += x;

// if (nilai % y == 0) {
// kpkKetemu = false;
// }

// }

// for (int i = 0; i < x; i++) {
// nilai += x;

// if(nilai%y == 0){
// break;
// }
// }