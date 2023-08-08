package day7.extra;

import java.util.Scanner;

public class Extra1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan panjang deret: ");
        int n = input.nextInt();
        int a = 2;

        for (int i = 0; i < n; i++) {
            if(i % 2 == 0){
                System.out.print(a);
                a = a+2;
            } else {
                System.out.print(" * ");
            }

        }


    }
}
