package Extra;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan angka =");
        int n = input.nextInt();

        System.out.print("Bilangan Genap = ");
        for (int i = 0; i <= n; i = i + 2 ) {
            System.out.print(i+ " ");
        }
        System.out.println();

        System.out.print("Bilangan Ganjil = ");
        for (int i = 1; i <= n; i = i + 2) {
            System.out.print(i+ " ");
        }
    }
}
