package day1.Latihan;

import java.text.DecimalFormat;
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

        //menghitung untuk membuat satu cupcake
        terigu = 125/15.0;
        gulaPasir = 100/15.0;
        susu= 100/15.0;

        System.out.println("menghitung banyak bahan yang digunakan untuk membuat cupcake");
        double nTerigu = terigu * cupcake;
        double nGulaPasir = gulaPasir * cupcake;
        double nSusu = susu * cupcake;

//        System.out.printf("tepung yang digunakan untuk membuat " + cupcake+ " buah cupcake adalah %.2f gr\n", nTerigu);
//        System.out.printf("gula pasir yang digunakan untuk membuat"  + cupcake+ " buah cupcake adalah %.2f gr\n ", nGulaPasir);
//        System.out.printf("susu yang digunakan untuk membuat "  + cupcake+ " buah cupcake adalah %.2f mL", nSusu);

        // decimal format untuk mengambil dua angka dibelakang koma
        DecimalFormat df = new DecimalFormat("##.00");

        String terigu2 = df.format(terigu*cupcake);
        String gula2 = df.format(gulaPasir*cupcake);
        String susu2 = df.format(susu*cupcake);

        input.close();

        System.out.println("untuk membuat sebanyak " + cupcake + " cupcake dibutuhkan terigu " + terigu2 + "gr gula pasir "
                + gula2 +" gr dan susu "+ susu2 + "ml");



    }
}
