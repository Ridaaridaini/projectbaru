package day1.latihan;

import java.util.Scanner;

public class Soal14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hasil;
        System.out.print("Masukkan jumlah uang sepuluh ribu= ");
        Integer x= input.nextInt();
        System.out.print("Masukkan jumlah uang lima ribu=");
        Integer y= input.nextInt();
        System.out.print("Masukkan jumlah uang dua puluh ribu=");
        Integer z= input.nextInt();
        hasil = (10000 *x)+(5000*y)+(20000*z);
        System.out.println("Jumlah uang yang anda miliki= "+hasil);



    }
}
