package day8.lembar2;

import java.util.Scanner;

public class Soal01Chalange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Nilai n : ");
        int n = input.nextInt();
        int[] ganjil = new int[n];
        int[] genap = new int[n];

        for (int i = n; i >= 1; i--) {
            if(i%2==1){
                System.out.print(i+" ");
                ganjil[i-1] = i;
            }
        }
        System.out.println();
        for (int i = n; i >= 1; i--) {
            if(i%2==0){
                System.out.print(i+" ");
                genap[i-1] = i;
            }
        }
    }
}
