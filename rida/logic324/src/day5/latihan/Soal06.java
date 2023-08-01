package day5.latihan;

import java.util.Scanner;

public class Soal06 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] deret= {1,2,3,4,5,6,7};
        int n=3;
        int jumlah=0;
        System.out.println("hitung jumlah elemen index ke: ");
        for (int i = 0; i < n; i++) {
            Integer m= input.nextInt();
            input.nextLine();
            jumlah= jumlah + deret[m];
        }
        System.out.println("Total "+jumlah);

    }
}
