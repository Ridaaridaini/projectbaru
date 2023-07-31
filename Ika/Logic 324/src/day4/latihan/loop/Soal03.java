package day4.latihan.loop;

import java.util.Scanner;

public class Soal03 {
    public static void main(String[] args) {
        //"Pak Topik akan membeli pakaian, dengan ketentuan sebagai berikut.
        //jika uang 750.000 lebih maka Pak Topik membeli jas,
        //jika 350.000 lebih Pak Topik beli celana panjang,
        //jika 250.000 lebih Pak Topik beli kemeja
        //jika 100.000 lebih Pak Topik beli kaos
        //jika 50.000 lebih Pak Topik beli celana pendek
        //habiskan uang belanja pak Topik
        //
        //input
        //masukkan uang : 850000
        //
        //output
        //Pak Topik membeli jas
        //Pak Topik membeli kaos"


        Scanner input = new Scanner(System.in);
        System.out.print("masukan jumlah uang pak topik: ");
        long jumlahUang = input.nextLong();
        input.close();

        int jas = 750_000;
        int celanaPanjang = 350_000;
        int kemeja = 250_000;
        int kaos = 100_000;
        int celanaPendek = 50_000;

        while (jumlahUang>=50_000){
            if (jumlahUang>= 750_000){
                System.out.println("membeli jas");
                jumlahUang= jumlahUang-jas;
                continue;
            } else if (jumlahUang>=350_000) {
                System.out.println("membeli Celana Panjang");
                jumlahUang= jumlahUang-celanaPanjang;
                continue;
            } else if (jumlahUang>= 250_000) {
                System.out.println("membeli kemeja");
                jumlahUang = jumlahUang-kemeja;
                continue;
            } else if (jumlahUang >= 100_000) {
                System.out.println("membeli kaos");
                jumlahUang = jumlahUang-kaos;
                continue;
            } else if (jumlahUang>=50_000) {
                System.out.println("membeli celana pendek");
                jumlahUang = jumlahUang-celanaPendek;
                continue;
            }
        }

    }
}
