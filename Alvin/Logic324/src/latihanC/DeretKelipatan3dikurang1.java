package latihanC;

import java.util.Scanner;

public class DeretKelipatan3dikurang1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("n deret: ");
        int deret = scanner.nextInt();

        int[] deretA = new int[deret];
        int[] deretB = new int[deret];

        int nilaiA = 0;
        int nilaiB = 0;
        for (int i = 0; i < deret; i++) {
            deretA[i] = (3*(i+1)-1);
            deretB[i] = -2*(i+1);
        }

        System.out.print("deret kelipatan 3-1: ");
        for (int i = 0; i < deretA.length; i++) {
            System.out.print(deretA[i] + " ");
        }

        System.out.println();

        System.out.print("deret kelipatan (-2)*1: ");
        for (int i = 0; i < deretB.length; i++) {
            System.out.print(deretB[i] + " ");
        }
        System.out.println();

        int[] hasil = new int[deret];
        for (int i = 0; i < deret; i++) {
            hasil[i] = deretA[i] + deretB[i];
            System.out.print(deretA[i] + " + " + deretB[i] + "; ");
        }
        System.out.println();
        for (int i = 0; i < deret; i++) {
            System.out.print(hasil[i] + " ");
        }

    }

}
