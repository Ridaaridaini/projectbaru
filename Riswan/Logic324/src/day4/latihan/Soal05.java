package day4.latihan;

import java.util.Scanner;

public class Soal05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Nilai X : ");
        int x = input.nextInt();

        for (int i = 1; i <=x ; i++) {
            if(i%6==0){
                System.out.print( i +" ");
            }
        }
    }
}
