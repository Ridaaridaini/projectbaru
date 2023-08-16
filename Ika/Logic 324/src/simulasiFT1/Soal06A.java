package simulasiFT1;

import java.util.Scanner;

public class Soal06A {
    public static void main(String[] args) {
     int pekerja = 5;
     int jam =24;

        Scanner scanner = new Scanner(System.in);

        System.out.print("y: ");
        int jmlPekerjaBaru = scanner.nextInt();
        double jamBekerja = ((double)pekerja/jmlPekerjaBaru)*jam;
        double hariBekerja = jamBekerja/8;
        System.out.println(hariBekerja);

    }
}
