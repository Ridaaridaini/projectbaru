package day3.latihan;

import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan panjang deret bilangan: ");
        int bilangan = scanner.nextInt();
        scanner.close();

        int a = 3;
        for (int i = 0; i < bilangan; i++) {

            if(bilangan%2 == 0){
                if(i == (bilangan / 2)-1){
                    System.out.print("xxx ");
                    a *= 3;
                    continue;
                } else if(i == (bilangan / 2)){
                    System.out.print("xxx ");
                    a *= 3;
                    continue;
                }
            } else {
                if(i == (bilangan/2)){
                    System.out.print(" xxx ");
                    a *= 3;
                    continue;
                }
            }

            System.out.print(a + " ");
            a *= 3;
        }

    }
}
