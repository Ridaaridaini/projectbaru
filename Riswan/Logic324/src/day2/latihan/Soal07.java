package day2.latihan;

import java.util.Scanner;

public class Soal07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Jumlah buku pelajaran : ");
        int bukuPelajaran = input.nextInt();
        System.out.println(" Jumlah novel : ");
        int novel = input.nextInt();
        System.out.println(" Jumlah Skripsi : ");
        int skripsi = input.nextInt();
        System.out.println(" Jumlah Hari: ");
        int hari = input.nextInt();

        int jumlah = 0;

        if(hari>10){
            jumlah = (bukuPelajaran * 2000) + (novel * 5000) + (skripsi * 10000);
            jumlah = jumlah * (hari - 10);
        }else {
            System.out.println(" Gratis ");
            System.exit(0);
        }
        System.out.println("Buku pelajaran  : " + bukuPelajaran);
        System.out.println("Novel           : " + novel);
        System.out.println("Skripsi         : " + skripsi);
        System.out.println("Hari            : " + hari);
        System.out.println("Jumlah Biaya    : "+ jumlah );
    }
}
