package day7.soalSimulasi;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan pilihan: 1. Pesan ; 2.Tidak");
        int pilihan = input.nextInt();
        int jumLD = 0;
        int jumLD1 = 0;

        int jumWD = 0;
        int jumWD1 = 0;

        int jumR = 0;
        int jumR1 = 0;

        int jumA = 0;
        int jumA1 = 0;

        int jumB = 0;
        int jumB1 = 0;

        double porsi = 0;

        while (pilihan == 1) {
            System.out.println("Pilih kategori : ");
            System.out.println("1.Laki laki dewasa ");
            System.out.println("2.Perempuan dewasa ");
            System.out.println("3.Remaja ");
            System.out.println("4.Anak- anak ");
            System.out.println("5.Balita ");

            int pilihan2 = input.nextInt();

            if (pilihan2 == 1) {
                System.out.println("Berapa orang jumlah laki-laki dewasa? :");
                jumLD = input.nextInt();
                jumLD1 = jumLD + jumLD1;
                porsi = jumLD * 2.0;

                System.out.println("Apakah ada jumlah orang lagi? 1.YA ; 2.TIDAK ");
                int pilihanLagi = input.nextInt();
                if (pilihanLagi == 2) {
                    pilihan2 = 2;
                    break;
                }
            } else if (pilihan2 == 2) {
                System.out.println("Berapa orang jumlah perempuan dewasa? :");
                jumWD = input.nextInt();
                jumWD1 = jumWD + jumWD1;
                porsi = porsi + (jumWD * 1.0);

                System.out.println("Apakah ada jumlah orang lagi? 1.YA ; 2.TIDAK ");
                int pilihanLagi = input.nextInt();
                if (pilihanLagi == 2) {
                    pilihan2 = 2;
                    break;
                }

            } else if (pilihan2 == 3) {
                System.out.println("Berapa orang jumlah Remaja? :");
                jumR1 = input.nextInt();
                jumR1 = jumR + jumR1;
                porsi = porsi + (jumR * 1.0);

                System.out.println("Apakah ada jumlah orang lagi? 1.YA ; 2.TIDAK ");
                int pilihanLagi = input.nextInt();
                if (pilihanLagi == 2) {
                    pilihan2 = 2;
                    break;


                }

            } else if (pilihan2 == 4) {
            System.out.println("Berapa orang jumlah Remaja? :");
            jumA = input.nextInt();
            jumA1 = jumA + jumA1;
            porsi = porsi + (jumA * 0.5);

            System.out.println("Apakah ada jumlah orang lagi? 1.YA ; 2.TIDAK ");
            pilihanLagi = input.nextInt();
            if (pilihanLagi == 2) {
                pilihan2 = 2;
                break;
            }

        } else if (pilihan2 == 5) {
            System.out.println("Berapa orang jumlah Remaja? :");
            jumB = input.nextInt();
            jumB1 = jumB + jumB1;
            porsi = porsi + (jumB1 * 1);

            System.out.println("Apakah ada jumlah orang lagi? 1.YA ; 2.TIDAK ");
            pilihanLagi = input.nextInt();
            if (pilihanLagi == 2) {
                pilihan2 = 2;
                break;
            }
        }
        System.out.println(porsi);
    }

}