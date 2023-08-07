package day2Percabangan.latihan2;

import java.util.Scanner;

public class Soal4KondisiBilanganGanjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan nilai bilangan :");
        int bilangan = input.nextInt();

        if (bilangan % 2 == 0){
            System.out.println("Bilangan tersebut adalah bilangan genap");
        }
        else{
            System.out.println("Bilangan tersebut adalah bilangan ganjil");
        }
    }
}
