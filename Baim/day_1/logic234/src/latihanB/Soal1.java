package latihanB;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang bilangan: ");
        int panjang = scanner.nextInt();

        for (int i = 0; i <= panjang; i++) {
            if(i%2 == 1){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i = 0; i <= panjang; i++) {
            if(i == 0){
                continue;
            }
            if(i%2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
