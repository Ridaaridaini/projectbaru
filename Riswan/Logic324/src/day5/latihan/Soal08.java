package day5.latihan;

import java.util.Scanner;

public class Soal08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan panjang Deret : ");
        int panjang = input.nextInt();

        int[] genap = new int[panjang];
        int[] ganjil = new int[panjang];
        ganjil[0] = 0;

        for (int i = 0; i < genap.length; i++) {
            if(i == 0){
                genap[0] = 0;
            }else {
                genap[i] = genap[i-1] + 2;
            }System.out.print(genap[i] +" ");
        }
        System.out.println();
        for (int i = 0; i < ganjil.length; i++) {
            if(i == 0){
                ganjil[0] = 1;
            }else {
                ganjil[i] = ganjil[i-1] + 2;
            }System.out.print(ganjil[i] +" ");
        }
        System.out.println();
        for (int i = 0; i < panjang; i++) {
            if (i == panjang - 1){
                System.out.print(genap[i]+ganjil[i]);
            }else {
                System.out.print(genap[i]+ganjil[i] + ",");
            }
        }
    }
}
