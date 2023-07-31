package day2.latihan;

import java.util.Scanner;

public class Soal01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(" Input User : ");
        int angka = input.nextInt();// 900

        if(angka >=1 && angka <10){// true dan false = false
            System.out.println(" output berupa satuan");
        } else if (angka >=10 && angka <100) {//true dan false = false
            System.out.println(" output berupa puluhan");
        } else if (angka >=100 && angka <1000) {//true dan true = true
            System.out.println(" output berupa ratusan");
        }
    }
}
