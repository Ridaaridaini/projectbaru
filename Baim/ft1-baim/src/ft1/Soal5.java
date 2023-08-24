package ft1;

import java.util.Random;
import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randomGenerator = new Random();

        System.out.print("Masukkan jumlah penduduk: ");
        int penduduk = scanner.nextInt();
        System.out.print("Masukkan Jumlah Calon: ");
        int calon = scanner.nextInt();
        int[] suara = new int[calon];
        int a = penduduk;

        int totalSuara = 0;

        for (int i = 0; i < suara.length; i++) {
            suara[i] = randomGenerator.nextInt(a);
            a = a - suara[i];
        }

        for (int i = 0; i < suara.length; i++) {
            totalSuara += suara[i];
            float persenSuara = ((float) suara[i] / penduduk) * 100f;
            System.out.println("Calon ke-" + (i + 1) + " Jumlah Suara: " + suara[i] + " Suara " + persenSuara + "%");
            if (i + 1 == calon) {
                System.out.println("Golput: " + (penduduk - totalSuara) + " Suara " + persenSuara + "%");
            }
        }

    }
}
