package latihanB;

import java.util.Scanner;

public class Soal3B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("masukan n: ");
        int n = input.nextInt();
        int a = 100;
        int angka = 100;
        int angkaDitemukan = 0;

        while (angkaDitemukan < n) {

            for (; angka > 10; ) {


                String strA = String.valueOf(angka);
                String[] sSplit = strA.split("");

                double hasilTambah = 0;
//                String hasilTambahStr = String.valueOf(hasilTambah);
//                String[] hasilTambahSplit = hasilTambahStr.split("");
//                double hasilTambahTambah = 0;

                for (int i = 0; i < sSplit.length; i++) {
                    int sParsing = Integer.parseInt(sSplit[i]);
                    hasilTambah = hasilTambah + Math.pow(sParsing, 2);
                }
                if (angka == 1){
                    angkaDitemukan++;

                    System.out.println(a +"adalah si angka 1");

                    a++;

                    angka = a;

                    break;

                } else if (angka > 10) {
                    angka = (int) hasilTambah;

                } else {
                    a++;
                    angka = a;
                }

                System.out.println(a);
                System.out.println(hasilTambah);
            }

        }
    }
}

