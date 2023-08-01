package day5.latihan;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Soal09 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int jumlahKecil=0, jumlahBesar=0;
        Integer[] deret= new Integer[5];
        System.out.println("Masukkan nilai dalam deret array: ");
        for (int i = 0; i < deret.length; i++) {
            Integer n= input.nextInt();
            deret[i]=n;
        }
        Arrays.sort(deret);
        for (int i = 0; i < 4; i++) {
            jumlahKecil=jumlahKecil+ deret[i];
        }
        Arrays.sort(deret, Collections.reverseOrder());
        for (int i = 0; i < 4; i++) {
            jumlahBesar=jumlahBesar+ deret[i];
        }
        System.out.println(jumlahKecil +" dan "+jumlahBesar);




    }
}
