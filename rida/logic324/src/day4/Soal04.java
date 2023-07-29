package day4;

import java.util.Scanner;

public class Soal04 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Angka ganjil genap");
        System.out.print("masukkan nilai n: ");
        Integer n= input.nextInt();
        for (int i = 0; i < n+1 ; i++) {
            if (i!= 0 && i%2==1){
                System.out.print(i+ " ");
                continue;
            }
        }
        System.out.println();
        for (int i = 0; i < n+1; i++) {
            if (i!= 0 && i%2==0){
                System.out.print(i+ " ");
                continue;


        }

            
        }

    }
}
