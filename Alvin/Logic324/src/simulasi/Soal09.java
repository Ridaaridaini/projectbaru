package simulasi;

import java.util.Scanner;

public class Soal09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("panjang deret: ");
        int n = scanner.nextInt();

       int deret1 = 0;
       int deret2 = 0;
       int[] arrDeret1 = new int[n];
       int[] arrDeret2 = new int[n];



        for (int i = 0; i < n; i++) {
            deret1 += 3;
            arrDeret1[i] = deret1 - 1;
            System.out.print(arrDeret1[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            deret2 += 4;
            arrDeret2[i] = deret2 / 2;
            System.out.print(arrDeret2[i] + " ");
        }
        System.out.println();
        int[] hasil = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print(arrDeret1[i] + " + " + arrDeret2[i] + "; ");
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            hasil[i] = arrDeret1[i] + arrDeret2[i];
            System.out.print(hasil[i] + " ");
        }

    }

}
