package day4.latihan4;

import java.util.Random;
import java.util.Scanner;

public class Soal7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah kartu yang akan dibagikan untuk tiap-tiap pemain: ");
        int jumKartuP = input.nextInt();// 5
//        int jumKartuK = input.nextInt();// 5
        System.out.println("Masukkan jumlah tawaran kartu: ");// 2
        int tawaranKartu = input.nextInt();

        System.out.println("Masukkan tebakan kartu yang lebih besar (1-2):");
        int tebakan = input.nextInt();

        while (jumKartuP >= 1) {
            jumKartuP = jumKartuP - 1;
            Random randomGenerator = new Random();
            int angka1 = randomGenerator.nextInt(10);
            int angka2 = randomGenerator.nextInt(10);
            if (tebakan == 1) {
                if (angka1 > angka2) {
                    jumKartuP = jumKartuP + tawaranKartu + tawaranKartu;
                }else {
                    jumKartuP = jumKartuP;
                }

            }else if (tebakan == 2) {
                if (angka2 > angka1){
                    jumKartuP = jumKartuP +tawaranKartu + tawaranKartu;
                }


            }
        }


    }
    //tebakan antara 2 kotak itu,mana yg lebih besar


}


