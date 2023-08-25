package latihanFT;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan a: ");
        int bilA = scanner.nextInt();

        System.out.print("Masukkan bilangan b: ");
        int bilB = scanner.nextInt();

        System.out.print("Masukkan panjang bilangan: ");
        int panjang = scanner.nextInt();
        
        int bil = 0;
        for (int i = 0; i < panjang; i++) {
            System.out.print(bil + ", ");
            bil += bilA + bilB;
        }

        scanner.close();
    }
}
