package day3.latihan3;

import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {
        int i, deretAngka;
        int a = 3;
        Scanner inputan = new Scanner(System.in);

        System.out.print("Masukkan angka = ");
        deretAngka = inputan.nextInt();

        for (i = 0; i < deretAngka; i++) {
            if (i % 4 == 3 || i % 4 == 4) {
                System.out.print("XXX ");
                } else {
                    System.out.print(a + "  ");

                }
                a = a * 3;
            }
        }
    }

