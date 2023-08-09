package latihanekstra;

import java.util.Scanner;

public class Soal21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        String[] bilangan = scanner.nextLine().split(" ");
        int[] angka = new int[bilangan.length];

        for (int i = 0; i < angka.length; i++) {
            angka[i] = Integer.parseInt(bilangan[i]);
        }

        for (int i = 0; i < angka.length; i++) {
            
        }


    }
}
