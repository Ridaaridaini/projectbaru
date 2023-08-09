package latihanekstra;

import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan panjang angka: ");
        int panjang = scanner.nextInt();
        int[] deret = new int[panjang];

        int bil = 0;
        int i = 0;
        while (i < panjang) {
            bil += 3;
            if (bil % 2 == 0) {
                deret[i] = bil;
                i++;
            }
        }

        for (int j = 0; j < deret.length; j++) {
            System.out.print(deret[j] + ", ");
        }
    }
}
