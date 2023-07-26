package latihan;

import java.util.Scanner;

public class Soal14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int uang1 = 5000;
        int uang2 = 10000;
        int uang3 = 20000;

        System.out.println("Program Menghitung Uang");

        System.out.print("Jumlah lembar uang Rp. 5.000: ");
        int uangIn1 = scanner.nextInt() * uang1;

        System.out.print("Jumlah lembar uang Rp. 10.000: ");
        int uangIn2 = scanner.nextInt() * uang2;

        System.out.print("Jumlah lembar uang Rp. 20.000: ");
        int uangIn3 = scanner.nextInt() * uang3;

        scanner.close();
        int hasilUang = uangIn1 + uangIn2 + uangIn3;
        System.out.println("=================================");

        System.out.println("Jumlah uang yang kamu punya adalah: " + hasilUang);

    }
}
