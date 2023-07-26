package day2;

import java.util.Scanner;

public class PercabanganIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Masukkan  nilai a : ");
        int a = input.nextInt();

        if (a < 4) {
            System.out.println("lebih kecil dari 4");
        } else if (a <= 5) {
            System.out.println("bilangan kurang dari 5 sama dengan 5");
        } else {
            System.out.println("inputan anda salah");
        }
    }
}
