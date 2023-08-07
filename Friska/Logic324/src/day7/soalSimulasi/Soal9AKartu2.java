package day7.soalSimulasi;

import java.util.Random;
import java.util.Scanner;

public class Soal9AKartu2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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
                } else {
                    kartuPlayer = kartuPlayer - tawaran;
                    kartuKomputer = kartuKomputer + tawaran;
                    System.out.println("You lose");
                }
            } else if (pilihan == 2) {
                if (kartu2 > kartu1) {
                    kartuPlayer = kartuPlayer + tawaran;
                    kartuKomputer = kartuKomputer - tawaran;
                    System.out.println("You win");
                } else if (kartu1 > kartu2){
                    kartuPlayer = kartuPlayer - tawaran;
                    kartuKomputer = kartuKomputer + tawaran;
                    System.out.println("You lose");
                }else {
                    System.out.println("Draw");
                }

            }else {
                System.out.println("Pilihan salah,ulangi kembali pilihan ");
            }
            System.out.println("Jumlah kartu player : "+ kartuPlayer);
            System.out.println("Jumlah kartu player : "+ kartuKomputer);

            //Menyerah

            System.out.println("Apakah ingin melanjutkan permainan? 1.Ya ; 2.Tidak");
            input.nextInt();
            int jawaban = input.nextInt();
            if (jawaban == 2){
                break;
            }
        }
        System.out.println("Permainan selesai");
    }
}
