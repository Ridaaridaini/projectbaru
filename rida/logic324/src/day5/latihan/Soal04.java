package day5.latihan;

import java.util.Scanner;

public class Soal04 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Input panjang array: ");
        Integer p= input.nextInt();
        int[] arrP= new int[p];
        int j=1;
        for (int i = 0; i < arrP.length; i++) {
            arrP[i]=j;
            System.out.print(arrP[i]+ " ");
            j=j+2;


        }
    }
}
