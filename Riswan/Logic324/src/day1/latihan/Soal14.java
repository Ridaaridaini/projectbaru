package day1.latihan;

import java.util.Scanner;

public class Soal14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("jumlah pecahan 10000 : ");
        int a = input.nextInt();
        System.out.print("jumlah pecahan 5000 : ");
        int b = input.nextInt();
        System.out.print("jumlah pecahan 2000 : ");
        int c = input.nextInt();
        int jumlah = (a * 10000) + (b * 5000) + (c * 2000);

        System.out.print("Jumlah : " + jumlah);
    }
}
