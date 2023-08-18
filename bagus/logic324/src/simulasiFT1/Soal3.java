package simulasiFT1;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("input: ");
        int n = input.nextInt();

        int [] fibo = new int[n];
        fibo [0]= 1;
        fibo [1] = 1;

        for (int i = 2; i < fibo.length; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }

        for (int i = 0; i < fibo.length; i++) {
            if (fibo[i] % 2 != 0) {
                System.out.println(fibo[i]);
            }
        }


    }
}
