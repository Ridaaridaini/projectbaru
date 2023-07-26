package latihan;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan angka pertama: ");
        int x = input.nextInt();

        System.out.print("Masukan angka kedua: ");
        int y = input.nextInt();

        input.close();

        int hasil = x%y;
        System.out.println("===============================");
        System.out.println("Hasil modulus dari bilangan " + x + " dan " + y + " adalah: " + hasil);
    }
}
