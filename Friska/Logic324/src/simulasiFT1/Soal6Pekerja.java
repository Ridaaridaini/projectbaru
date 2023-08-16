package simulasiFT1;

import java.util.Scanner;

public class Soal6Pekerja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah pekerja: ");
        double y = input.nextDouble();
        double hari = (5 * 3) / y;
        System.out.println("Jumlah hari yang dibutuhkan: " + Math.ceil(hari));


        //versi 2

//        int pekerja = 5;
//        jam jam = 24;
//
//        int jamKerja = ((double) pekerja / y))+jam ;
//        double hariKerja = jamKerja / 8;
//        System.out.println(hariKerja);

    }
}

