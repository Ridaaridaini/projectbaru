package day1.latihan;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai x: ");
        int x = input.nextInt();

        System.out.println("Masukkan y: ");
        int y = input.nextInt();

        input.close();

        int mod = x%y;
        int bagi = x/y;
        System.out.println("Hasil sisa bagi dari bilangan x dan y adalah :"+mod);
        System.out.println("Hasil bagi Pembagian dari bilangan x dan y adalah:"+bagi);


    }
}
