package latihan;

import java.util.Scanner;

public class soal6 {
    public static void main(String[] args) {
        int hasilPersegi;
        int hasilSegitigaSamaSisi;

        Scanner hitung = new Scanner(System.in);

        System.out.println("masukan x: ");
        Integer sisi = hitung.nextInt();

        hasilPersegi = sisi*sisi;

        System.out.println("Luas persegi adalah = " +hasilPersegi);

        hitung.nextLine();

        System.out.println("masukan y: ");
        Integer sisiKaki = hitung.nextInt();

        hasilSegitigaSamaSisi = (sisiKaki*sisiKaki)/2;

        System.out.println("Luas segitiga siku-siku sama sisi adalah= " +hasilSegitigaSamaSisi);

        boolean A= hasilPersegi==hasilSegitigaSamaSisi;
        System.out.println(A);
        hitung.close();
    }
}
