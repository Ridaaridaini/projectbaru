package day5.latihan;

import java.util.Scanner;

public class Soal05 {

    public static void main(String[] args) {
        boolean value = false;
        int[] arrA = {
                3, 2, 1, 5, 8
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("nilai yang dicari? ");
        int x = scanner.nextInt();

        for (int i = 0; i < arrA.length; i++) {

            if (arrA[i] == x) {
                value = true;
                System.out.println("nilai " + x + " ada dalam deret posisi " + (i + 1));
            }
        }

        if (!value){
            System.out.println("nilai " + x + " tidak ada dalam deret");
        }

    }
}
