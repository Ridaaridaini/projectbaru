package latihan;

import java.util.Scanner;

public class soal7 {
    public static void main(String[] args) {
        int kelilingPersegi;
        int kelilingSegitigaSamaSisi;

        Scanner hitung = new Scanner(System.in);

        System.out.println("masukan x: ");
        Integer sisi = hitung.nextInt();

        kelilingPersegi = 4*sisi;

        System.out.println("Keliling persegi adalah = " +kelilingPersegi);

        hitung.nextLine();

        System.out.println("masukan y: ");
        Integer sisiKaki = hitung.nextInt();

        kelilingSegitigaSamaSisi = sisiKaki+sisiKaki+sisiKaki;

        System.out.println("Keliling segitiga siku-siku sama sisi adalah= " +kelilingSegitigaSamaSisi);

        boolean A= kelilingPersegi>kelilingSegitigaSamaSisi;
        System.out.println(A);
        hitung.close();

    }
}
