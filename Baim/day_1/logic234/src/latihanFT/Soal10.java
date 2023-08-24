package latihanFT;

import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan hari kerja ucup: ");
        int x = scanner.nextInt() + 1;
        System.out.println("Masukkan hari kerja ucup harris: ");
        int y = scanner.nextInt() + 1;

        int nilai = x;

        while (nilai % y != 0) {
            nilai += x;
        }

        System.out.println(nilai);
    }
}
