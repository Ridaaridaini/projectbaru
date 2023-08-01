package day5.latihan5;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai yang dicari:");
        int cari = input.nextInt();
        int berhenti = 0;
        int[] arrA = {3, 2, 1, 5, 8};
        for (int i = 0; i < arrA.length; i++) {
//            iwhile (asumsi) {
            if (cari == arrA[i]) {// input : 9 gak ada
                System.out.println("Nilai " + cari + " ada dalam deret " + i);
                berhenti = berhenti+1;
                break;

            }

        }
        if (berhenti == 0){
                System.out.println("Nilai " + cari + " tidak ada dalam deret");}

    }
}



