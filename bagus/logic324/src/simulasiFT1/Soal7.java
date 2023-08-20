package simulasiFT1;

import java.util.Scanner;

public class Soal7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Panjang n: ");
        int n = input.nextInt();

        System.out.println("Masukan Panjang m: ");
        int m = input.nextInt();

        double persegi = 0;
        double kubus = 0;

        persegi = n * n;
        System.out.println(persegi);

        kubus = 6 * m * m;
        System.out.println(kubus);

        double hasil = 0.0;

        hasil = kubus / persegi;
        System.out.println(hasil);
    }
}
