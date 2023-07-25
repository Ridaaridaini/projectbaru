package day1.Latihan;

import java.util.Scanner;

public class Soal15 {
    public static void main(String[] args) {
        /*
        125gr terigu, 100gr gula pasir, 100mL susu adalah resep untuk membuat 15 cupcake.
        Berapa takaran terigu, gula & susu untuk membuat sebanyak n cupcake?
        */

        double terigu, gulaPasir, susu;
        Scanner input = new Scanner(System.in);
        System.out.print("jumlah cupkace: ");
        int cupcake = input.nextInt();

        terigu = 125/15.0;
        gulaPasir = 100/15.0;
        susu= 100/15.0;

        System.out.println("menghitung banyak bahan yang digunakan untuk membuat cupcake");
        double nTerigu = terigu * cupcake;
        double nGulaPasir = gulaPasir * cupcake;
        double nSusu = susu * cupcake;


        input.close();
        System.out.printf("tepung yang digunakan untuk membuat " + cupcake+ " buah cupcake adalah %.2f gr\n", nTerigu);
        System.out.printf("gula pasir yang digunakan untuk membuat"  + cupcake+ " buah cupcake adalah %.2f gr\n ", nGulaPasir);
        System.out.printf("susu yang digunakan untuk membuat "  + cupcake+ " buah cupcake adalah %.2f gr", nSusu);


    }
}
