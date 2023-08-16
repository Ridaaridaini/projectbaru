package simulasiFT1;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan panjang deret: ");
        int deret = input.nextInt();
        int [] deretArr = new int[deret];

        System.out.print("a: ");
        int a = input.nextInt();

        System.out.print("b: ");
        int b = input.nextInt();

        int bil = a + b;

        for (int i = 0; i < deret; i++) {
            deretArr[i] = bil;
            System.out.println(deretArr[i]);
            bil = bil + (a+b);

        }
    }
}
