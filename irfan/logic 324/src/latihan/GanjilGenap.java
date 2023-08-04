package latihan;

import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan angka =");
        int n = input.nextInt();

        for (int i = 1; i <= n; i = i + 2) {
            System.out.print(i + "");
        }
        System.out.println();

        for (int i = 2; i <= n; i = i + 2) {
            System.out.print(i + "");
        }
    }
}
