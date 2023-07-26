package day2.latihan;

import java.util.Scanner;

public class Soal07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Jumlah buku pelajaran : ");
        int bukuPelajaran = input.nextInt();
        System.out.println(" Jumlah novel : ");
        int novel = input.nextInt();
        System.out.println(" Jumlah buku pelajaran : ");
        int skripsi = input.nextInt();
        int jumlahP = 0;
        int jumlahN = 0;
        int jumlahS = 0;

        if(bukuPelajaran > 10){
            jumlahP = (bukuPelajaran - 10) * 2000;
        }
        if (novel > 10){
            jumlahN = (novel - 10) * 5000;
        }
        if (skripsi > 10){
            jumlahS = (skripsi - 10) * 10000;
        }
        int hasil =  jumlahP + jumlahN + jumlahS;
        System.out.println("Buku pelajaran  : " + bukuPelajaran);
        System.out.println("Novel           : " + novel);
        System.out.println("Skripsi         : " + skripsi);
        System.out.println("Jumlah Biaya    : "+ hasil);
    }
}
