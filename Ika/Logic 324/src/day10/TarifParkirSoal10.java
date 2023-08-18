package day10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class TarifParkirSoal10 {
    public static void main(String[] args) throws ParseException {
        int detik = 1000;
        int menit= 60*detik;
        int jam = 60*menit;
        int hari = 60*jam;

        Scanner scanner = new Scanner(System.in);
        Locale locale = new Locale("id", "ID");
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy HH:mm:ss", locale);

        System.out.print("Parkir masuk (day & hour): ");
        String masuk = scanner.nextLine();

        System.out.print("keluar parkir: ");
        String keluar = scanner.nextLine();

        //merubah string ke bentuk date
        Date parMasuk = sdf.parse(masuk);//merubah parkir masuk ke date
        Date perKeluar= sdf.parse(keluar);

        //mengambil waktu dari date
        long parkirMasuk = parMasuk.getTime();
        long parkirKeluar= perKeluar.getTime();
        long lamaParkir = parkirKeluar -parkirMasuk;
        long lamaJamParkir = lamaParkir/jam;
        System.out.println(lamaJamParkir);
        long bayarParkir=0;

        if(lamaJamParkir>24){
            bayarParkir = bayarParkir + 15_000 + (lamaJamParkir-24) * 1_000;
            System.out.println("bayar parkir sebesar: " + bayarParkir);
        }else if(lamaJamParkir>8 && lamaJamParkir<24){
            bayarParkir = bayarParkir +8_000;
            System.out.println("bayar parkir sebesar: " + bayarParkir);
        } else if (lamaJamParkir<=8) {
            bayarParkir = bayarParkir + 1_000;
            System.out.println("bayar parkir sebesar: " + bayarParkir);
        }


    }
}
