package day1BasicJava.latihan;

import java.util.Scanner;

public class Soal14PenjumlahanInputan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Uang Pecahan Pertama: ");
        int uangX = input.nextInt();
        System.out.println("Masukkan Jumlah Uang Pecahan Kedua: ");
        int uangY = input.nextInt();
        System.out.println("Masukkan Jumlah Uang Pecahan Ketiga: ");
        int uangZ = input.nextInt();

        input.close();

        int jumlahUangPecahan = uangX+uangY+uangZ;
        System.out.println("Jumlah Keseluruhan Uang Pecahan yaitu:"+ jumlahUangPecahan);
    }
}
