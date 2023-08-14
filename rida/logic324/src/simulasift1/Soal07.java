package simulasift1;

import java.util.Scanner;

public class Soal07 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Masukkan panjang prsegi");
        double n= input.nextDouble();
        System.out.println("Masukkan panjang salah satu rusuknya: ");
        double m= input.nextDouble();
        double lPersegi=0, lRusuk=0, total=0;
        lPersegi=(n*n)+0.0;
        lRusuk=6.0*(m*m);
        total=lRusuk/lPersegi;
        System.out.println("banyak bangun persegi ialah "+total);
    }
}
