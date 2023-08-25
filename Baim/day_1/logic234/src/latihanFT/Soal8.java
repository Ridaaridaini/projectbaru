package latihanFT;

import java.util.Scanner;

public class Soal8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String[] nama = scanner.nextLine().split(" ");
        int[] nilai = new int[nama.length];

        for (int i = 0; i < nama.length; i++) {
            System.out.print("Masukkan nilai " + nama[i] + ": ");
            nilai[i] = scanner.nextInt();
        }

        for (int j = 0; j < nilai.length; j++) {
            if (nama[j].equalsIgnoreCase("andi")) {
                if (nilai[j] == 85) {
                    System.out.print("true ");
                } else {
                    System.out.print("false ");
                }
            } else if (nama[j].equalsIgnoreCase("budi")) {
                if (nilai[j] == 70) {
                    System.out.print("true ");
                } else {
                    System.out.print("false ");
                }
            } else if (nama[j].equalsIgnoreCase("cindy")) {
                if (nilai[j] == 90) {
                    System.out.print("true ");
                } else {
                    System.out.print("false ");
                }
            } else if (nama[j].equalsIgnoreCase("dedi")) {
                if (nilai[j] == 75) {
                    System.out.print("true ");
                } else {
                    System.out.print("false ");
                }
            } else if (nama[j].equalsIgnoreCase("eki")) {
                if (nilai[j] == 100) {
                    System.out.print("true ");
                } else {
                    System.out.print("false ");
                }
            }
        }
    }
}
