package day4.latihan;

import java.util.Random;
import java.util.Scanner;

public class Soal07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int komputer,user,kartu,taruhan,pilihKotak;
        boolean hasil = true;
        System.out.println("Masukkan jumlah Kartu : ");
        kartu = input.nextInt();

        komputer = kartu;
        user = kartu;

        while (hasil){
            System.out.print("Jumlah Taruhan : ");
            taruhan = input.nextInt();
            Random random = new Random();

            int kotakA = random.nextInt(10);
            int kotakB = random.nextInt(10);

            System.out.println("Kotak A Pilih : 1 " );
            System.out.println("Kotak B Pilih : 2 " );
            pilihKotak = input.nextInt();

            if(pilihKotak == 1){
                if(kotakA > kotakB){
                    user = user + taruhan;
                    komputer = komputer - taruhan;
                    System.out.println("Selamat anda menang");
                }else {
                    user = user - taruhan;
                    komputer = komputer + taruhan;
                    System.out.println("Coba lagi ya");
                }
            } else if (pilihKotak == 2 ) {
                if(kotakA > kotakB){
                    user = user + taruhan;
                    komputer = komputer - taruhan;
                    System.out.println("selamat anda menang");
                }else {
                    user = user - taruhan;
                    komputer = komputer + taruhan;
                    System.out.println("Coba lagi ya");
                }
            }else {
                System.out.println("Masukkan  pilihan dengan benar");
            }
            System.out.println(" Sisa Kartu Anda        : " + user);
            System.out.println(" Sisa Kartu Komputer    : " + komputer);

            if(user <1){
                System.out.println("Anda kalah Coba lagi ya");
                hasil = false;
            }else if(komputer < 1){
                System.out.println(" Anda menang ");
                hasil = false;
            }
        }
    }
}
