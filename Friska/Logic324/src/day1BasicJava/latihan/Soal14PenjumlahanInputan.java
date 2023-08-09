package day1BasicJava.latihan;

import java.util.Scanner;

public class Soal14PenjumlahanInputan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Uang 5000: ");
        int uangX = input.nextInt();
        System.out.println("Masukkan Jumlah Uang 10000: ");
        int uangY = input.nextInt();
        System.out.println("Masukkan Jumlah Uang 20000: ");
        int uangZ = input.nextInt();

        input.close();

        int jumlahUang = (5000*uangX) +(10000*uangY)+(20000*uangZ);
        System.out.println("Jumlah Keseluruhan Uang yaitu:"+ jumlahUang);
    }
}
