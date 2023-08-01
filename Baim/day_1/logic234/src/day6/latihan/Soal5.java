package day6.latihan;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        String kalimat = "The quick brown fox jumps over a lazy dog";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kata yang ingin dicari: ");
        String inputString = scanner.nextLine();

        boolean adaChar = kalimat.contains(inputString);
        if (adaChar){
            System.out.println("Karakter " + inputString + " Ada di dalam kalimat");
        } else {
            System.out.println("Karakter " + inputString + " Tidak ada di dalam kalimat");
        }

        scanner.close();
    }
}
