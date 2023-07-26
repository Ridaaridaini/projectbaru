package day2.latihan;

import java.util.Scanner;

public class Soal03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input Nilai Panjang X : ");
        int panjangX = input.nextInt();
        System.out.println("Input Nilai Lebar X : ");
        int lebarX = input.nextInt();

        if(panjangX >=1 && lebarX >=1){
            int z = panjangX * lebarX;
            System.out.println("luas dari persegi panjang : "+z);
        }else {
            System.out.println(" Input yang anda masukkan salah");
        }
    }
}
