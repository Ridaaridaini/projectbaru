package day6.latihan;

import java.util.Scanner;

public class Soal05 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String kalimat="The quick brown fox jumps over a lazy dog";
        System.out.println("Cari karakter: ");
        String karakter= input.nextLine();
        if (kalimat.contains(karakter)){
            System.out.println("Karakter "+karakter+" ada dalam kalimat");
        }else
            System.out.println("Karakter "+karakter+" tidak ada dalam kalimat");
    }
}
