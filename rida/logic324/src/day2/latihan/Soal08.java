package day2.latihan;

import java.util.Scanner;

public class Soal08 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Masukkan jumlah uang= ");
        Integer x = input.nextInt();
        if (x>=750000){
            System.out.println("jas");
        } else if (x>=250000 && x<750000) {
            System.out.println("Celana Panjang");
            
        } else if (x>=100000 && x<250000) {
            System.out.println("Kemeja");
            
        } else if (x>=50000 && x<100000) {
            System.out.println("Kaos");
            
        }
    }
}
