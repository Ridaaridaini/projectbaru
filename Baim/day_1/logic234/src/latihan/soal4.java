package latihan;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Panjang Persegi Panjang: ");
        int panjang = input.nextInt();

        System.out.print("Masukkan Lebar Persegi Panjang: ");
        int lebar = input.nextInt();

        input.close();

        int luas = panjang * lebar;

        System.out.println("============================");
        System.out.println("Luas persegi panjang dengan panjang: " + panjang + " dan lebar: " + lebar + " adalah: "
                + luas + "cm^2");
        System.out.println("============================");

    }
}
