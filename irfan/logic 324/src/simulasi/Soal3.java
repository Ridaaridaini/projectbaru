package simulasi;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("masukkan nilai = ");
        int n = scanner.nextInt();

        int[] arrFibo = new int[n];

        int[] hasil = new int[n];
        arrFibo[0] = 0;
        arrFibo[1] = 1;

        for (int i = 2; i < arrFibo.length; i++) {
            arrFibo[i] = arrFibo[i-2] + arrFibo[i-1];

        }

        for (int i = 0; i < hasil.length; i++) {

            System.out.print(arrFibo[i]+ " ");

        }

    }
}
