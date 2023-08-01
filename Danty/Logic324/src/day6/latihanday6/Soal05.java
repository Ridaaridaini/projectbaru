package day6.latihanday6;

import java.util.Scanner;

public class Soal05 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Cari Karakter ? ");
        String karakter = input.nextLine();

        String kalimat = "The quick brown fox jumps over a lazy dog";

        boolean cari = kalimat.contains(karakter);

        if(cari == true) {
            System.out.print("Karakter " + karakter + " ada dalam kalimat");
        }
        else {
           System.out.print("Karakter " + karakter + " tidak ada dalam kalimat");
        }
        }

    }

