package day6.latihan6;

import java.util.Scanner;

public class Soal5CariKarakter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan huruf yang dicari:");
        String cariHuruf = input.next();
        String kalimat = "The quick brown fox jumps over a lazy dog";

        boolean tampung = kalimat.contains(cariHuruf);
        if(tampung == true){
            System.out.println("karakter "+cariHuruf+" ada dalam kalimat");
        }else{
            System.out.println("karakter "+cariHuruf+ " tidak ada dalam kalimat ");
        }





    }
}
