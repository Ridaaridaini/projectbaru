package latihan;

import java.util.Scanner;

public class soal4 {
    public static void main(String[] args) {
        int z;

        Scanner hitung = new Scanner(System.in);

        System.out.println("masukan x: ");
        Integer x = hitung.nextInt();

        System.out.println("masukan y: ");
        Integer y = hitung.nextInt();

        z = x*y;

        System.out.println("Luas persegi panjang dengan panjang x dan lebar y adalah = " +z);

        hitung.close();
    }
}
