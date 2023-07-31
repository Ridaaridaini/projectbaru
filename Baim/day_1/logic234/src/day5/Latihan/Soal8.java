package day5.Latihan;

import java.util.Scanner;

public class Soal8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang deret: ");
        int panjang = scanner.nextInt();

        int[] genap = new int[panjang];
        int[] ganjil = new int[panjang];
        
        int bilGenap = 0;
        int bilGanjil = 1;

        for (int i = 0; i < panjang; i++) {
            genap[i] = bilGenap;
            ganjil[i] = bilGanjil;
            bilGenap += 2;
            bilGanjil += 2;
        }

        System.out.print("Ganjil: ");

        for (int i = 0; i < ganjil.length; i++) {
            System.out.print(ganjil[i] + " ");
        }

        System.out.println();
        System.out.print("Genap: ");

        for (int i = 0; i < genap.length; i++) {
            System.out.print(genap[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < ganjil.length; i++) {
            int hasil = ganjil[i] + genap[i];
            System.out.println(ganjil[i] + " + " + genap[i] + " = " + hasil );
        }

        for (int i = 0; i < ganjil.length; i++) {
            int hasil = ganjil[i] + genap[i];
            System.out.print(hasil + ", ");
        }
    }
}
