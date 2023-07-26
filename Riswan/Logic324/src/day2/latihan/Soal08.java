package day2.latihan;

import java.util.Scanner;

public class Soal08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Jumlah uang alfin : ");
        long alfin = input.nextLong();

        if(alfin >= 750000){
            System.out.println( "rekomendasi : Jas" );
        } else if (alfin >= 250000) {
            System.out.println( "rekomendasi : celana panjang" );
        } else if (alfin >= 100000) {
            System.out.println( "rekomendasi : Kemeja" );
        } else if (alfin >= 50000) {
            System.out.println( "rekomendasi : Kaos" );
        } else {
            System.out.println( "Uang anda tidak mencukupi" );
        }
    }
}
