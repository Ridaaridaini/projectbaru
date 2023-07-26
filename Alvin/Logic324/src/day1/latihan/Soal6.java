package day1.latihan;

import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        int x, y;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Panjang sisi persegi: ");
        x = scanner.nextInt();

        System.out.print("Panjang sama kaki segitiga siku-siku: ");
        y = scanner.nextInt();

        scanner.close();

        float luasPersegi = x * x;

        float luasSegitigaSikuSamaKaki = (y * y)/2;

        System.out.println("Luas persegi: "+luasPersegi);
        System.out.println("Luas segitiga siku sama kaki: "+luasSegitigaSikuSamaKaki);

        boolean perbandingan = luasPersegi == luasSegitigaSikuSamaKaki;

        System.out.println("Luasnya sama? : " + perbandingan);
    }
}
