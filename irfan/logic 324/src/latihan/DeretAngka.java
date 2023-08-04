package latihan;

import java.util.Scanner;

public class DeretAngka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Panjang deret: ");
        int deret = scanner.nextInt();


        // Membuat deret bilangan ganjil dan genap
        int[] deretGanjil = new int[deret];
        int[] deretGenap = new int[deret];
        int[] jumlah = new int[deret];

        for (int i = 0; i < deret; i++) {
            deretGanjil[i] = 2 * i + 1; // Bilangan ganjil: 2n + 1
            deretGenap[i] = 2 * i;     // Bilangan genap: 2n
        }

        // Menampilkan deret bilangan ganjil dan genap
        System.out.print("Deret ganjil: " + deretGanjil);

        System.out.print("Deret genap: " + deretGenap);

        // Menghitung dan menampilkan hasil penjumlahan sesuai dengan aturan
        System.out.print("Hasil penjumlahan: ");
        for (int i = 0; i < deret; i++) {
            System.out.print(deretGanjil[i] + deretGenap[i]);
            if (i < deret - 1) {
                System.out.print(", ");
            }
        }
        // Metode untuk mencetak array
        for (int i = 0; i < jumlah.length; i++) {
            System.out.print(jumlah[i]);
            if (i < jumlah.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
