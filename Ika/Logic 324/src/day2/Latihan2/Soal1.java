package day2.Latihan2;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        //Diketahui x sebuah angka inputan user dengan range 1 <= x <= 999.
        //Buatlah program untuk mendeteksi apakah angka yang diinputkan user berupa satuan,
        // puluhan, ratusan atau input tidak valid.

        Scanner scan = new Scanner(System.in);
        System.out.print("masukan angka 1-999: ");
        int x = scan.nextInt();

        if( x >=1 && x <=9){
            System.out.println("angka " + x+ " adalah satuan");
        } else if (x>= 10 && x<100){
            System.out.println("angka " + x+ " adalah puluhan");
        } else if (x>=100 && x<1000) {
            System.out.println("angka " + x + " adalah ratusan");
        }else{
            System.out.println("angka " + x+ " tidak valid");
        }

        scan.close();
        System.out.println(" akhir dari program");

    }
}
