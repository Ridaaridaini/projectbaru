package latihanC;

import java.util.Scanner;

public class Nomor6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("n: ");
        int n = scanner.nextInt();

        int angka = 0;
        for (int i = 0; i < n;) {
            if (angka%2==0 && angka>0){
                System.out.print(angka + " ");
                i++;
            }
            angka = angka + 3;
        }

    }

}
