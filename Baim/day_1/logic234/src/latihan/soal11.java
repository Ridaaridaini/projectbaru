package latihan;

import java.util.Scanner;

public class Soal11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int x = input.nextInt();

        System.out.print("Masukkan angka pangkat: ");
        int y = input.nextInt();

        double hasil = Math.pow(x, y);


        input.close();

        System.out.println("===================");
        System.out.println("Hasil pangkat bilangan " + x + "^" + y + "adalah: " + hasil);
        System.out.println("===================");
    }
}
