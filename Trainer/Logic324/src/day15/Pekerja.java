package day15;

import java.util.Scanner;

public class Pekerja {

    public static void main(String[] args) {

        int pekerja = 5;
        int jam = 24;

        Scanner scanner = new Scanner(System.in);

        System.out.print("y : ");
        int jmlPekerjaBaru = scanner.nextInt();
        double jamBekerja = ((double)pekerja/jmlPekerjaBaru) * jam;
        double haribekerja = jamBekerja / 8;
        System.out.println(haribekerja);
    }
}
