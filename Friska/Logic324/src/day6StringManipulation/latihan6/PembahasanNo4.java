package day6StringManipulation.latihan6;

import java.util.Scanner;

public class PembahasanNo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan kalimat");
        String kalimat = scanner.nextLine();
        kalimat = kalimat.toUpperCase();
        String[] arrKalimat = kalimat.split(" ");

        for (int i = 0; i < arrKalimat.length; i++) {
            String kata = arrKalimat[i];
            //cetak Awalan
            System.out.println(kata.charAt(0));
            //cetak bintang sesuai panjang kata
            for (int j = 0; j < kata.length(); j++) {
                System.out.println("*");

            }
            //Cetak akhiran
            System.out.println(kata.charAt(kata.length()-1));

        }



    }
}
