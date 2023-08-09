package PR;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        int a = 2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Angka = ");
        int input = scanner.nextInt();

        for (int i = 0; i < input; i++) {
            if (i % 2 == 1) {
                System.out.print("*  ");
            } else {
                System.out.print(a + "  ");
                a = a + 2;
            }
        }
    }
}
