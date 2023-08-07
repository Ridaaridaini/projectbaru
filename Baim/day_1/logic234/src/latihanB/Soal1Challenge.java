package latihanB;

import java.util.Scanner;

public class Soal1Challenge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang bilangan: ");
        int panjang = scanner.nextInt();

        for (int i = panjang; i > 0; i--) {
            if(i%2 == 1){
                System.out.print(i + " ");
            }
        }

        System.out.println();

        for (int i = panjang; i >= 2; i--) {
            if(i%2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
