package latihan.challenge;

import java.util.Scanner;

public class ChallengeSoal10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang deret: ");
        Integer n = input.nextInt();
        Integer[] deret1 = new Integer[n];
        Integer[] deret2 = new Integer[n];
        Integer[] sum = new Integer[n];
        int a = 2;
        for (int i = 0; i < deret1.length; ) {
            int cek = 0;
            for (int j = 1; j <= a; j++) {
                if (a % j == 0) {
                    cek = cek + 1;
                }
            }
            if (cek == 2) {
                deret1[i] = a;
                i++;
            }
            a++;

        }
        deret2[0] = 1;
        deret2[1] = 1;
        for (int i = 2; i < n; i++) {
            deret2[i] = deret1[i - 1] + deret2[i - 2];

        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            sum[i] = deret1[i] + deret2[i];
            System.out.print(sum[i] + " ");

        }
    }
}
