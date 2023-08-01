package day6.latihan6;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("cari karakter: ");

        String kar = input.nextLine();

        String kalimat = "The quick brown fox jumps over lazy dog";

        if (kalimat.contains(kar)) {
            System.out.println("karakter " +kar +" ada di dalam kalimat");
        } else {
            System.out.println("karakter "+ kar+ " tidak ada di dalam kalimat");
        }
    }
}

