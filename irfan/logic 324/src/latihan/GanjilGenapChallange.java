package latihan;

import java.util.Arrays;
import java.util.Scanner;

public class GanjilGenapChallange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan angka =");
        int n = input.nextInt();

        for (int i = n ; i >= 1; i = i - 2) {
            System.out.print(i+ " ");
        }
        System.out.println();

        for (int i = n-1; i >= 2; i = i - 2) {
            System.out.print(i + " ");
        }
    }
}
