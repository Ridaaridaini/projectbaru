package simulasiFT1;

import java.util.Scanner;

public class Soal07 {
    public static void main(String[] args) {
        //Ada berapa banyak bangun persegi dengan panjang sisi n cm
        // yang dapat digunakan untuk membuat sebuah kubus dengan panjang salah satu rusuknya m cm ?
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan panjang sisi persegi : ");
        double n = scanner.nextDouble();

        System.out.print("panjang rusuk kubus: ");
        int m = scanner.nextInt();

        double luasPersegi=n*n;
        System.out.println(luasPersegi);
        double LpKubus;
        LpKubus = 6*m*m;
        System.out.println(LpKubus);
        double banyakPersegi = LpKubus/luasPersegi;
        System.out.println("banyak persegi untuk membuat kubus: " + banyakPersegi);
        double membentukKubus= LpKubus/(luasPersegi*6);
        System.out.println("dapat membentuk sebanyak " + membentukKubus + " kubus");
    }
}
