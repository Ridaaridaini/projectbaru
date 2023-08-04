package latihanB;

import java.util.Scanner;

public class Soal3C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukan n: ");
        int n = input.nextInt();
        int angka = 0;
        int start = 100;
        double hasilTambah = 0;
        int hasilTambahTambah = 0;
        String hasilTambahStr = String.valueOf(hasilTambah);
        String[] hasilTambahSplit = hasilTambahStr.split("");
        String strA = String.valueOf(start);
        String[] sSplit = strA.split("");


        while (angka < n){
            for (int i = 0; i < sSplit.length; i++) {
                int sParsing = Integer.parseInt(sSplit[i]);
                hasilTambah = hasilTambah + Math.pow(sParsing,2);
            }
            start = (int) hasilTambah;
            System.out.println(start);
            System.out.println(hasilTambah);
        }
    }
}
