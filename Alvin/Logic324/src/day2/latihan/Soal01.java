package day2.latihan;

import java.util.Scanner;

public class Soal01 {
    public static void main(String[] args) {
        int x;

        Scanner scanner = new Scanner(System.in);

        System.out.print("masukan angka: ");
        x = scanner.nextInt(); // 15

        scanner.close();

        if (x > 0 && x < 10){
            System.out.println("angka satuan");
        } else if (x >= 10 && x < 100) {
            System.out.println("angka puluhan");
        } else if (x >= 100 && x < 1000) {
            System.out.println("angka ratusan");
        }else {
            System.out.println("input invalid");
        }
    }
}
