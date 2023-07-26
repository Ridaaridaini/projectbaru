package day1.latihan;

import java.util.Scanner;

public class Soal14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("jumlah pecahan 10000 : ");
        long a = input.nextInt();
        System.out.print("jumlah pecahan 5000 : ");
        long b = input.nextInt();
        System.out.print("jumlah pecahan 20000 : ");
        long c = input.nextInt();
        long jumlah = (a * 10000) + (b * 5000) + (c * 20000);

        System.out.print("Jumlah : " + jumlah);
    }
}
