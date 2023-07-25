package day1.latihan;

import java.util.Scanner;

public class Soal14 {
    public static void main(String[] args) {
    int jmlhPecahanSepuluh, jmlhPecahanLima, jmlhPecahanDuaPuluh;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Pecahan 5rb: ");
        jmlhPecahanLima = scanner.nextInt();

        System.out.print("Pecahan 10rb: ");
        jmlhPecahanSepuluh = scanner.nextInt();

        System.out.print("Pecahan 20rb: ");
        jmlhPecahanDuaPuluh = scanner.nextInt();

        scanner.close();

        System.out.println("Total uang: Rp." + ((jmlhPecahanLima*5000) + (jmlhPecahanSepuluh*10000) + (jmlhPecahanDuaPuluh*20000)) + ",00.");
    }
}
