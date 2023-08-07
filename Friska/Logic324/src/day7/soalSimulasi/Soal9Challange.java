package day7.soalSimulasi;

import java.util.Random;
import java.util.Scanner;

public class Soal9Challange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Apakah anda ingin bermain? 1.YA ; 2.Tidak");
        int jawaban = 0;
        jawaban = input.nextInt();
        if (jawaban == 1 ){

        System.out.println("Masukkan jumlah kartu tiap-tiap pemain: ");
        int n = input.nextInt();
        int kartuPlayer = n;
        int kartuKomputer = n;

        Random randomGenerator = new Random();
        int kartu1 = randomGenerator.nextInt(10);
        int kartu2 = randomGenerator.nextInt(10);


        System.out.println("Masukkan tawaran kartu anda: ");
        int tawaran = input.nextInt();
        for (; kartuPlayer > 0 && kartuKomputer > 0; ) {
            System.out.println("Pilih kotak  1 atau 2: ");
            int pilihan = input.nextInt();
            if (pilihan == 1) {
                if (kartu1 > kartu2) {
                    kartuPlayer = kartuPlayer + tawaran;
                    kartuKomputer = kartuKomputer - tawaran;
                    System.out.println("You win");

                } else if(kartu2 > kartu1) {
                    kartuPlayer = kartuPlayer - tawaran;
                    kartuKomputer = kartuKomputer + tawaran;
                    System.out.println("You lose");
                }else {
                    kartuPlayer = kartuPlayer - tawaran;
                    kartuKomputer = kartuKomputer -tawaran;
                    System.out.println("Draw");
                }

            } else if (pilihan == 2) {
                if (kartu2 > kartu1) {
                    kartuPlayer = kartuPlayer + tawaran;
                    kartuKomputer = kartuKomputer - tawaran;
                    System.out.println("You win");

                } else if (kartu1 > kartu2){
                    kartuPlayer = kartuPlayer - tawaran;
                    kartuKomputer = kartuKomputer + tawaran;
                    System.out.println("You lose");}
                }else {
                System.out.println("Pilihan salah,ulangi kembali pilihan ");
                }
            if(kartuPlayer == kartuKomputer){
                kartuPlayer = kartuPlayer - tawaran;
                kartuKomputer = kartuKomputer -tawaran;
                System.out.println("Draw");
                System.out.println("Jumlah kartu player : "+ kartuPlayer);
                System.out.println("Jumlah kartu player : "+ kartuKomputer);}

            //Menyerah

            System.out.println("Apakah ingin melanjutkan permainan? 1.Ya ; 2.Tidak");
            int jawaban2 = input.nextInt();
            if (jawaban2 == 2){
                System.out.println("Permainan selesai");
                break;
            }

        }

        }

    }
}
